package com.mycompany.lavalentov2;

/**
 *
 * @author Maria Perrone
 */
public abstract class Servico {
    private String modelo;
    private String placa;

    public Servico(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() { return modelo; }
    public String getPlaca() { return placa; }

    public abstract double calcularTotal();
}

