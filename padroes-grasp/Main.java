public class Main {
    
    public static void main(String[] args) {
        Produto xsalada = new Produto("X-Salada", 10.0);
        Produto coquinha = new Produto("Cola Cola Sem Açúcar lata", 5.0);
        Produto magnum = new Produto("Sorvete Magnum palito", 20.0);

        Pedido pedido = new Pedido();
        pedido.adicionar(xsalada, 2);
        pedido.adicionar(coquinha, 1);
        pedido.adicionar(magnum, 2);

        // pedido.adicionarDadoPagamento("chave_pix", "00000000-0000-0000-0000-000000000000");
        pedido.adicionarDadoPagamento("numero", "0000111122223333");
        pedido.adicionarDadoPagamento("validade", "03/28");
        pedido.adicionarDadoPagamento("cvv", "123");

        // double total = pedido.calcularTotal();
        // System.out.println(String.format("O valor total do pedido é %.2f", total));

        MySQLConnection conn = new MySQLConnection();
        PedidosRepository repository = new MySQLPedidosRepository(conn);
        EmailService emailService = new EmailService();
        // Pagamento pagamento = new Pix();
        Pagamento pagamento = new CartaoCredito();
        PedidoService service = new PedidoService(repository, emailService, pagamento);

        try{
            service.processar(pedido);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
