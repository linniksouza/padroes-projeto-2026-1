import java.util.List;

public class Playlist {

    private final List<Musica> faixas;

    public Playlist(List<Musica> faixas) {
        this.faixas = faixas;
    }

    public Reprodutor reproducaoSequencial() {
        return new ReprodutorSequencial(this.faixas);
    }

    public Reprodutor reproducaoAleatoria() {
        return new ReprodutorAleatorio(this.faixas);
    }
}
