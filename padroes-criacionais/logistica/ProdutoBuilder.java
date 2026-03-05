public interface ProdutoBuilder {
    
    ProdutoBuilder nome(String nome);

    ProdutoBuilder preco(double preco);

    ProdutoBuilder tipo(TipoProduto tipo);

    ProdutoBuilder tributacao(Imposto tributacao);

    Produto gerar();

}
