import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro();
        Eletronico eletronico1 = new Eletronico();

        System.out.println("Digite o valor do livro 1");
        livro1.setPreco(sc.nextDouble());
        livro1.fazerPromocao();
        System.out.println("Esta com promocao! Novo preço: "+livro1.getPreco());

        System.out.println("Digite o valor do eletronico 1");
        eletronico1.setPreco(sc.nextDouble());
        eletronico1.fazerPromocao();
        System.out.println("Esta com promocao! Novo preço: "+eletronico1.getPreco());

    }
}
