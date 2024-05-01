package ar.edu.utn.frba.dds.calculadoras.tests.tests;

import ar.edu.utn.frba.dds.dominio.Persona;
import ar.edu.utn.frba.dds.dominio.direccion.Comuna;
import ar.edu.utn.frba.dds.dominio.direccion.Direccion;
import ar.edu.utn.frba.dds.dominio.Trayecto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.mockito.Mockito.*; /*Importamos todos los metodos estaticos*/
public class calculadoras {

    Comuna comuna1 = new Comuna(1);
    Comuna comuna5 = new Comuna(5);
    Direccion obelisco = new Direccion("Avenida Corrientes", 1051, "San Nicolas", null, null, comuna1);
    Direccion medrano = new Direccion("avenida Medrano", 951, "Almagro", null, null, comuna5);



}
