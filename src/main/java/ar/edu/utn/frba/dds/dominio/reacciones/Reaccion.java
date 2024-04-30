package ar.edu.utn.frba.dds.dominio.reacciones;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Reaccion {
    private Integer numeroDeOrden;

    public abstract void accionar();
    public abstract Boolean fallo();
}
