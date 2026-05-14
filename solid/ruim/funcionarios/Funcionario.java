public class Funcionario {
    private String nome;
    private double salarioBruto;

    public Funcionario(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public void calcularSalario() {
        System.out.println(String.format("Calculando o salário do funcionário %s: %.2f", this.nome, this.salarioBruto));
    }

    public void gerarRelatorio() {
        System.out.println(String.format("Gerando relatório sobre o funcionário %s...", this.nome));
    }

    public void salvarBanco() {
        System.out.println(String.format("Salvando os dados do funcionário %s no banco de dados...", this.nome));
    }
}
