package com.mycompany.lavalentov2;

/**
 *
 * @author Maria Perrone
 * para que o enum rode corretamente.
 */
public class tipoServico {
    public enum TipoServico {
    ESTACIONAMENTO("Estacionamento"),
    LAVAGEM_COMPLETA("Lavagem Completa"),
    LAVAGEM_SIMPLES("Lavagem Simples");

    private final String descricao;

    TipoServico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
}
