public class ClienteComum implements Desconto {
    
    public double calcular(double valor) {
        return valor * 0.05;
    }
}
