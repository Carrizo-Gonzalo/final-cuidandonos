package ar.edu.utn.frba.dds.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolicitudDeCuidado {
    private Trayecto trayecto;
    private Boolean estaAceptada;
    private Persona cuidador;
}
