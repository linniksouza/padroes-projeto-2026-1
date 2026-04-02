public abstract class Aprovador {

    protected final Aprovador proximo;

    public Aprovador(Aprovador proximo) {
        this.proximo = proximo;
    }
    
    public abstract boolean aprovar(Transacao transacao);
 
}
