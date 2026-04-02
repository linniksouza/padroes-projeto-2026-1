public class ConselhoExecutivo extends Aprovador {

    public ConselhoExecutivo() {
        super(null);
    }

    @Override
    public boolean aprovar(Transacao transacao) {
        System.out.println(String.format("Conselho executivo aprovou a transacao de %.2f da conta %s...", transacao.valorTransacao(), transacao.numeroConta()));

        return true;
    }
}
