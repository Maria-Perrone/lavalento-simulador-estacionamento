package com.mycompany.lavalentov2;

public class Estetica extends Servico {
    private String tipoServico;
    private double vlPagar;

    public Estetica(String tipoServico, String modelo, String placa) {
        super(modelo, placa);
        this.tipoServico = tipoServico;
    }

    @Override
    public double calcularTotal() {
        if (tipoServico.equals("Lavagem Simples")) {
            vlPagar = 40.0;
        } else {
            vlPagar = 70.0;
        }
        return vlPagar;
    }
}
