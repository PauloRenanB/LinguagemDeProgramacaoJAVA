public class Carro extends Veiculo{
    private int pneus;

    
    public Carro(String marca, String modelo, int ano, int pneus) {
        super(marca, modelo, ano);
        this.pneus = pneus;
    }

    public int getPneus() {
        return pneus;
    }

    public void setPneus(int pneus) {
        this.pneus = pneus;
    }


}
