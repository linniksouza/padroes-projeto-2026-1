public interface Perfil {
 
    void adicionar(Seguidor seguidor);

    void bloquear(Seguidor seguidor);

    void notificar(Post novoPost);

}
