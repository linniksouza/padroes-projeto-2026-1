public class Memento {
    
    private int hp;

    private String level;

    public Memento(int hp, String level) {
        this.hp = hp;
        this.level = level;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int novoHp) {
        this.hp = novoHp;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String novoLevel) {
        this.level = novoLevel;
    }

    @Override
    public String toString() {
        return String.format("Mineirinho(HP=%d, Level=%s)", this.hp, this.level);
    }
}
