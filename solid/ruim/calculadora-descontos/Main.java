public class Main {
    
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double desconto = calculadora.calcular("COMUM", 100.0);
        System.out.println(String.format("Desconto aplicado ao cliente: %.2f", desconto));
    }
}
