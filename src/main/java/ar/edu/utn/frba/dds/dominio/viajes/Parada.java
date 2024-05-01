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
    private Boolean esParadaFinal;

    public void calcularTiempoDeDemoraEnMinutos(){
        if(!esParadaFinal){
            this.tiempoDeDemoraTotalALaSiguienteParada = this.calculadorDeTiempoDeDemora.
                    calcularTiempoDeDemora(distanciaSiguienteParada);
            this.tiempoDeDemoraTotalALaSiguienteParada += this.tiempoDeDemoraEnParada;
        }
        else {
            this.tiempoDeDemoraEnParada = (double) 0;
            this.tiempoDeDemoraTotalALaSiguienteParada = (double) 0;
        }
    }
    public void calcularDistancia(){
        if(!esParadaFinal){
            this.distanciaSiguienteParada = this.calculadorDeDistancia.
                    calcularDistancia(direccion, proximaParada.getDireccion());
        }
        else {
            this.distanciaSiguienteParada = (double) 0;
        }
    }

    public Parada(Direccion direccion, Double tiempoDeDemoraEnParada, Parada proximaParada, Integer numeroDeParada, Boolean esParadaFinal) {
        this.direccion = direccion;
        this.tiempoDeDemoraEnParada = tiempoDeDemoraEnParada;
        this.proximaParada = proximaParada;
        this.numeroDeParada = numeroDeParada;
        this.esParadaFinal = esParadaFinal;
    }
}
