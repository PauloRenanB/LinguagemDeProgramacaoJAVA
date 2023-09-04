package application;

import entities.CalcImc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite sua altura e peso: ");
        Scanner sc = new Scanner(System.in);
        CalcImc imc = new CalcImc();

        double scAltura = sc.nextDouble();
        double scPeso = sc.nextDouble();


        imc.calcImc(scAltura, scPeso);
        imc.mostrarImc();

        System.out.println(imc);

    }
}
