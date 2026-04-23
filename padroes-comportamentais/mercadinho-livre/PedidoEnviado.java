public class PedidoEnviado implements EstadoPedido {
    
    public void pagar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi postado para entrega.");
    }

    public void enviar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi postado para entrega.");
    }

    public void entregar(Pedido pedido) {
        System.out.println(String.format("Entregando o pedido %s...", pedido));
    }

    public void cancelar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi postado para entrega.");
    }
}
