import java.util.ArrayList;
import java.util.List;

public class SaveManager {

    private final List<Memento> progresso;

    private final Personagem personagem;

    public SaveManager(Personagem personagem) {
        this.personagem = personagem;
        this.progresso = new ArrayList<>();
    }

    public void addSave(Memento save) {
        this.progresso.add(save);
        this.personagem.storeFromMemento(save);
    }

    public Memento getSave(int index) {
        return this.progresso.get(index);
    }

    public void loadSave(int index) {
        Memento save = this.getSave(index);

        if(save != null){
            this.personagem.storeFromMemento(save);
        }
    }
}
