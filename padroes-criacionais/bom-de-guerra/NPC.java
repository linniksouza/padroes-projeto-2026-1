public interface NPC {

    int atacar();

    void calcularDano(int dano);

    int getPontosVida();

    NPC clonar();

}
