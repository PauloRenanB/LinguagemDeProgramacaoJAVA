public class Livro extends Produtos implements Promocao{
    @Override
    public void fazerPromocao() {
        desconto = getPreco() * 0.05;
        preco = getPreco() - desconto;
    }
}
