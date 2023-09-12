public class Carro extends Veiculo{
    private int numPortas;

//  Get e Set
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void imprimirDetalhes() {

        System.out.printf("A marca do carro é: %s%n", getMarca());
        System.out.printf("O modelo do carro é: %s%n", getModelo());
        System.out.printf("O ano de fabricação do carro é: %d%n", getAnoDeFabricacao());
        System.out.printf("A quantidade de portas no carro: %d%n", getNumPortas());
    }



}
