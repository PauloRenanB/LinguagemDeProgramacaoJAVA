public class Cachorro extends Animal implements Correr{
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void correr() {
        System.out.println("Corre");
    }
}
