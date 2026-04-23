import java.util.Base64;

public class BasicAutenticador implements Autenticador {

    private final String username;

    private final String password;

    public BasicAutenticador(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getAuthorization() {
        String credenciais = String.format("%s:%s", this.username, this.password);
        String basic = Base64.getEncoder().encodeToString(credenciais.getBytes());

        return String.format("Basic %s", basic);
    }
}
