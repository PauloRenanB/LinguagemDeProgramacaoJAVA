public class PessoaJuridica extends Pessoa{
    private int cpnj;

    public int getCpnj() {
        return cpnj;
    }

    public void setCpnj(int cpnj) {
        this.cpnj = cpnj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpnj=" + cpnj +
                '}';
    }
}
