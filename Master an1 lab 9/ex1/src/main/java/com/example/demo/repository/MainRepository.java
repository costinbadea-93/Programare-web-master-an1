package com.example.demo.repository;

import com.example.demo.model.Employee;
import com.example.demo.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MainRepository {

    private static final String ADD_EMPLOYEE_SQL_JDBC = "INSERT INTO employee(id, firstName, lastName) VALUES(null, ?, ?)";
    private static final String ADD_EMPLOYEE_SQL_NAMED_JDBC = "INSERT INTO employee(id, firstName, lastName) VALUES(:id, :firstName, :lastName)";
    private static final Logger LOGGER = LoggerFactory.getLogger(MainRepository.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void add10Employees(){
        for(int i = 0; i < 10 ; i ++) {
            Employee employee = new Employee("firstName" + i, "lastName" + i);
            //caz1
//          jdbcTemplate.update(ADD_EMPLOYEE_SQL_JDBC, employee.getFirstName(), employee.getLastName());

            //caz2
//            PreparedStatementCreator preparedStatementCreator = connection -> {
//                PreparedStatement preparedStatement = connection.prepareStatement(ADD_EMPLOYEE_SQL_JDBC, Statement.RETURN_GENERATED_KEYS);
//                preparedStatement.setString(1, employee.getFirstName());
//                preparedStatement.setString(2, employee.getLastName());
//                return preparedStatement;
//            };
//            GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
//            jdbcTemplate.update(preparedStatementCreator, generatedKeyHolder);
//            LOGGER.info("============================" + generatedKeyHolder.getKey().intValue() + "================================");

            //caz3 PICA!!!!!!!
//            GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
//            jdbcTemplate.update(ADD_EMPLOYEE_SQL_JDBC, employee.getFirstName(), employee.getLastName(), generatedKeyHolder);


            //caz4
            GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
            Map<String, String> parameters = new HashMap<>();
            parameters.put("id", null);
            parameters.put("firstName", employee.getFirstName());
            parameters.put("lastName", employee.getLastName());
            SqlParameterSource  sqlParameterSource = new MapSqlParameterSource(parameters);
            namedParameterJdbcTemplate.update(ADD_EMPLOYEE_SQL_NAMED_JDBC, sqlParameterSource, generatedKeyHolder);
            LOGGER.info("============================" + generatedKeyHolder.getKey().intValue() + "================================");

            //ACID(atomic, consistent, isolated, durability)

            if(i == 5) {
                throw new RuntimeException(":(");
            }
        }
    }
}
