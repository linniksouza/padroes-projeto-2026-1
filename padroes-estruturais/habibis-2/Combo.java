
import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemMenu {
    
    private final List<ItemMenu> itens;

    public Combo() {
        this.itens = new ArrayList<>();
    }

    @Override
    public double getPreco() {
        double valor = 0;
        for(ItemMenu item : this.itens){
            valor += item.getPreco();
        }
        
        return valor;
    }

    @Override
    public void adicionar(ItemMenu item) {
        this.itens.add(item);
    }
}
