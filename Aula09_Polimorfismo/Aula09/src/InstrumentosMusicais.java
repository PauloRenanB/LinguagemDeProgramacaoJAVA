public abstract class InstrumentosMusicais {
    protected String nome;
    protected int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public abstract void Afinar();

    public abstract void Tocar();

}
