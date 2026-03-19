public class PayPalSdk {

    public boolean makeRequest(String cardNumber, double amount) {
        System.out.println(String.format("Executando cobranca de cartao %s com o valor %.2f", cardNumber, amount));

        return true;
    }
}
