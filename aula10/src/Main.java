import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroPessoas cp = new CadastroPessoas();

        int x;

        do {


            PessoaFisica pf1 = new PessoaFisica();
            PessoaJuridica pj1 = new PessoaJuridica();


            System.out.println("Digite 1 para cadastrar Pessoa Fisica e 2 para cadastrar Pessoa Juridica: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome: ");
                    sc.nextLine();
                    pf1.setNome(sc.nextLine());
                    System.out.println("Digite a idade: ");
                    pf1.setIdade(sc.nextInt());
                    cp.cadastrarPessoa(pf1);
                    break;
                case 2:
                    System.out.println("Digite o nome: ");
                    sc.nextLine();
                    pj1.setNome(sc.nextLine());
                    System.out.println("Digite sua idade: ");
                    pj1.setIdade(sc.nextInt());
                    System.out.println("Digite seu cnpj: ");
                    pj1.setCnpj(sc.nextInt());
                    cp.cadastrarPessoa(pj1);
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }


            System.out.println("Digite 0 para prosseguir com o programa e qualquer outra tecla para encerrar.");
            x = sc.nextInt();
        }

        while (x == 0);
        cp.listar();

    }
}
