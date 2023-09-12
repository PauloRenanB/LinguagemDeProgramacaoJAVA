import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para cadastrar Gerente e 2 para cadastrar Diretor");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Digite seu nome: ");
                gerente.setNome(sc.next());
                System.out.println("Digite seu salario: ");
                gerente.setSalario(sc.nextDouble());
                System.out.println("Digite seu departamento: ");
                gerente.setDepartamento(sc.next());

                System.out.println("---------------------");

                gerente.calcularBonus(gerente.getSalario());
                gerente.mostrarDados();
                break;

            case 2:
                System.out.println("Digite seu nome: ");
                diretor.setNome(sc.next());
                System.out.println("Digite seu salario: ");
                diretor.setSalario(sc.nextDouble());
                System.out.println("Digite sua quantidade de ações: ");
                diretor.setAcoes(sc.nextInt());

                System.out.println("-----------------------");

                diretor.mostrarDados();
                break;

            default:
                System.out.println("Opção invalida!");
                break;
        }
    }
}