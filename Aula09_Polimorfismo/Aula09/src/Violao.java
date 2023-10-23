public class Violao extends InstrumentosMusicais implements Corda{

    private int qntdCordas;

    public int getQntdCordas() {
        return qntdCordas;
    }

    public void setQntdCordas(int qntdCordas) {
        this.qntdCordas = qntdCordas;
    }

    @Override
    public void Afinar() {
        System.out.println("Violão afinado.");
    }

    @Override
    public void Tocar() {
        System.out.println("Violão tocando.");
    }

    @Override
    public void trocarCorda() {
        System.out.println("Cordas do violão trocadas.");
    }
}
