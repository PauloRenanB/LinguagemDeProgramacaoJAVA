public class Passaro extends Animal implements Voar{
    @Override
    public void emitirSom() {
        System.out.println("Piu");
    }

    @Override
    public void voar() {
        System.out.println("Esta voando");
    }
}
