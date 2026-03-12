public class NPCSemVidaException extends RuntimeException {
    
    public NPCSemVidaException(String nomeNpc) {
        super(String.format("NPC '%s' sem vida, deve sair.", nomeNpc));
    }
}
