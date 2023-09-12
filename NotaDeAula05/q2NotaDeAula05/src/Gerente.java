public class Gerente extends Funcionario{
    private String departamento;

    private double bonus;

//  Get e Set
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularBonus(double salario){
        bonus = salario * 0.10;
        this.bonus = bonus;
        return bonus;
    }

    public void mostrarDados(){
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Salario: %.2f%n", getSalario());
        System.out.printf("Bonus no salario: %.2f%n", getBonus());
    }



}
