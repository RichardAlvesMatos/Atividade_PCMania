package br.inatel.pcmania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float MinhaMatricula = 777 + 1;

        System.out.println("Insira seu nome a seguir:");
        String Nome_Comprador = entrada.nextLine();
        System.out.println("Insira seu cpf a seguir:");
        String Cpf_Comprador = entrada.nextLine();

        Cliente cliente = new Cliente( Nome_Comprador, Cpf_Comprador );

        boolean compra = true;

        while(compra){

            System.out.println("- Bem vindo a PC Mania, escolha uma das promoções das marcas a seguir:\n");
            System.out.println("1 - Pc Apple\n \nR$" + MinhaMatricula + ", Pentium Core i3 (2200 Mhz), 8 Gb de Memória RAM, 500 Gb de HD, Sistema Operacional MacOS (64 Bits)");
            System.out.println("2 - Pc Samsung\n \n R$" + (MinhaMatricula + 1234) + ", Pentium Core i5 (3370 Mhz), 16 Gb de Memória RAM, 1 TB de HD, Sistema Operacional Windows 8 (64 bitss)");
            System.out.println("3 - Pc Dell\n \n R$" + (MinhaMatricula + 5678) + ", Pentium Core i7 (4500 Mhz), 32 Gb de Memória RAM, 2 TB de HD, Sistema OperacionalWindows 10 (64 bits)");
            System.out.println("4 - Ir ao carrinho");

            System.out.println("\nEscolha uma opção:");

            int opcao = entrada.nextInt();

            switch(opcao){

                case 1: //computador da maçã

                    Computador pc1 = new Computador("Apple", MinhaMatricula, "macOS Sequoia", 64, "Pentium Core i3", 2200, "Memória RAM", 8, "HD", 500);
                    MemoriaUSB usb1 = new MemoriaUSB("Pen-drive", 16);
                    pc1.addMemoriaUSB(usb1);
                    cliente.addComputador(pc1);
                    System.out.println("PC Apple agora esta no carrinho...");
                    break;

                case 2: //computador sansang

                    Computador pc2 = new Computador("Samsung", MinhaMatricula + 1234, "Windows 8", 64, "Pentium Core i5", 3370, "Memória RAM", 16, "HD", 1000); //eu sei que um hd de 1tb é 1024 gb, mas coloquei 1000 gb para simplificar
                    MemoriaUSB usb2 = new MemoriaUSB("Pen-drive", 32);
                    pc2.addMemoriaUSB(usb2);
                    cliente.addComputador(pc2);
                    System.out.println("PC Samsung agora está no carrinho...");
                    break;

                case 3: //computador Dell (acabou a criatividade)

                    Computador pc3 = new Computador("Dell", MinhaMatricula + 5678, "Windows 10", 64, "Pentium Core i7", 4500, "Memória RAM", 32, "HD", 2000); //hmmmmmmmm
                    MemoriaUSB usb3 = new MemoriaUSB("HD Externo", 1000);
                    pc3.addMemoriaUSB(usb3);
                    cliente.addComputador(pc3);
                    System.out.println("PC Dell agora esta no carrinho...");
                    break;

                case 4:
                    compra = false;
                    break;

                default:
                    System.out.println("Opção inválida! Escolha outra opção.");
            }
        }

        System.out.println("==================================================");
        System.out.println("                Carrinho de Compras");
        System.out.println("==================================================");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Cliente: " + cliente.getCpf());
        System.out.println("\nComputadores comprados: ");

        Computador[] pcsComprados = cliente.getComputador();
        for(int i = 0; i < cliente.getQtdPcs(); i++){

            pcsComprados[i].mostraPCConfig();
        }

        System.out.println("Total da compra: R$" + cliente.calculaTotalCompra());

        entrada.close();
    }
}