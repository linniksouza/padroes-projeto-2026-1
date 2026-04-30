public class ProdutoVestuario extends Produto {

    public ProdutoVestuario(String nome, int quantidade, double valor) {
        super(nome, quantidade, valor);
    }

    @Override
    public double calcular(CartVisitor visitor) {
        return visitor.visitVestuario(this);
    }
}
