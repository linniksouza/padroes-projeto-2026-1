
import java.util.ArrayList;
import java.util.List;

public class Renderizador {

    private final ArvoreFactory factory;
    private final List<ArvoreInstancia> floresta;

    public Renderizador() {
        this.factory = new ArvoreFactory();
        this.floresta = new ArrayList<>();
    }

    public void renderizarMapa() {
        for(ArvoreInstancia arvore : this.floresta){
            arvore.renderizar();
        }
    }

    public void adicionarArvore(TipoArvore tipo, int x, int y, int rotacao) {
        Arvore arvore = this.factory.getArvore(tipo);
        this.floresta.add(new ArvoreInstancia(x, y, rotacao, arvore));
    }
}
