public class ArvoreInstancia {
    
    private final int x;
    private final int y;
    private final int rotacao;
    private final Arvore arvore;

    public ArvoreInstancia(int x, int y, int rotacao, Arvore arvore) {
        this.x = x;
        this.y = y;
        this.rotacao = rotacao;
        this.arvore = arvore;
    }

    public void renderizar() {
        this.arvore.desenhar(this.x, this.y, this.rotacao);
    }
}
