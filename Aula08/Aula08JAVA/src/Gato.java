public class Gato extends Animal implements Correr{
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void correr() {
        System.out.println("Correr");
    }
}
