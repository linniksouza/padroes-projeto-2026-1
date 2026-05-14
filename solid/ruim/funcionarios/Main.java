public class Main {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Linnik Souza", 2_000.0);
        funcionario.calcularSalario();
        funcionario.gerarRelatorio();
        funcionario.salvarBanco();
    }
}
