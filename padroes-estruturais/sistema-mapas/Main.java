public class Main {
    
    public static void main(String[] args) {
        Renderizador render = new Renderizador();

        for(int i = 0; i < 5; i++){
            render.adicionarArvore(TipoArvore.ABACATEIRO, i * 2, i * 3 + 1, 180);
        }

        for(int i = 0; i < 3; i++){
            render.adicionarArvore(TipoArvore.MANGUEIRA, i * 2, i * 3 + 1, 180);
        }

        for(int i = 0; i < 3; i++){
            render.adicionarArvore(TipoArvore.GOIABEIRA, i * 2, i * 3 + 1, 180);
        }

        for(int i = 0; i <10; i++){
            render.adicionarArvore(TipoArvore.MATO, i * 2, i * 3 + 1, 180);
        }

        render.renderizarMapa();
    }
}
