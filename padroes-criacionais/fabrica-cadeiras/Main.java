public class Main {
    
    public static void main(String[] args) {
        FabricaDeCadeiras fabrica = new FabricaMiller();
        Cadeira cadeira = fabrica.fabricarCadeira();

        cadeira.sentar();
        cadeira.levantar();
        cadeira.arrastar();
    }
}
