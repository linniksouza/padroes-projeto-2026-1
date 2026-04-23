public class PedidoEntregue implements EstadoPedido {
    
    public void pagar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi entregue.");
    }

    public void enviar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi entregue.");
    }

    public void entregar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi entregue.");
    }

    public void cancelar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi entregue.");
    }
}
