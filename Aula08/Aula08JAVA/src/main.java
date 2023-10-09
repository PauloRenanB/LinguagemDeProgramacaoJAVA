import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        Passaro passaro1 = new Passaro();

        gato1.emitirSom();
        passaro1.voar();
    }
}
