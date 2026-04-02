public class Main {

    public static void main(String[] args) {
        ArCondicionadoReceiver arCond = new ArCondicionadoReceiver(20);
        ComandoDispositivo ligarLuz = new LigarLuzComando(new LampadaReceiver());
        ComandoDispositivo ligarAr = new LigarArComando(arCond);
        ComandoDispositivo desligarAr = new DesligarArComando(arCond);
        ComandoDispositivo aumentarTemp = new AumentarTemperaturaArComando(arCond);
        ControleRemotoInvoker invoker = new ControleRemotoInvoker();

        invoker.setComando(Botao.BOTAO_LAMPADA, ligarLuz);
        invoker.setComando(Botao.BOTAO_LIGAR_AR_CONDICIONADO, ligarAr);
        invoker.setComando(Botao.BOTAO_DESLIGAR_AR_CONDICIONADO, desligarAr);
        invoker.setComando(Botao.BOTAO_AUMENTAR_TEMPERATURA, aumentarTemp);

        invoker.pressionarBotao(Botao.BOTAO_LAMPADA);
        invoker.pressionarBotao(Botao.BOTAO_LAMPADA);
        invoker.pressionarBotao(Botao.BOTAO_SOM);
        invoker.pressionarBotao(Botao.BOTAO_LIGAR_AR_CONDICIONADO);
        invoker.pressionarBotao(Botao.BOTAO_AUMENTAR_TEMPERATURA);
        invoker.pressionarBotao(Botao.BOTAO_AUMENTAR_TEMPERATURA);
        invoker.pressionarBotao(Botao.BOTAO_AUMENTAR_TEMPERATURA);
        invoker.pressionarBotao(Botao.BOTAO_DESLIGAR_AR_CONDICIONADO);
        invoker.pressionarBotao(Botao.BOTAO_LIGAR_AR_CONDICIONADO);
    }
}
