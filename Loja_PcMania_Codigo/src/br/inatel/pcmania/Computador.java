package br.inatel.pcmania;

public class Computador {

    private String marca;
    private float preco;
    private MemoriaUSB mu;
    private SistemaOperacional so;
    private HardwareBasico[] hb;

    public Computador( String marca, float preco,
                       String so_nome, int so_tipo,
                       String cpuNome, int cpuLim,
                       String ramNome, int ramLim,
                       String hdNome, int hdLim ) {

        this.marca = marca;
        this.preco = preco;

        this.so = new SistemaOperacional(so_nome, so_tipo);
        this.hb = new HardwareBasico[3];
        this.hb[0] = new HardwareBasico(cpuNome, cpuLim);
        this.hb[1] = new HardwareBasico(ramNome, ramLim);
        this.hb[2] = new HardwareBasico(hdNome, hdLim);
    }

    public void mostraPCConfig(){

        System.out.println("- Computador da marca " + marca + "\n");
        System.out.println("- Preço: R$" + preco);
        System.out.println("- Processador: " + hb[0].getNome() + " (" + hb[0].getCapacidade() + " MHz)");
        System.out.println("- Memória RAM: " + hb[1].getCapacidade() + " Gb");
        System.out.println("- Armazenamento: " + hb[2].getNome() + " de " + hb[2].getCapacidade() + " Gb");
        System.out.println("- Sistema Operacional: " + so.getNome() + " (" + so.getTipo() + " bits)");

        if( this.mu != null ){

            System.out.println("Acompanha: " + mu.getNome() + " de " + mu.getCapacidade() + (mu.getNome().contains("HD") ? " Gb" : " Gb"));

        }
        System.out.println("\n----------\n");

    }

    public void addMemoriaUSB(MemoriaUSB mu){

        this.mu = mu;
    }

    public float getPreco(){

        return preco;
    }
}
