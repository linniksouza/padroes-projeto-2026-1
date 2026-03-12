public class Main {
    
    public static void main(String[] args) {
        NPC protoEsqueleto = new Esqueleto(350, 10);
        NPC protoMinotauro = new Minotauro(1100, 150, 50);
        NPC protoSirene = new Sirene(1100, 100, 20);
        Gameplay gameplay = new Gameplay(protoEsqueleto, protoMinotauro, protoSirene);

        gameplay.iniciarMapa(5, 2, 2);

        try{
            System.out.println("[Trilha sonora de Bom de Guerra] comecou...");
            gameplay.jogar();
            System.out.println("Cleiton ganhou a partida.");
        }catch(GameOverExeption e){
            System.out.println("Cleiton perdeu.");
        }
    }
}
