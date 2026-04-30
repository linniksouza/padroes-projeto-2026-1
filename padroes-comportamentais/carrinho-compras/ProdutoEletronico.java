public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, int quantidade, double valor) {
        super(nome, quantidade, valor);
    }

    @Override
    public double calcular(CartVisitor visitor) {
        return visitor.visitEletronico(this);
    }
}
