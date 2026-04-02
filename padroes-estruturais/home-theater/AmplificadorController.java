public class AmplificadorController {

    public void ligar() {
        System.out.println("Ligando o amplificador de som...");
    }

    public void configurarEntradaSom(int volume) {
        System.out.println(String.format("Configurando o volume do som para %d decibeis...", volume));
    }
}
