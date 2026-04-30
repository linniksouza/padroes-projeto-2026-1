
import java.util.Arrays;
import java.util.List;

public class CsvDataImporter extends DataImporter {

    public CsvDataImporter(String caminhoArquivo) {
        super(caminhoArquivo);
    }

    @Override
    protected List<Dado> extrairDados(String arquivo) {
        String dadosJson = "\nchave_1, 8\nchave_2, 4.5\nchave_3, 10.9\n";
        System.out.println(String.format("Lendo o conteudo do arquivo %s em formato CSV: %s", arquivo, dadosJson));

        return Arrays.asList(new Dado[]{
            new Dado("chave_1", 8.0),
            new Dado("chave_2", 4.5),
            new Dado("chave_3", 10.9),
            new Dado("chave_4", 3.44)
        });
    }
}
