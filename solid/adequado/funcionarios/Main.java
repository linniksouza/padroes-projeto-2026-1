public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Linnik Souza", 2_000.0);
        funcionario.calcularSalario();

        RelatoriosFuncionarios relatorio = new RelatoriosFuncionarios();
        relatorio.gerar(funcionario);

        FuncionariosRepository repository = new FuncionariosRepository();
        repository.salvar(funcionario);
    }
}
