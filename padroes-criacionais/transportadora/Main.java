public class Main {
    
    public static void main(String[] args) {
        Logistica logistica = new LogisticaRodoviaria();
        // Logistica logistica = new LogisticaNaval();
        // Logistica logistica = new LogisticaAerea();

        Transporte modal = logistica.prepararModal();
        modal.iniciarViagem();
    }
}
