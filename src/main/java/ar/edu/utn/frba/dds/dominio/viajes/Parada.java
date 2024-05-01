package ar.edu.utn.frba.dds.dominio.viajes;

import ar.edu.utn.frba.dds.dominio.adapters.CalculadorDeTiempoDeDemoraAdapter;
import ar.edu.utn.frba.dds.dominio.adapters.CalculadorDeDistanciaAdapter;
import ar.edu.utn.frba.dds.dominio.direccion.Direccion;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Parada {
    private Direccion direccion;
    private Double tiempoDeDemoraTotalALaSiguienteParada;
    private Double tiempoDeDemoraEnParada;
    private Double distanciaSiguienteParada;
    private LocalDateTime fechaHoraSalida;
    private Parada proximaParada;
    private Integer numeroDeParada;
    private LocalDateTime fechaHoraDeLlegadaReal;
    private CalculadorDeDistanciaAdapter calculadorDeDistancia;
    private CalculadorDeTiempoDeDemoraAdapter calculadorDeTiempoDeDemora;

    public void calcularTiempoDeDemoraEnMinutos(){
        this.tiempoDeDemoraTotalALaSiguienteParada = this.calculadorDeTiempoDeDemora.calcularTiempoDeDemora(distanciaSiguienteParada);
        this.tiempoDeDemoraTotalALaSiguienteParada += this.tiempoDeDemoraEnParada;
    }
    public void calcularDistancia(){
        this.distanciaSiguienteParada = this.calculadorDeDistancia.calcularDistancia(direccion, proximaParada.getDireccion());
    }

    public Parada(Direccion direccion, Double tiempoDeDemoraEnParada, Parada proximaParada, Integer numeroDeParada) {
        this.direccion = direccion;
        this.tiempoDeDemoraEnParada = tiempoDeDemoraEnParada;
        this.proximaParada = proximaParada;
        this.numeroDeParada = numeroDeParada;
    }
}
