public class HomeTheater {

    private final VideoController video;
    private final AmplificadorController som;
    private final ProjetorController projetor;

    public HomeTheater(String midia) {
        this.video = new VideoController(midia);
        this.som = new AmplificadorController();
        this.projetor = new ProjetorController();
    }

    public void configurar() {
        this.projetor.ligar();
        this.projetor.baixarTela();
        this.som.ligar();
        this.som.configurarEntradaSom(50);
        this.video.ligar();
    }

    public void iniciar() {
        this.video.iniciarVideo();
    }
}
