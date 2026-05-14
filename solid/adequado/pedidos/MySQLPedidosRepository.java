public class MySQLPedidosRepository implements PedidosRepository {

    @Override
    public void salvar() {
        System.out.println("Salvando um pedido no banco de dados MySQL...");
    }
}
