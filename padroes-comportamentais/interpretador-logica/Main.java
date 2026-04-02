public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(17, "AM", false);

        Expressao condicaoIdade = new CondicaoIdade(18);
        Expressao condicaoUf = new CondicaoUF("AM");
        Expressao condicaoAssinante = new CondicaoAssinante();

        Expressao operadorE = new OperadorE(condicaoIdade, condicaoUf);
        Expressao operadorOU = new OperadorOU(operadorE, condicaoAssinante);

        boolean resultado = operadorOU.interpretar(cliente);
        System.out.println(String.format("Cliente %s respeitou todas as condicoes? %s", cliente, resultado));
    }
}
