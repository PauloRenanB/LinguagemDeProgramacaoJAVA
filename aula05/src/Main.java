import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para cadastrar professor e 2 para cadastrar aluno: ");
        int scEscolha = sc.nextInt();

        switch(scEscolha) {
            case 1:
                System.out.println("Digite seu nome ");
                professor.setNome(sc.next());
                System.out.println("Digite idade");
                professor.setIdade(sc.nextInt());
                System.out.println("Digite especialização  ");
                professor.setEspecializacao(sc.next());
                System.out.println("Digite  salario: ");
                professor.setSalario(sc.nextDouble());

                System.out.println("------------------");
                System.out.println(professor.getNome());
                System.out.println(professor.getIdade());
                System.out.println(professor.getEspecializacao());
                System.out.println(professor.getSalario());
                break;

            case 2:
                System.out.println("Digite seu nome: ");
                aluno.setNome(sc.next());
                System.out.println("Digite sua idade: ");
                aluno.setIdade(sc.nextInt());
                System.out.println("Digite suas 3 notas: ");
                aluno.setNota1(sc.nextDouble());
                aluno.setNota2(sc.nextDouble());
                aluno.setNota3(sc.nextDouble());
                System.out.println("----------------------");

                aluno.fazerMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());
                System.out.println(aluno.getNome());
                System.out.println(aluno.getIdade());

                System.out.println("Sua media: ");
                System.out.printf("%.2f",aluno.getMedia());
                break;
        }
    }
}
