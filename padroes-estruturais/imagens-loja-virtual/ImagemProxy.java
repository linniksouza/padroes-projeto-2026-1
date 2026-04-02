public class ImagemProxy implements Imagem {

    private final String caminho;

    private Imagem imagem;

    public ImagemProxy(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public void exibir() {
        if(this.imagem == null){
            System.out.println("Carregando imagem na memoria...");
            this.imagem = new ImagemReal(this.caminho);
        }

        this.imagem.exibir();
    }
}
