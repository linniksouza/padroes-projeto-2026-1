public class PedidosService {

    private MySQLPedidosRepository repository = new MySQLPedidosRepository();

    public void salvar() {
        this.repository.salvar();
    }
}
