import java.util.Base64;

public class JwtAutenticador implements Autenticador {
    
    private final String clientId;

    private final String clientSecret;

    private final String username;

    public JwtAutenticador(String clientId, String clientSecret, String username) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.username = username;
    }

    public String getAuthorization() {
        String credenciais = String.format("{client_id: %s, client_secret: %s, username: %s", this.clientId, this.clientSecret, this.username);
        String jwt = Base64.getEncoder().encodeToString(credenciais.getBytes());

        return String.format("Bearer %s", jwt);
    }
}
