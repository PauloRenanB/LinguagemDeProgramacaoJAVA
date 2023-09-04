package entities;

public class CalcImc {

    private double peso;
    private double altura;
    private double imc;

//    Get e Set peso

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

//    Get e Set altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//    Get e Set imc
    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

//    Calculo imc
    public double calcImc(double altura, double peso) {
        this.imc = peso / (altura*altura);
        this.altura = altura;
        this.peso = peso;
        System.out.printf("%.2f%n",imc);
        return imc;
    }
    public void mostrarImc() {
        System.out.println(imc);
    }

}
