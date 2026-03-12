public class Esqueleto implements NPC {

    private int pontosVida;

    private int pontosAtaque;

    public Esqueleto(int pontosVida, int pontosAtaque) {
        this.pontosVida = pontosVida;
        this.pontosAtaque = pontosAtaque;
    }

    @Override
    public int atacar() {
        return this.pontosAtaque;
    }

    @Override
    public void calcularDano(int dano) {
        int pontosVidaRestante = this.pontosVida - dano;

        if(pontosVidaRestante <= 0)
            throw new NPCSemVidaException("Esqueleto");

        this.pontosVida = pontosVidaRestante;
    }

    @Override
    public int getPontosVida() {
        return this.pontosVida;
    }

    @Override
    public NPC clonar() {
        return new Esqueleto(
            this.pontosVida,
            this.pontosAtaque
        );
    }
}
