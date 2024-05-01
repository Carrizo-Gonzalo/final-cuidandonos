package ar.edu.utn.frba.dds.dominio.direccion;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Comuna {
    private Integer numeroDeComuna;

    public Comuna(Integer numeroDeComuna) {
        this.numeroDeComuna = numeroDeComuna;
    }
}
