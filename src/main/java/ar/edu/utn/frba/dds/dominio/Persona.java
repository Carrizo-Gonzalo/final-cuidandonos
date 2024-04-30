package ar.edu.utn.frba.dds.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDate fechaNacimiento;
    private Boolean sexo;
}