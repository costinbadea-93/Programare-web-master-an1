package com.example.demo.querys;

public class Querys {
    public final static String GET_PERSOANE_SQL = "select * from persoana";
    public final static String ADAUGA_PERSOANA ="INSERT INTO persoana(idPersoana,numePersoana,prenumePersoana) values (null,?,?)";
    public final static String DELETE_PERSOANA ="DELETE FROM persoana where idPersoana = ?";
    public final static String COMANDA_PERSOANA ="select c.numeComanda, c.pretComanda," +
            " p.numePersoana, p.prenumePersoana\n" +
            "from demo.comanda c inner join demo.persoana p\n" +
            "on c.idPersoana = p.idPersoana";
}
