import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AutenticadorResolver {
    
    private final Map<Api, Autenticador> autenticadores;

    public AutenticadorResolver() {
        this.autenticadores = new HashMap<>();
        this.autenticadores.putAll(Map.of(
            Api.API_A, new BasicAutenticador("usuario_api_a", "senha_usuario_api_a"),
            Api.API_B, new JwtAutenticador("72636753786253", "jdhvt7egro837t", "usuario_api_b"),
            Api.API_C, new JwtAutenticador("836283t297632", "judg8wgh9387teg6w", "usuario_api_c")
        ));
    }

    public Optional<Autenticador> resolve(Api api) {
        Optional<Autenticador> auth = Optional.empty();

        if(this.autenticadores.containsKey(api)){
            Autenticador autenticador = this.autenticadores.get(api);
            auth = Optional.of(autenticador);
        }

        return auth;
    }
}
