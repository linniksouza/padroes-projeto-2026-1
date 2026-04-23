public class Pedido {

    private final String produto;

    private final double valor;
    
    private EstadoPedido estadoAtual;

    public Pedido(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
        this.estadoAtual = new PedidoPendente();
    }

    public void pagar() {
        this.estadoAtual.pagar(this);
        this.estadoAtual = new PedidoPago();
    }

    public void enviar() {
        this.estadoAtual.enviar(this);
        this.estadoAtual = new PedidoEnviado();
    }

    public void entregar() {
        this.estadoAtual.entregar(this);
        this.estadoAtual = new PedidoEntregue();
    }

    public void cancelar() {
        this.estadoAtual.cancelar(this);
        this.estadoAtual = new PedidoCancelado();
    }

    @Override
    public String toString() {
        return String.format("Pedido(produto=%s, valor=%.2f)", this.produto, this.valor);
    }
}
