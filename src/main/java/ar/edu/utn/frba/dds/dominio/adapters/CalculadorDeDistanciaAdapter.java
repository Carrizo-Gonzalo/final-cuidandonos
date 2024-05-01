package ar.edu.utn.frba.dds.dominio.adapters;

import ar.edu.utn.frba.dds.dominio.direccion.Direccion;

public interface CalculadorDeDistanciaAdapter {
    public Double calcularDistancia(Direccion direccion1, Direccion direccion2);
}