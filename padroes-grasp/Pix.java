import java.util.Map;

public class Pix implements Pagamento {
    
    public void pagar(double valor, Map<String, String> dadosPagamento) {
        String chavePix = dadosPagamento.get("chave_pix");
        if(chavePix == null)
            throw new RuntimeException("A chave PIX é obrigatória.");

        System.out.println(String.format("Processando uma transação PIX no valor de %.2f para a chave '%s'...", valor, chavePix));
    }
}
