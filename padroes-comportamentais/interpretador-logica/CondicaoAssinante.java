public class CondicaoAssinante implements Expressao {
    
    @Override
    public boolean interpretar(Cliente cliente) {
        return cliente.assinante();
    }
}
