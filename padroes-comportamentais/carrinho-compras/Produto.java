public abstract class Produto {

    private final String nome;
    private final int quantidade;
    private final double valor;

    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return String.format("Produto(nome=%s, quantidade=%d, valor=%.2f)", this.nome, this.quantidade, this.valor);
    }

    public abstract double calcular(CartVisitor visitor);

}
