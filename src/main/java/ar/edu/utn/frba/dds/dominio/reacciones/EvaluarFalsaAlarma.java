package ar.edu.utn.frba.dds.dominio.reacciones;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EvaluarFalsaAlarma extends Reaccion {
    private Double minutosAEsperar;

    @Override
    public void accionar() {

    }

    @Override
    public Boolean fallo() {
        return null;
    }
}
