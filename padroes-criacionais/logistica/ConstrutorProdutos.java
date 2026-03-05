public class ConstrutorProdutos {

    private String nome;
    private double preco;
    private TipoProduto tipo;
    private Imposto tributacao;

    private ConstrutorProdutos(){}

    public ConstrutorProdutos nome(String nome) {
        this.nome = nome;

        return this;
    }

    public ConstrutorProdutos preco(double preco) {
        this.preco = preco;

        return this;
    }

    public ConstrutorProdutos tipo(TipoProduto tipo) {
        this.tipo = tipo;

        return this;
    }

    public ConstrutorProdutos tributacao(Imposto tributacao) {
        this.tributacao = tributacao;

        return this;
    }

    public Produto gerar() {
        return new Produto(
            this.nome,
            this.preco,
            this.tipo,
            this.tributacao
        );
    }

    public static ConstrutorProdutos builder() {
        return new ConstrutorProdutos();
    }
}
