//Elabore um código para este problema:
//        Todos são instrumentos musicais (Classe PAI). Eles são cadastrados no sistema com nome e
//        código. Porém, Existem a categoria de instrumentos de corda e de sopro. Os instrumentos
//        de corda, podem precisar trocar a corda. Estes Instrumentos precisam cadastrar a
//        quantidade de cordas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Violao violao01 = new Violao();
        mtdsPoli violao01Poli = new mtdsPoli();


        System.out.println("Cadastro violão 1");
        System.out.println("Digite o nome do violão: ");
        sc.next();
        violao01.setNome(sc.nextLine());
        System.out.println("Digite o codigo do violão: ");
        violao01.setCodigo(sc.nextInt());
        System.out.println("Digite a quantidade de cordas do violão: ");
        violao01.setQntdCordas(sc.nextInt());
        System.out.println("Violão cadastrado!");
        System.out.println("Digite 1 para trocar de corda e 0 para encerrar.");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                violao01Poli.trocarCordaa(new Violao());
                System.out.println("Programa encerrado.");
                break;
            case 0:
                System.out.println("Programa encerrado.");
                break;
            default:
                System.out.println("Digite uma opção valida!");
                break;
        }



//        mtdsPoli violao02Poli = new mtdsPoli();
//        mtdsPoli harpa01Poli = new mtdsPoli();
//
//        harpa01Poli.trocarCordaa(new Harpa());
//        violao02Poli.trocarCordaa(new Violao());
    }
}