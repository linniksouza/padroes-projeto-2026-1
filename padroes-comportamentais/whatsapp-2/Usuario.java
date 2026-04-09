public abstract class Usuario {
    
    private final String nome;

    private final ChatMediator mediador;

    public Usuario(String nome, ChatMediator mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    public String getNome() {
        return this.nome;
    }

    public void enviar(String mensagem) {
        this.mediador.enviarMensagem(mensagem, this);
    }

    public void receber(String mensagem) {
        System.out.println(String.format("Mensagem recebida pelo usuario '%s': %s", this.nome, mensagem));
    }
}
