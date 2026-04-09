public class Personagem {
    
    private int hp;

    private String level;

    public Personagem(int hp, String level) {
        this.hp = hp;
        this.level = level;
    }

    public Memento createMemento() {
        return new Memento(this.hp, this.level);
    }

    public void storeFromMemento(Memento memento) {
        this.hp = memento.getHp();
        this.level = memento.getLevel();
    }
}
