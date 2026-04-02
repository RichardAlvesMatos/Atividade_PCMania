package br.inatel.pcmania;

public class HardwareBasico {

    private String nome;
    private float capacidade; // o tipo deve ser ou 32 bits ou 64 bits

    public HardwareBasico( String nome, float capacidade ){

        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome(){

        return nome;
    }

    public float getCapacidade(){

        return capacidade;
    }
}
