public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimirDetalhes(){
        System.out.println("Informações do aluno: ");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Matricula: "+getMatricula());
        System.out.println("---------------");
    }
}
