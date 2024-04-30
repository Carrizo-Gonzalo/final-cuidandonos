package ar.edu.utn.frba.dds.dominio;

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
}
