public class CondicaoUF implements Expressao {

    private final String ufEsperada;

    public CondicaoUF(String ufEsperada) {
        this.ufEsperada = ufEsperada;
    }

    @Override
    public boolean interpretar(Cliente cliente) {
        return cliente.uf().equals(this.ufEsperada);
    }
}
