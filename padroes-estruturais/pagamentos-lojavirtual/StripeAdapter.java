public class StripeAdapter implements ProcessadorPagamentos {

    private final StripeSdk conn;

    public StripeAdapter(StripeSdk conn) {
        this.conn = conn;
    }

    @Override
    public Pagamento executarPagamento(Transacao transacao) {
        System.out.println("Processando pagamento com o gateway do Stripe...");
        StripeSdk.TransactionRequest req = new StripeSdk.TransactionRequest(transacao.numeroCartao(), transacao.valor());
        StripeSdk.TranscationResponse res = this.conn.runTranscation(req);

        return new Pagamento("2026-03-18", "19:24:45", res.success());
    }
}
