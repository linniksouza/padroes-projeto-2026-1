import java.util.Optional;

public class Controller {
    
    private final AutenticadorResolver resolver;

    public Controller(AutenticadorResolver resolver) {
        this.resolver = resolver;
    }

    public String action(String request, Api api) {
        Optional<Autenticador> auth = this.resolver.resolve(api);

        if(auth.isEmpty())
            throw new IllegalArgumentException(String.format("Autenticacao nao disponivel para a API %.s", api));

        Autenticador autenticador = auth.get();
        String token = autenticador.getAuthorization();
        System.out.println(String.format("Autenticando na API %s com este token: %s", api, token));

        return "OK";
    }
}
