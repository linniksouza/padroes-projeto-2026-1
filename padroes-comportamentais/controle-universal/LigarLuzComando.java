public class LigarLuzComando implements ComandoDispositivo {

    private final LampadaReceiver lamp;

    private boolean ligado;

    public LigarLuzComando(LampadaReceiver lamp) {
        this.lamp = lamp;
        this.ligado = false;
    }

    @Override
    public void executar() {
        if(this.ligado)
            this.lamp.desligar();
        else
            this.lamp.ligar();

        this.ligado = !this.ligado;
    }
}
