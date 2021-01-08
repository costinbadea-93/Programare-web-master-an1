package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;

@Repository
public class MainRepository {
    private static final String ADD_EMPLOYEE = "INSERT into Employee(id, firstName, lastName) values (null, ?, ?)";
    private static final String DELETE_EMPLOYEES = "DELETE FROM Employee";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Employee addNewEmployee(Employee employee) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_EMPLOYEE, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,employee.getFirstName());
            preparedStatement.setString(2,employee.getLastName());
            return preparedStatement;
        }, keyHolder);

        employee.setId(keyHolder.getKey().intValue());
        return employee;
    }

    public void deleteEmployee() {
        jdbcTemplate.execute(DELETE_EMPLOYEES);
    }
}
