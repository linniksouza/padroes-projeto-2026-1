public class CalcularDescontoVisitor implements CartVisitor {
    
    @Override
    public double visitEletronico(ProdutoEletronico produto) {
        return produto.getQuantidade() * produto.getValor() * 0.1;
    }

    @Override
    public double visitVestuario(ProdutoVestuario produto) {
        double desconto = (
            (produto.getQuantidade() >= 5)
                ? 0.15
                : 0.10
        );

        return produto.getQuantidade() * produto.getValor() * desconto;
    }

    @Override
    public double visitAlimenticio(ProdutoAlimenticio produto) {
        return produto.getQuantidade() * produto.getValor() * 0.05;
    }
}
