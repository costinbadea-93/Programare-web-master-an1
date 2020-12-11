package com.example.demo.model;

public class PersoanaComanda {
    private String numeComanda;
    private String pretComanda;
    private String numePersoana;
    private String prenumePersoana;

    public PersoanaComanda(){}

    public PersoanaComanda(String numeComanda, String pretComanda, String numePersoana, String prenumePersoana) {
        this.numeComanda = numeComanda;
        this.pretComanda = pretComanda;
        this.numePersoana = numePersoana;
        this.prenumePersoana = prenumePersoana;
    }

    public String getNumeComanda() {
        return numeComanda;
    }

    public void setNumeComanda(String numeComanda) {
        this.numeComanda = numeComanda;
    }

    public String getPretComanda() {
        return pretComanda;
    }

    public void setPretComanda(String pretComanda) {
        this.pretComanda = pretComanda;
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
