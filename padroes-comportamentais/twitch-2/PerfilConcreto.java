import java.util.ArrayList;
import java.util.List;

public class PerfilConcreto implements Perfil {
    
    private final List<Seguidor> seguidores;

    public PerfilConcreto() {
        this.seguidores = new ArrayList<>();
    }

    @Override
    public void adicionar(Seguidor seguidor) {
        this.seguidores.add(seguidor);
    }

    @Override
    public void bloquear(Seguidor seguidor) {
        this.seguidores.remove(seguidor);
    }

    @Override
    public void notificar(Post novoPost) {
        for(Seguidor s : this.seguidores){
            s.atualizar(novoPost);
        }
    }
}
