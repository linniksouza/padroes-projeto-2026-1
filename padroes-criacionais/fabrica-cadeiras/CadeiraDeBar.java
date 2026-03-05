public class CadeiraDeBar implements Cadeira {

    @Override
    public void sentar() {
        System.out.println("Sentando na cadeira de bar. Garcom, desce uma Pitu...");
    }

    @Override
    public void levantar() {
        System.out.println("Levantei da cadeira de bar. Meu bacharel, a conta...");
    }

    @Override
    public void arrastar() {
        System.out.println("Arrasando a cadeira de bar. Comecou uma briga...");
    }
}
