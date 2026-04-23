public class Main {
    
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Geladeira Consul", 3_499);

        try{
            pedido.cancelar();
            pedido.pagar();
            // pedido.enviar();
            // pedido.entregar();
        }catch(EstadoInvalidoException e){
            System.err.println(e);
        }
    }
}
