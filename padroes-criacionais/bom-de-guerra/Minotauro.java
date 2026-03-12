public class Minotauro implements NPC {

    private int pontosVida;

    private int pontosAtaque;

    private int pontosDanoMachado;

    public Minotauro(int pontosVida, int pontosAtaque, int pontosDanoMachado) {
        this.pontosVida = pontosVida;
        this.pontosAtaque = pontosAtaque;
        this.pontosDanoMachado = pontosDanoMachado;
    }

    @Override
    public int atacar() {
        return this.pontosAtaque + this.pontosDanoMachado;
    }

    @Override
    public void calcularDano(int dano) {
        int pontosVidaRestante = this.pontosVida - dano;

        if(pontosVidaRestante <= 0)
            throw new NPCSemVidaException("Minotauro");

        this.pontosVida = pontosVidaRestante;
    }

    @Override
    public int getPontosVida() {
        return this.pontosVida;
    }

    @Override
    public NPC clonar() {
        return new Minotauro(
            this.pontosVida, 
            this.pontosAtaque, 
            this.pontosDanoMachado
        );
    }
}
