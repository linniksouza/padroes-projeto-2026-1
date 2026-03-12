public class Sirene implements NPC {

    private int pontosVida;

    private int pontosAtaque;

    private int pontosEscudo;

    public Sirene(int pontosVida, int pontosAtaque, int pontosEscudo) {
        this.pontosVida = pontosVida;
        this.pontosAtaque = pontosAtaque;
        this.pontosEscudo = pontosEscudo;
    }

    @Override
    public int atacar() {
        return this.pontosAtaque;
    }

    @Override
    public void calcularDano(int dano) {
        int pontosVidaRestantes = this.pontosVida - (dano - this.pontosEscudo);

        if(pontosVidaRestantes <= 0)
            throw new NPCSemVidaException("Sirene");

        this.pontosVida = pontosVidaRestantes;
    }

    @Override
    public int getPontosVida() {
        return this.pontosVida;
    }

    @Override
    public NPC clonar() {
        return new Sirene(
            this.pontosVida,
            this.pontosAtaque,
            this.pontosEscudo
        );
    }
}
