public class DesligarArComando implements ComandoDispositivo {
    
    private final ArCondicionadoReceiver arCond;

    public DesligarArComando(ArCondicionadoReceiver arCond) {
        this.arCond = arCond;
    }

    @Override
    public void executar() {
        this.arCond.desligar();
    }
}
