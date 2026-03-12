import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gameplay {
    
    private NPC protoEsqueleto;

    private NPC protoMinotauro;

    private NPC protoSirene;
    
    private List<NPC> inimigos;

    public Gameplay(NPC protoEsqueleto, NPC protoMinotauro, NPC protoSirene) {
        this.protoEsqueleto = protoEsqueleto;
        this.protoMinotauro = protoMinotauro;
        this.protoSirene = protoSirene;
        this.inimigos = new ArrayList<>();
    }

    public void adicionarEsqueleto() {
        this.inimigos.add(this.protoEsqueleto.clonar());
    }

    public void adicionarMinotauro() {
        this.inimigos.add(this.protoMinotauro.clonar());
    }

    public void adicionarSirene() {
        this.inimigos.add(this.protoSirene.clonar());
    }

    public void iniciarMapa(int totalEsqueletos, int totalMinotauros, int totalSirenes) {
        for(int i = 0; i < totalEsqueletos; i++)
            this.adicionarEsqueleto();

        for(int i = 0; i < totalMinotauros; i++)
            this.adicionarMinotauro();

        for(int i = 0; i < totalSirenes; i++)
            this.adicionarSirene();
    }

    public void jogar() {
        int pontosVida = 2000;
        int pontosAtaque = 100;

        while(!this.inimigos.isEmpty()){
            NPC inimigo = this.sortear();

            try{
                inimigo.calcularDano(pontosAtaque);
                System.out.println(String.format("Cleiton deu %d pontos de dano em um NPC. O NPC esta com %d pontos de vida...", pontosAtaque, inimigo.getPontosVida()));

                int dano = inimigo.atacar();
                pontosVida = pontosVida - dano;
                System.out.println(String.format("Cleiton recebe %d pontos de dano. Ficou com %d...", dano, pontosVida));

                this.adicionarEsqueleto();

                try{
                    Thread.currentThread().sleep(2000);
                }catch(Exception e){}

                if(pontosVida <= 0)
                    throw new GameOverExeption();
            }catch(NPCSemVidaException e){
                System.out.println(e.getMessage());
                this.inimigos.remove(inimigo);
            }
        }
    }

    private NPC sortear() {
        Random rand = new Random();
        int posicao = rand.nextInt(this.inimigos.size());

        return this.inimigos.get(posicao);
    }
}
