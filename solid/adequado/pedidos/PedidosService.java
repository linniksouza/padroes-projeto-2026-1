public class PedidosService {
    
    private PedidosRepository repository;

    public PedidosService(PedidosRepository repository) {
        this.repository = repository;
    }

    public void salvar() {
        this.repository.salvar();
    }
}
