
import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private final Map<TipoArvore, Arvore> arvores;

    public ArvoreFactory() {
        this.arvores = new HashMap<>();
    }

    public Arvore getArvore(TipoArvore tipo) {
        if(this.arvores.containsKey(tipo)){
            return this.arvores.get(tipo);
        }else{
            System.out.println(String.format("Criando uma nova arvore do tipo %s", tipo));
            Arvore arvore = new ArvoreConcreta(tipo, "Suave", 2, 10);
            this.arvores.put(tipo, arvore);

            return arvore;
        }
    }
}
