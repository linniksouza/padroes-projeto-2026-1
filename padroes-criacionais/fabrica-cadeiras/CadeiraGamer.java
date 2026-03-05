public class CadeiraGamer implements Cadeira {

    @Override
    public void sentar() {
        System.out.println("Sentando na cadeira gamer, ligando os RGBs...");
    }

    @Override
    public void levantar() {
        System.out.println("Levantei da cadeira gamer, desligando os LEDs...");
    }

    @Override
    public void arrastar() {
        System.out.println("Arrastando a cadeira gamer, toca um sonzinho...");
    }
}
