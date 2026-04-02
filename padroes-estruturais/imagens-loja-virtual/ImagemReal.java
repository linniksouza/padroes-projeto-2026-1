public class ImagemReal implements Imagem {

    private final String caminho;

    public ImagemReal(String caminho) {
        System.out.println(String.format("Carregando imagem real no caminho '%s'...", caminho));
        this.caminho = caminho;
    }

    @Override
    public void exibir() {
        System.out.println(String.format("Renderizando imagem no caminho '%s'...", this.caminho));
    }
}
