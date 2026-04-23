public class PedidoPago implements EstadoPedido {
    
    public void pagar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ja foi pago.");
    }

    public void enviar(Pedido pedido) {
        System.out.println(String.format("Preparando o envio do pedido %s...", pedido));
    }

    public void entregar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido ainda nao foi postado para entrega.");
    }

    public void cancelar(Pedido pedido) {
        System.out.println(String.format("Cancelando o pedido %s...", pedido));
    }
}
