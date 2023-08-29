import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int r;
        do {
            System.out.println("Escolha sua operação: ");
            System.out.println("1 = Somar");
            System.out.println("2 = Subtrair");
            System.out.println("3 = Dividir");
            System.out.println("4 = Multiplicar");
            Scanner sc = new Scanner(System.in);
            int escolha = sc.nextInt();

            System.out.println("Digite dois numeros para operação: ");
            Scanner num = new Scanner(System.in);


            int num1 = num.nextInt();
            int num2 = num.nextInt();

            switch(escolha) {
                case 1:
                    calc.somar(num1, num2);
                    System.out.println(calc.resultado_soma);
                    break;
                case 2:
                    calc.subtrair(num1, num2);
                    System.out.println(calc.resultado_subtrair);
                    break;
                case 3:
                    calc.dividir(num1, num2);
                    System.out.println(calc.resultado_dividir);
                    break;
                case 4:
                    calc.multiplicar(num1, num2);
                    System.out.println(calc.resultado_mult);
                    break;
                default:
                    System.out.println("Digite uma operação valida!");
                    break;
            }
            System.out.println("Digite 0 para ver novamente!");
            r = num.nextInt();
        } while (r == 0);





    }

}