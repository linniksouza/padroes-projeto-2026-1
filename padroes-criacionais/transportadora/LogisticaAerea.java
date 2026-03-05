public class LogisticaAerea implements Logistica {

    @Override
    public Transporte prepararModal() {
        return new Aviao();
    }
}
