public class PedidoService {

    private final PedidosRepository repository;
    private final EmailService emailService;
    private final Pagamento pagamentos;

    public PedidoService(PedidosRepository repository, EmailService emailService, Pagamento pagamentos) {
        this.repository = repository;
        this.emailService = emailService;
        this.pagamentos = pagamentos;
    }

    public void processar(Pedido pedido) {
        double total = pedido.calcularTotal();
        System.out.println(String.format("O total do pedido é %.2f reais...", total));

        System.out.println("Processando o pagamento do pedido...");
        this.pagamentos.pagar(total, pedido.getDadosPagamento());

        System.out.println("Salvando o pedido na base de dados...");
        this.repository.salvar(pedido);

        System.out.println("Enviando o e-mail de confirmação para o usuário...");
        this.emailService.enviarEmail(
            "linniksouza@email.com", 
            String.format("Ola Linnik, o seu pedido no valor de %.2f reais foi aprovado com sucesso.", total)
        );
    }
}
