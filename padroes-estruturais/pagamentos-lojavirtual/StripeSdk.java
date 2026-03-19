public class StripeSdk {

    public static record TransactionRequest(
        String cardNumber,
        double amount
    ) {}

    public static record TranscationResponse(
        boolean success
    ) {}

    public TranscationResponse runTranscation(TransactionRequest request) {
        System.out.println(String.format("Processando pagamento no Stripe: %s", request));

        return new TranscationResponse(true);
    }
}
