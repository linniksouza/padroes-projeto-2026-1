public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Taxa calculaTaxa = new Icms();
        double preco = 100.0;
        double taxa = 0.10;

        calc.setTaxa(calculaTaxa);
        double valor = calc.calculaImposto(preco, taxa);

        System.out.println("O valor do imposto e: " + valor);
    }
}