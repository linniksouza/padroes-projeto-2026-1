public class Main {

    public static void main(String[] args) {
        InfosPagamento t = new InfosPagamento("7463846902374023", "123", "12345678900", 100, "7252673/123");

        FormaPagamento forma = new PIX();
        // FormaPagamento forma = new Boleto();
        // Pagamento p = new PagamentoAVista(forma);
        Pagamento p = new PagamentoParcelado(forma, 3);

        boolean pago = p.executar(t);
        if(pago){
            System.out.println("Sucesso, preparando envio...");
        }else{
            System.out.println("Recusado...");
        }
    }
}
