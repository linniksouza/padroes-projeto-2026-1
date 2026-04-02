public class ArvoreConcreta implements Arvore {

    private final TipoArvore tipo;
    private final String textura;
    private final int largura;
    private final int altura;

    public ArvoreConcreta(TipoArvore tipo, String textura, int largura, int altura) {
        this.tipo = tipo;
        this.textura = textura;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar(int x, int y, int rotacao) {
        System.out.println(
            String.format(
                "Renderizando umar arvore do tipo %s, com %d metros de largura e %d metros de altura, com textura %s, nas coordenadas (%d, %d) e rotacao %d",
                this.tipo,
                this.largura,
                this.altura,
                this.textura,
                x,
                y,
                rotacao
            )
        );
    }

    @Override
    public TipoArvore getTipo() {
        return this.tipo;
    }
    
}
