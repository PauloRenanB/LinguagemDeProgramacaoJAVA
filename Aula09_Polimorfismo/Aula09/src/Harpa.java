public class Harpa extends InstrumentosMusicais implements Corda{
    private int qntdCordas;

    public int getQntdCordas() {
        return qntdCordas;
    }

    public void setQntdCordas(int qntdCordas) {
        this.qntdCordas = qntdCordas;
    }


    @Override
    public void Afinar() {
        System.out.println("Harpa afinada.");
    }

    @Override
    public void Tocar() {
        System.out.println("Harpa tocando.");
    }

    @Override
    public void trocarCorda() {
        System.out.println("Cordas da harpa trocadas");
    }
}
