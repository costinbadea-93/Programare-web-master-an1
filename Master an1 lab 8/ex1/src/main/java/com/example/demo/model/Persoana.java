package com.example.demo.model;

public class Persoana {
    private int idPersoana;
    private String numePersoana;
    private String prenumePersoana;

    public Persoana(){}

    public Persoana(int idPersoana, String numePersoana, String prenumePersoana) {
        this.idPersoana = idPersoana;
        this.numePersoana = numePersoana;
        this.prenumePersoana = prenumePersoana;
    }

    public int getIdPersoana() {
        return idPersoana;
    }

    public void setIdPersoana(int idPersoana) {
        this.idPersoana = idPersoana;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public String getPrenumePersoana() {
        return prenumePersoana;
    }

    public void setPrenumePersoana(String prenumePersoana) {
        this.prenumePersoana = prenumePersoana;
    }
}
