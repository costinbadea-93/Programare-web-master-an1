package model;

public class Persoana {
    private String name;
    private String varsta;

    public Persoana(String name, String varsta) {
        this.name = name;
        this.varsta = varsta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", varsta='" + varsta + '\'' +
                '}';
    }
}
