import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Musica> sequencia = new ArrayList<>();
        sequencia.add(new Musica("Poker Face - Lady Gaga", 30));
        sequencia.add(new Musica("Evidências - Chitãozinho e Xororó", 35));
        sequencia.add(new Musica("Tengo Lengo Tengo - Luiz Gonzaga", 20));
        sequencia.add(new Musica("Vagalumes - Pollo", 40));
        Playlist playlist = new Playlist(sequencia);

        try {
            Reprodutor reproducao = playlist.reproducaoSequencial();
            while(true) {
                Musica musica = reproducao.musicaAtual();
                System.out.println(String.format("Tocando '%s' neste momento...", musica.nome()));
                Thread.currentThread().sleep(musica.tempoTotal() * 200);
                reproducao.proximaMusica();
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
