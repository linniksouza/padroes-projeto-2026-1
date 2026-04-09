import java.util.List;
import java.util.Random;

public class ReprodutorAleatorio implements Reprodutor {

    private final List<Musica> sequencia;

    private final Random rand;

    private Musica musicaDaVez;

    public ReprodutorAleatorio(List<Musica> sequencia) {
        this.sequencia = sequencia;
        this.musicaDaVez = null;
        this.rand = new Random();
    }

    @Override
    public Musica musicaAtual() {
        int index = this.rand.nextInt(this.sequencia.size());
        this.musicaDaVez = this.sequencia.get(index);

        return this.musicaDaVez;
    }

    @Override
    public void proximaMusica() {
        boolean removeu = this.sequencia.remove(this.musicaDaVez);
        if(removeu)
            this.musicaDaVez = null;

        if(this.sequencia.isEmpty())
            throw new IllegalStateException("A playlist acabou.");
    }
}
