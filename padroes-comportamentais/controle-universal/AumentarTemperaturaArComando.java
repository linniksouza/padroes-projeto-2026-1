public class AumentarTemperaturaArComando implements ComandoDispositivo {

    private final ArCondicionadoReceiver arCond;

    public AumentarTemperaturaArComando(ArCondicionadoReceiver arCond) {
        this.arCond = arCond;
    }

    @Override
    public void executar() {
        this.arCond.ajustarTemperatura(this.arCond.getTemperatura() + 1);
    }
}
