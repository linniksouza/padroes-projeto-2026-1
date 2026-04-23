public class PedidoPendente implements EstadoPedido {
    
    public void pagar(Pedido pedido) {
        System.out.println(String.format("Processando o pagamento do pedido %s...", pedido));
    }

    public void enviar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido com pagamento pendente.");
    }

    public void entregar(Pedido pedido) {
        throw new EstadoInvalidoException("Pedido com pagamento pendente.");
    }

    public void cancelar(Pedido pedido) {
        System.out.println(String.format("Cancelando o pedido %s...", pedido));
    }
}
