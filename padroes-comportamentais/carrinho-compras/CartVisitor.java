public interface CartVisitor {

    double visitEletronico(ProdutoEletronico produto);

    double visitVestuario(ProdutoVestuario produto);

    double visitAlimenticio(ProdutoAlimenticio produto);

}
