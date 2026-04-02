
import java.util.HashMap;
import java.util.Map;

public class ControleRemotoInvoker {

    private final Map<Botao, ComandoDispositivo> comandos;

    public ControleRemotoInvoker() {
        this.comandos = new HashMap<>();
    }

    public void setComando(Botao botao, ComandoDispositivo comando) {
        this.comandos.put(botao, comando);
    }

    public void pressionarBotao(Botao botao) {
        ComandoDispositivo comando = this.comandos.get(botao);

        if(comando == null){
            System.out.println(String.format("Botao '%s' nao tem comando para executar!", botao));
        }else{
            comando.executar();
        }
    }
}
