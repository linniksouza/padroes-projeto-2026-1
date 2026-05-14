public class Main {

    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        Desconto desconto = new ClienteAcionista();
        double valorDesconto = calculadora.calcular(desconto, 100.0);
        System.out.println(String.format("Valor do desconto aplicado: %.2f", valorDesconto));
    }
}
