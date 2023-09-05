package entities;

public class VendaP {

    private int quantidade;
    private int quantidadeVender;
    private int resultado;

//  Get e Set resultado
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

//  Get e Set quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
//  Get e Set quantidadeVender
    public int getQuantidadeVender() {
        return quantidadeVender;
    }
    public void setQuantidadeVender(int quantidadeVender) {
        this.quantidadeVender = quantidade;
    }

    public int Vender(int quantidade, int quantidadeVender){
        int resultado = quantidade - quantidadeVender;
        this.resultado = resultado;
        return resultado;
    }
    public void mostrarQuantidade() {
        System.out.printf("Voce ficou com %d produtos! %n",resultado);
    }



}
