public class Main {
    
    public static void main(String[] args) {
        ConstrutorProdutos builder = ConstrutorProdutos.builder();

        builder
            .nome("Ventilador Arno")
            .preco(319.9)
            .tipo(TipoProduto.INDUSTRIALIZADOS)
            .tributacao(Imposto.IPI);
        Produto ventilador = builder.gerar();
        System.out.println(ventilador);

        builder
            .nome("Geladeira Consul")
            .preco(2099.0);
        Produto geladeira = builder.gerar();
        System.out.println(geladeira);
    }
}
