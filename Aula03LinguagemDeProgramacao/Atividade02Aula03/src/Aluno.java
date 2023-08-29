public class Aluno {
    double soma;
    double resultado;

    public double somar (double nota1,double nota2,double nota3) {
        soma = nota1 + nota2 + nota3;
        resultado = soma / 3;

        return resultado;

    }


}