public class CalcularTotalVisitor implements CartVisitor {

    @Override
    public double visitEletronico(ProdutoEletronico produto) {
        return produto.getQuantidade() * produto.getValor();
    }

    @Override
    public double visitVestuario(ProdutoVestuario produto) {
        return produto.getQuantidade() * produto.getValor();
    }

    @Override
    public double visitAlimenticio(ProdutoAlimenticio produto) {
        return produto.getQuantidade() * produto.getValor();
    }
}
