public class LogisticaNaval implements Logistica {

    @Override
    public Transporte prepararModal() {
        return new Navio();
    }
}
