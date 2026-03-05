public class CadeiraDeEscritorio implements Cadeira {

    @Override
    public void sentar() {
        System.out.println("Sentando na cadeira de escritorio, comecando a reuniao...");
    }

    @Override
    public void levantar() {
        System.out.println("Levantei da cadeira de escritorio, acabou a reuniao...");
    }

    @Override
    public void arrastar() {
        System.out.println("Arrastando a cadeira de escritorio, ganhei um Sonho de Valsa...");
    }
}
