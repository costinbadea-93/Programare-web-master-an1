package com.example.demo.repository;

import com.example.demo.model.Persoana;
import com.example.demo.model.PersoanaComanda;
import com.example.demo.querys.Querys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MainRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Persoana> getPersoane() {
//      List<Persoana> people = jdbcTemplate.query(Querys.GET_PERSOANE_SQL, (resultSet, i) ->  new Persoana(
//                    resultSet.getInt("idPersoana"),
//                    resultSet.getString("numePersoana"),
//                    resultSet.getString("prenumePersoana")
//            ));
        List<PersoanaComanda> persoanaComandas = getPersoanaComanda();
        return jdbcTemplate.query(Querys.GET_PERSOANE_SQL, new BeanPropertyRowMapper<>(Persoana.class));
    }

    public List<Persoana> adaugaPersoana(Persoana p) {
        jdbcTemplate.update(Querys.ADAUGA_PERSOANA, p.getNumePersoana(), p.getPrenumePersoana());
        return jdbcTemplate.query(Querys.GET_PERSOANE_SQL, new BeanPropertyRowMapper<>(Persoana.class));
    }

    public List<PersoanaComanda> getPersoanaComanda() {
//      List<Persoana> people = jdbcTemplate.query(Querys.GET_PERSOANE_SQL, (resultSet, i) ->  new Persoana(
//                    resultSet.getInt("idPersoana"),
//                    resultSet.getString("numePersoana"),
//                    resultSet.getString("prenumePersoana")
//            ));
        return jdbcTemplate.query(Querys.COMANDA_PERSOANA, new BeanPropertyRowMapper<>(PersoanaComanda.class));
    }

    public List<Persoana> deletePeroanaById(int id) {
        jdbcTemplate.update(Querys.DELETE_PERSOANA,id);
        return jdbcTemplate.query(Querys.GET_PERSOANE_SQL, new BeanPropertyRowMapper<>(Persoana.class));
    }

//    public class PeopleRowMapper implements RowMapper<Persoana>{
//        @Override
//        public Persoana mapRow(ResultSet resultSet, int i) throws SQLException {
//            return new Persoana(
//                    resultSet.getInt("idPersoana"),
//                    resultSet.getString("numePersoana"),
//                    resultSet.getString("prenumePersoana")
//            );
//        }
//    }
}
