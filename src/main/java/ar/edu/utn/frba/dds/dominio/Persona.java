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

    public Persona(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, Boolean sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
}