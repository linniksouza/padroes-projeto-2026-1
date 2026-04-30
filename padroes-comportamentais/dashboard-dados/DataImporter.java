
import java.util.List;

public abstract class DataImporter {
    
    private final String caminhoArquivo;

    public DataImporter(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public boolean manipularDados() {
        boolean sucesso = false;

        String arquivo = this.abrirArquivo();
        List<Dado> dadosExtraidos = this.extrairDados(arquivo);

        boolean validos = this.validarDados(dadosExtraidos);

        if(validos){
            this.salvarDados(dadosExtraidos);
            sucesso = true;
        }

        this.fecharArquivo(arquivo);

        return sucesso;
    }

    private String abrirArquivo() {
        System.out.println(String.format("Abrindo o arquivo no caminho %s", this.caminhoArquivo));

        return "Arquivo aberto";
    }

    private void fecharArquivo(String arquivo) {
        System.out.println(String.format("Fechando o arquivo %s: %s", this.caminhoArquivo, arquivo));
    }

    private boolean validarDados(List<Dado> dados) {
        long dadosNulos = (
            dados
                .stream()
                .filter(dado -> dado.valor() == null)
                .count()
        );

        return dadosNulos == 0;
    }

    private void salvarDados(List<Dado> dados) {
        dados.stream().forEach(dado -> {
            System.out.println(String.format("Salvando registro na base de dados: %s", dado));
        });
    }

    protected abstract List<Dado> extrairDados(String arquivo);

}
