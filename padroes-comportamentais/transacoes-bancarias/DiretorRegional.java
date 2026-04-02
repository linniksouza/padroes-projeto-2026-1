public class DiretorRegional extends Aprovador {

    public DiretorRegional(Aprovador proximo) {
        super(proximo);
    }

    @Override
    public boolean aprovar(Transacao transacao) {
        if(transacao.valorTransacao() > 50_000)
            return this.proximo.aprovar(transacao);

        System.out.println(String.format("Diretor regional aprovou a transacao de %.2f da conta %s...", transacao.valorTransacao(), transacao.numeroConta()));

        return true;
    }
}
