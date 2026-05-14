public class Main {
    
    public static void main(String[] args) {
        // PedidosRepository repository = new MySQLPedidosRepository();
        PedidosRepository repository = new ApacheCassandraPedidosRepository();
        PedidosService service = new PedidosService(repository);

        service.salvar();
    }
}
