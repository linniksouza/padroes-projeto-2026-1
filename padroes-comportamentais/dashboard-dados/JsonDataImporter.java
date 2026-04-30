
import java.util.Arrays;
import java.util.List;

public class JsonDataImporter extends DataImporter {

    public JsonDataImporter(String caminhoArquivo) {
        super(caminhoArquivo);
    }

    @Override
    protected List<Dado> extrairDados(String arquivo) {
        String dadosJson = "{chave_1: 8, chave_2: 4.5, chave_3: 10.9}";
        System.out.println(String.format("Lendo o conteudo do arquivo %s em formato JSON: %s", arquivo, dadosJson));

        return Arrays.asList(new Dado[]{
            new Dado("chave_1", 8.0),
            new Dado("chave_2", 4.5),
            new Dado("chave_3", 10.9)
        });
    }
}
