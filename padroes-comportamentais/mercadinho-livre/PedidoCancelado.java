public class PedidoCancelado implements EstadoPedido {
    
    public void pagar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi cancelado.");
    }

    public void enviar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi cancelado.");
    }

    public void entregar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi cancelado.");
    }

    public void cancelar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi cancelado.");
    }
}
