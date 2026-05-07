public class MySQLPedidosRepository implements PedidosRepository {

    private MySQLConnection conn;

    public MySQLPedidosRepository(MySQLConnection conn) {
        this.conn = conn;
    }

    @Override
    public void salvar(Pedido pedido) {
        this.conn.execute("INSERT INTO pedidos VALUES ('Coquinha', 2, 5.0);");
    }
}
