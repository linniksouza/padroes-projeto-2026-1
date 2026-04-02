public class VideoController {

    private final String midia;

    public VideoController(String midia) {
        this.midia = midia;
    }

    public void ligar() {
        System.out.println("Ligando o Blu-Ray...");
    }

    public void iniciarVideo() {
        System.out.println(String.format("Iniciando a reproducao do filme '%s'", this.midia));
    }
}
