package application;

import entities.VendaP;

import java.util.Locale;
import java.util.Scanner;

public class mainVendaP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        VendaP venda = new VendaP();

        System.out.println("Digite para o cadastro do produto: Código, nome e quantidade: ");
        int scCodigo = sc.nextInt();
        String scNome = sc.next();
        int scQuantidade = sc.nextInt();

        System.out.printf("Código do produto: %d%n", scCodigo);
        System.out.printf("Nome do produto: %s%n", scNome);
        System.out.printf("Quantidade em estoque: %d%n", scQuantidade);

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Digite 1 para realizar uma venda e 0 para encerrar programa: ");

        int scEscolha = sc.nextInt();

        switch(scEscolha) {
            case 1:
                System.out.println("Digite a quantidade a ser vendido: ");
                int scQuantidadeVender = sc.nextInt();
                venda.Vender(scQuantidade, scQuantidadeVender);
                venda.mostrarQuantidade();
                break;

            case 0:
                System.out.println("Programa encerrado.");
                break;
        }
        sc.close();

    }
}
