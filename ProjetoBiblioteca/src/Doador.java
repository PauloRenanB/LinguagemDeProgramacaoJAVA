public class Doador extends Pessoa implements Emprestado{


    @Override
    public void entrar() {
        System.out.println("Doador entrou na biblioteca.");
    }

    @Override
    public void sair() {
        System.out.println("Doador saiu da biblioteca.");
    }

    @Override
    public void pegar_emprestado() {
        System.out.println("O cliente pegou um livro emprestado.");
    }
}
