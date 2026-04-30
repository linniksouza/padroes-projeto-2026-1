public class CalcularImpostoVisitor implements CartVisitor {

    @Override
    public double visitEletronico(ProdutoEletronico produto) {
        return produto.getValor() * 0.05;
    }

    @Override
    public double visitVestuario(ProdutoVestuario produto) {
        return produto.getValor() * 0.03;
    }

    @Override
    public double visitAlimenticio(ProdutoAlimenticio produto) {
        return 0.0;
    }
}
