package com.mycompany.lavalentov2;

import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author Maria Perrone
 */
public class Estacionamento extends Servico {
    private LocalTime horaEntrada;
    private LocalTime horaSaida;
    private double vlPagar;

    public Estacionamento(LocalTime horaEntrada, LocalTime horaSaida, String modelo, String placa) {
        super(modelo, placa);
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.vlPagar = vlPagar;
    }
    public double calcularTotal(){
    long minutos = Duration.between(horaEntrada,horaSaida).toMinutes();
    double horas = Math.ceil(minutos/60.0);
    return vlPagar = horas *10;
    }
}