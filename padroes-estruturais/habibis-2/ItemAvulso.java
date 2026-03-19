public class ItemAvulso implements ItemMenu {
    
    private final double preco;

    public ItemAvulso(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void adicionar(ItemMenu item) {
        throw new UnsupportedOperationException("Nao eh possivel adicionar um novo item a um item avulso.");
    }
}
