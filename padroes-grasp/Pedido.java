import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Pedido {

    private final List<ItemPedido> itens;
    private final Map<String, String> dadosPagamento;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.dadosPagamento = new HashMap<>();
    }

    public Map<String, String> getDadosPagamento() {
        return this.dadosPagamento;
    }

    public void adicionar(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for(ItemPedido item : this.itens)
            total += item.calcularSubTotal();

        return total;
    }

    public void adicionarDadoPagamento(String chave, String valor) {
        this.dadosPagamento.put(chave, valor);
    }
}
