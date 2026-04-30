
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CartVisitor calculaTotal = new CalcularTotalVisitor();
        CartVisitor calculaImposto = new CalcularImpostoVisitor();
        CartVisitor calculaDesconto = new CalcularDescontoVisitor();

        List<Produto> produtos = Arrays.asList(
            new Produto[]{
                new ProdutoVestuario("Calca pra jovem de 16 anos", 1, 301.00),
                new ProdutoEletronico("iPhone 18", 1, 12000.0),
                new ProdutoEletronico("Teclado Redragon", 3, 249.90),
                new ProdutoVestuario("Camisa de time", 10, 89.99),
                new ProdutoAlimenticio("Arroz Cacarola", 30, 3.99)
            }
        );

        for(Produto produto : produtos){
            double imposto = produto.calcular(calculaImposto);
            double desconto = produto.calcular(calculaDesconto);
            double total = produto.calcular(calculaTotal);

            total = total - desconto + imposto;
            System.out.println(String.format("Produto: %s | Valor total: %.2f", produto, total));
        }
    }
}
