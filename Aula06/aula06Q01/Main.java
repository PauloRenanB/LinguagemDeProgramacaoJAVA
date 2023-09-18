public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Paulo", 20, 432402);
        Professor prof1 = new Professor("Fernanda", 20, 5600.32);


        aluno1.imprimirDetalhes();
        prof1.mostrarDetalhes();
    }
}
