public class FuncionariosRepository {

    public void salvar(Funcionario funcionario) {
        System.out.println(String.format("Salvando os dados de um funcionário na base de dados: nome=%s, salario=%.2f", funcionario.getNome(), funcionario.getSalario()));
    }
}
