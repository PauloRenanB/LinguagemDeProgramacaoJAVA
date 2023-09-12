public class Diretor extends Funcionario{

    private int acoes;

//  Get e Set
    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    public void mostrarDados() {
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Salario: %.2f%n", getSalario());
        System.out.printf("Quantidade de ações: %d%n", getAcoes());

    }


}
