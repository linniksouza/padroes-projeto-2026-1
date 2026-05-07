import java.util.Map;

public interface Pagamento {
    
    void pagar(double valor, Map<String, String> dadosPagamento);

}
