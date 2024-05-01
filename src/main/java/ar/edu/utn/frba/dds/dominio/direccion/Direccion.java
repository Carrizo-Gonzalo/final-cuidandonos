package ar.edu.utn.frba.dds.dominio.direccion;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Direccion {
    private String calle;
    private Integer altura;
    private String barrio;
    private String depto;
    private Integer piso;
    private Comuna comuna;

    public Direccion(String calle, Integer altura, String barrio, String depto, Integer piso, Comuna comuna) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
        this.depto = depto;
        this.piso = piso;
        this.comuna = comuna;
    }
}
