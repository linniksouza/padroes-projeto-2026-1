public class Main {
    
    public static void main(String[] args) {
        // Imagem imagem = new ImagemReal("/media/ecommerce/imagens/ventilador-arno.png");
        Imagem imagem = new ImagemProxy("/media/ecommerce/imagens/ventilador-arno.png");
        System.out.println("Imagem configurada...");
        imagem.exibir();
    }
}
