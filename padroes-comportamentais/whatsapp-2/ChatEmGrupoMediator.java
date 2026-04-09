import java.util.HashSet;
import java.util.Set;

public class ChatEmGrupoMediator implements ChatMediator {
    
    private final Set<Usuario> usuarios;

    public ChatEmGrupoMediator() {
        this.usuarios = new HashSet<>();
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario usuario) {
        for(Usuario u : this.usuarios){
            if(!u.getNome().equals(usuario.getNome()))
                u.receber(mensagem);
        }
    }

    @Override
    public void adicionar(Usuario usuario) {
        this.usuarios.add(usuario);
    }
}
