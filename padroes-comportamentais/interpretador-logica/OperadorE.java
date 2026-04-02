public class OperadorE implements Expressao {

    private final Expressao esquerda;
    private final Expressao direita;

    public OperadorE(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public boolean interpretar(Cliente cliente) {
        return this.esquerda.interpretar(cliente) && this.direita.interpretar(cliente);
    }
}
