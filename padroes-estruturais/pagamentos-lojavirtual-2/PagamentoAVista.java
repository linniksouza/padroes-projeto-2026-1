public class PagamentoAVista implements Pagamento {
    
    private final FormaPagamento forma;

    public PagamentoAVista(FormaPagamento forma) {
        this.forma = forma;
    }

    @Override
    public boolean executar(InfosPagamento infos) {
        System.out.println("Processando um pagamento a vista...");
        boolean pago = this.forma.efetuar(infos.valor());

        if(pago){
            System.out.println("Pagamento processado com sucesso");
        }else{
            System.out.println("Pagamento nao efetuado...");
        }

        return pago;
    }
}
