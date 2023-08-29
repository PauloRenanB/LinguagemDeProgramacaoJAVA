public class Calculadora {

    int resultado_soma;
    int resultado_subtrair;
    double resultado_dividir;
    int resultado_mult;

    public int somar(int num1, int num2) {
        resultado_soma = num1 + num2;
        return resultado_soma;
    }
    public int subtrair(int num1, int num2) {
        resultado_subtrair = num1 - num2;
        return resultado_subtrair;
    }
    public double dividir(double num1, double num2) {
        resultado_dividir = num1 / num2;
        return resultado_dividir;
    }
    public int multiplicar(int num1, int num2) {
        resultado_mult = num1 * num2;
        return resultado_mult;
    }

}
