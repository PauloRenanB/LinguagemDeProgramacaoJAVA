import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deducaoinss inss = new Deducaoinss();
        System.out.println("Digite respectivamente sua matricula, nome e salario bruto: ");
        Scanner sc = new Scanner(System.in);

        int matricula = sc.nextInt();
        String nome = sc.next();
        double salariob = sc.nextDouble();

        inss.deduzir(salariob, inss.porcentagem);
        double liquido = salariob - inss.resultado;

        System.out.printf("Matricula: %d%n", matricula);
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Salario bruto: %.2f%n",salariob);
        System.out.printf("Dedução inss: %.2f%n", inss.resultado);
        System.out.printf("Salario liquido: %.2f%n",liquido);


    }
}

