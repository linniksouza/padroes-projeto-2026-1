import java.util.Map;

public class CartaoCredito implements Pagamento {
    
    public void pagar(double valor, Map<String, String> dadosPagamento) {
        String numero = dadosPagamento.get("numero");
        String validade = dadosPagamento.get("validade");
        String cvv = dadosPagamento.get("cvv");

        if(numero == null)
            throw new RuntimeException("O número do cartão é obrigatório.");
        if(validade == null)
            throw new RuntimeException("A validade do cartão é obrigatório.");
        if(cvv == null)
            throw new RuntimeException("O código CVV do cartão é obrigatório.");

        System.out.println(String.format("Processando uma compra no cartão de crédito, no valor de %.2f, com o número '%s', com validade até '%s' e código CVV '%s'...", valor, numero, validade, cvv));
    }
}
