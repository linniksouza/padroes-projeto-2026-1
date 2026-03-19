public class PayPalAdapter implements ProcessadorPagamentos {

    private final PayPalSdk conn;

    public PayPalAdapter(PayPalSdk conn) {
        this.conn = conn;
    }

    @Override
    public Pagamento executarPagamento(Transacao transacao) {
        System.out.println("Processando pagamento com o gateway do PayPal...");
        boolean sucesso = this.conn.makeRequest(transacao.numeroCartao(), transacao.valor());

        return new Pagamento("2026-03-18", "19:24:45", sucesso);
    }
}
