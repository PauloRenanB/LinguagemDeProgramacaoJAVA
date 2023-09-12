import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        Moto moto = new Moto();

        System.out.println("Digite 1 para cadastrar um carro e 2 para cadastrar uma moto: ");
        int escolha = sc.nextInt();

        switch(escolha){
            case 1:
                System.out.println("Digite a marca do carro: ");
                carro.setMarca(sc.next());
                System.out.println("Digite o modelo do carro: ");
                carro.setModelo(sc.next());
                System.out.println("Digite o ano de fabricação do carro: ");
                carro.setAnoDeFabricacao(sc.nextInt());
                System.out.println("Digite o numero de portas do carro: ");
                carro.setNumPortas(sc.nextInt());

                carro.imprimirDetalhes();
                break;

            case 2:
                System.out.println("Digite a marca da moto: ");
                moto.setMarca(sc.next());
                System.out.println("Digite o modelo da moto: ");
                moto.setModelo(sc.next());
                System.out.println("Digite o ano de fabricação da moto: ");
                moto.setAnoDeFabricacao(sc.nextInt());
                System.out.println("Digite a quantidade de cilindradas da moto: ");
                moto.setCilindradas(sc.nextInt());

                moto.imprimirDetalhes();
                break;

            default:
                System.out.println("Opção invalida.");
                System.out.println("Programa encerrado.");

        }
    }
}