public class Main {
    
    public static void main(String[] args) {
        PayPalSdk paypalSdk = new PayPalSdk();
        StripeSdk stripeSdk = new StripeSdk();
        // ProcessadorPagamentos processador = new StripeAdapter(stripeSdk);
        ProcessadorPagamentos processador = new PayPalAdapter(paypalSdk);

        Transacao transacao = new Transacao("7638987309263", "123", 120.0);
        Pagamento pago = processador.executarPagamento(transacao);
        System.out.println(String.format("Pagamento processado: %s", pago));
    }
}
