public class SeguidorConcreto implements Seguidor {

    private final String nome;

    public SeguidorConcreto(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void atualizar(Post ultimoPost) {
        System.out.println(String.format("%s recebeu a notificacao de um novo post: %s", this.nome, ultimoPost));
    }
}
