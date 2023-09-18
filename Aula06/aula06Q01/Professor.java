public class Professor extends Pessoa{
    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome,idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void mostrarDetalhes(){
        System.out.println("Informações professor: ");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Salario: "+getSalario());
        System.out.println("---------------");
    }

}
