public class Funcionario {
    private String nome;
    private double salarioBruto;

    public Funcionario(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salarioBruto;
    }

    public void calcularSalario() {
        System.out.println(String.format("Calculando o salário do funcionário %s: %.2f", this.nome, this.salarioBruto));
    }
}
