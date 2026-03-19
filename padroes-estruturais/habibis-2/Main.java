public class Main {

    public static void main(String[] args) {
        ItemMenu raiz = new Combo();

        ItemMenu xSalada = new ItemAvulso(20.0);
        raiz.adicionar(xSalada);

        ItemMenu combo = new Combo();
        combo.adicionar(new ItemAvulso(30.0));
        combo.adicionar(new ItemAvulso(15.0));
        combo.adicionar(new ItemAvulso(5.0));
        combo.adicionar(new ItemAvulso(3.0));
        raiz.adicionar(combo);

        double valorTotal = raiz.getPreco();
        System.out.println(String.format("Valor do pedido: %.2f", valorTotal));
    }
}
