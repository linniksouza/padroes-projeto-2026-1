import java.util.List;

public class ReprodutorSequencial implements Reprodutor {

    private final List<Musica> sequencia;
    
    private int index;

    public ReprodutorSequencial(List<Musica> sequencia) {
        this.sequencia = sequencia;
        this.index = 0;
    }

    @Override
    public Musica musicaAtual() {
        return this.sequencia.get(this.index);
    }

    @Override
    public void proximaMusica() {
        this.index = this.index + 1;

        if(this.index >= this.sequencia.size())
            throw new IllegalStateException("A playlist acabou.");
    }
}
