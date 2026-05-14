public class ClienteVip implements Desconto {
    
    public double calcular(double valor) {
        return valor * 0.10;
    }
}
