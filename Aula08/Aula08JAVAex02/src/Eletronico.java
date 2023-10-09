public class Eletronico extends Produtos implements Promocao{
    @Override
    public void fazerPromocao() {
        desconto = getPreco() * 0.10;
        preco = getPreco() - desconto;
    }
}
