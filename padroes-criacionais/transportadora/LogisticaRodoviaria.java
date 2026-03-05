public class LogisticaRodoviaria implements Logistica {

    @Override
    public Transporte prepararModal() {
        return new Caminhao();
    }
}
