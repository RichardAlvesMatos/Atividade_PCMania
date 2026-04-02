package br.inatel.pcmania;

public class Cliente{

    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int qtdPcs;

    public Cliente(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[50];
        this.qtdPcs = 0;
    }

    public float calculaTotalCompra(){

        float total = 0;
        for( int i = 0; i < qtdPcs; i++ ){

            total += computadores[i].getPreco();
        }

        return total;
    }

    public void addComputador(Computador c){

        if( qtdPcs < computadores.length ){

            computadores[qtdPcs] = c;
            qtdPcs++;
        } else {

            System.out.println("Carrinho cheio...");
        }
    }

    public String getNome(){

        return nome;
    }

    public String getCpf(){

        return cpf;
    }

    public Computador[] getComputador(){

        return computadores;
    }

    public int getQtdPcs(){

        return qtdPcs;
    }
}
