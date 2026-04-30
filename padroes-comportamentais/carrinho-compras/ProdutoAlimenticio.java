public class ProdutoAlimenticio extends Produto {

    public ProdutoAlimenticio(String nome, int quantidade, double valor) {
        super(nome, quantidade, valor);
    }

    @Override
    public double calcular(CartVisitor visitor) {
        return visitor.visitAlimenticio(this);
    }
}
