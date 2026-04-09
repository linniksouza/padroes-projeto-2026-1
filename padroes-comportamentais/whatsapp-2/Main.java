public class Main {

    public static void main(String[] args) {
        ChatMediator grupo = new ChatEmGrupoMediator();

        Usuario u1 = new UsuarioChat("Usuario 1", grupo);
        Usuario u2 = new UsuarioChat("Usuario 2", grupo);
        Usuario u3 = new UsuarioChat("Usuario 3", grupo);

        grupo.adicionar(u1);
        grupo.adicionar(u2);
        grupo.adicionar(u3);

        u1.enviar("Bom dia grupo");
        u2.enviar("gif-bom-dia.gif");
        u1.enviar("Opa, ai sim");
        u3.enviar("Vao dormir, ainda e madrugada...");
    }
}
