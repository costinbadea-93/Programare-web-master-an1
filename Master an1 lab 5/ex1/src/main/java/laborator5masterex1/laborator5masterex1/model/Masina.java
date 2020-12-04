package laborator5masterex1.laborator5masterex1.model;

import lombok.*;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class Masina {
    private String marca;
    private String culoare;
    private String taraDeProvenienta;

    public Masina(String marca, String culoare, String taraDeProvenienta) {
        this.marca = marca;
        this.culoare = culoare;
        this.taraDeProvenienta = taraDeProvenienta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getTaraDeProvenienta() {
        return taraDeProvenienta;
    }

    public void setTaraDeProvenienta(String taraDeProvenienta) {
        this.taraDeProvenienta = taraDeProvenienta;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                ", taraDeProvenienta='" + taraDeProvenienta + '\'' +
                '}';
    }
}
