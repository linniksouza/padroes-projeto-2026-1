public class GerenteConta extends Aprovador {
    
    public GerenteConta(Aprovador proximo) {
        super(proximo);
    }

    @Override
    public boolean aprovar(Transacao transacao) {
        if(transacao.valorTransacao() > 5_000)
            return this.proximo.aprovar(transacao);

        System.out.println(String.format("Gerente de conta aprovou a transacao de %.2f da conta %s...", transacao.valorTransacao(), transacao.numeroConta()));

        return true;
    }
}
