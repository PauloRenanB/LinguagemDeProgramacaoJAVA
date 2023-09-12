public class Moto extends Veiculo{
    private int cilindradas;

//  Get e Set
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void imprimirDetalhes() {
        System.out.printf("O modelo da moto é: %s%n", getModelo());
        System.out.printf("A marca da moto é: %s%n", getMarca());
        System.out.printf("O ano de fabricação da moto é: %d%n", getAnoDeFabricacao());
        System.out.printf("A quantidade de cilindradas da moto: %d%n", getCilindradas());
    }
}
