public class LigarArComando implements ComandoDispositivo {

    private final ArCondicionadoReceiver arCon;

    public LigarArComando(ArCondicionadoReceiver arCond) {
        this.arCon = arCond;
    }

    @Override
    public void executar() {
        this.arCon.ligar();
    }
}
