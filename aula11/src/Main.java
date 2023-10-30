import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroPessoas cp = new CadastroPessoas();

        while (true) {
            System.out.println("Escola uma opção: ");
            System.out.println("1. Cadastrar Pessoa Fisica");
            System.out.println("2. Cadastrar Pessoa Juridica");
            System.out.println("3. Listar Pessoas");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    cadastrarPessoa(cp, new PessoaFisica(), sc);
                    break;
                case 2:
                    cadastrarPessoa(cp, new PessoaJuridica(), sc);
                    break;
                default:
                    cp.listar();
                    break;
            }
        }
    }

    private static void cadastrarPessoa(CadastroPessoas cp, Pessoa pessoa, Scanner sc) {
        System.out.println("Digite o nome da pessoa: ");
        sc.nextLine();
        pessoa.setNome(sc.nextLine());
        System.out.println("Digite a idade da pessoa:");
        pessoa.setIdade(sc.nextInt());
        sc.nextLine();

        if(pessoa instanceof PessoaJuridica) {
            System.out.println("Digite o CPNJ");
            ((PessoaJuridica) pessoa).setCpnj(sc.nextInt());
        }
        cp.cadastrarPessoa(pessoa);
    }
}
