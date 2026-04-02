public class CondicaoIdade implements Expressao {

    private final int idadeMinima;

    public CondicaoIdade(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }
    
    @Override
    public boolean interpretar(Cliente cliente) {
        return cliente.idade() >= this.idadeMinima;
    }
}
