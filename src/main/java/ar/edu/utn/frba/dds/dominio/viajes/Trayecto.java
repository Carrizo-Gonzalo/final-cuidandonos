package ar.edu.utn.frba.dds.dominio.viajes;

import ar.edu.utn.frba.dds.dominio.Persona;
import ar.edu.utn.frba.dds.dominio.reacciones.Reaccion;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Trayecto {
    private String nombre;
    private List<Persona> cuidadores;
    private Persona transeunte;
    private Double tiempoDemoraEnMinutos;
    private Double distanciaTotal;
    private Boolean finalizado;
    private List<Reaccion> reacciones;
    private LocalDateTime fechaYHoraInicio;
    private List<Parada> paradas;
    private Boolean transeunteSeQuedaEnParadas;

    public Trayecto() {
        this.cuidadores = new ArrayList<>();
        this.reacciones = new ArrayList<>();
    }

    public void agregarCuidadores(Persona ... personas) {
        Collections.addAll(this.cuidadores, personas);
    }

    public void agregarReacciones(Reaccion... reacciones) {
        Collections.addAll(this.reacciones, reacciones);
    }

    public Boolean puedeComenzar() {
        return !this.cuidadores.isEmpty();
    }

    public void calcularDistancia() {
        this.distanciaTotal = this.paradas.stream()
                .mapToDouble(Parada::getDistanciaSiguienteParada).sum();
    }

    public void calcularTiempoDeDemoraEnMinutos() {

        this.tiempoDemoraEnMinutos = this.paradas.stream()
                .mapToDouble(Parada::getTiempoDeDemoraTotalALaSiguienteParada).sum();
    }

    public void reaccionarPorIncidente() {

        this.ordenarListaDeReacciones();

        if(!this.reacciones.isEmpty()) {
            int tamanioLista = this.reacciones.size();
            reacciones.get(0).accionar();
            for(int i = 1; i < tamanioLista && reacciones.get(i-1).fallo(); i++) {
                Reaccion reaccion = this.reacciones.get(i);
                reaccion.accionar();
            }
        }
    }

    private void ordenarListaDeReacciones() {
        this.reacciones = this.reacciones.stream()
                .sorted(Comparator.comparingInt(Reaccion::getNumeroDeOrden))
                .collect(Collectors.toList());
    }

    public Trayecto(String nombre, Persona transeunte, List<Reaccion> reacciones, List<Parada> paradas, Boolean transeunteSeQuedaEnParadas) {
        this.nombre = nombre;
        this.transeunte = transeunte;
        this.reacciones = reacciones;
        this.paradas = paradas;
        this.transeunteSeQuedaEnParadas = transeunteSeQuedaEnParadas;
    }
}
