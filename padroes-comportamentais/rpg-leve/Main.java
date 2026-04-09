public class Main {

    public static void main(String[] args) {
        int totalSaves = 0;
        Personagem mineirinho = new Personagem(50, "stage-1");
        SaveManager saves = new SaveManager(mineirinho);

        Memento m = mineirinho.createMemento();
        System.out.println("Comecou a gameplay.");
        System.out.println(m);

        m.setHp(25);
        System.out.println("Mineirinho tomou dano.");
        System.out.println(m);

        m.setLevel("stage-2");
        System.out.println("Mineirinho passou de level.");
        System.out.println(m);

        System.out.println("Salvando progresso do Mineirinho.");
        saves.addSave(m);
        totalSaves = totalSaves + 1;

        m = mineirinho.createMemento();

        m.setHp(20);
        System.out.println("Mineirinho tomou dano.");
        System.out.println(m);

        m.setHp(35);
        System.out.println("Mineirinho comeu uma pimenta e restaurou HP.");
        System.out.println(m);

        m.setLevel("stage-3");
        System.out.println("Mineirinho passou de level.");
        System.out.println(m);

        System.out.println("Salvando progresso do Mineirinho.");
        saves.addSave(m);
        totalSaves = totalSaves + 1;

        System.out.println("Mineirinho morreu. Restaurando checkpoint.");
        saves.loadSave(totalSaves - 1);

        m = mineirinho.createMemento();
        System.out.println("Mineirinho voltou a ativa.");
        System.out.println(m);
    }
}
