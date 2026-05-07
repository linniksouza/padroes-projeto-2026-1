public class EmailService {
    
    public void enviarEmail(String destino, String mensagem) {
        System.out.println(String.format("Enviando um e-mail para o destino '%s': %s", destino, mensagem));
    }
}
