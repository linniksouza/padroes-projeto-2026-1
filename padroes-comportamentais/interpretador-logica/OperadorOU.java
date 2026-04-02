public class OperadorOU implements Expressao {
    
    private final Expressao esquerda;
    private final Expressao direita;

    public OperadorOU(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public boolean interpretar(Cliente cliente) {
        return this.esquerda.interpretar(cliente) || this.direita.interpretar(cliente);
    }
}
