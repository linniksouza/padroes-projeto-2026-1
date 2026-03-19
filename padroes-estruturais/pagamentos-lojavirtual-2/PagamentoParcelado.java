public class PagamentoParcelado implements Pagamento {
    
    private final FormaPagamento forma;

    private final int totalParcelas;

    public PagamentoParcelado(FormaPagamento forma, int totalParcelas) {
        this.forma = forma;
        this.totalParcelas = totalParcelas;
    }

    @Override
    public boolean executar(InfosPagamento infos) {
        System.out.println(String.format("Processando um pagamento parcelado em %s vezes...", this.totalParcelas));
        boolean pago = this.forma.efetuar(infos.valor() / this.totalParcelas);

        if(pago){
            System.out.println("Pagamento processado com sucesso");
        }else{
            System.out.println("Pagamento nao efetuado...");
        }

        return pago;
    }
}
