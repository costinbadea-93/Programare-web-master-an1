package masteran1lab3ex1.masteran1lab3ex1.model;

import javax.validation.constraints.NotEmpty;

public class Persoana {

    @NotEmpty
    private String nume;
    @NotEmpty(message = "This field(prenume) can not be empty")
    private String prenume;
    @NotEmpty(message = "This field(varsta) can not be empty")
    private String varsta;

    public Persoana(){}

    public Persoana(String nume, String prenume, String varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
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
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta='" + varsta + '\'' +
                '}';
    }
}
