public class RelatoriosFuncionarios {

    public void gerar(Funcionario funcionario) {
        System.out.println(String.format("Gerando um relatório para o funcionário %s...", funcionario.getNome()));
    }
}
