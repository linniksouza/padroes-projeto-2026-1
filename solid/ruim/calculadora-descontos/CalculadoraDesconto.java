public class CalculadoraDesconto {
    
    public double calcular(String tipoCliente, double valor) {
        if(tipoCliente.equals("COMUM"))
            return valor * 0.05;

        if(tipoCliente.equals("VIP"))
            return valor * 0.10;

        return 0;
    }
}
