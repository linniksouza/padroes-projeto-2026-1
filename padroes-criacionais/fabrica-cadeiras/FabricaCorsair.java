public class FabricaCorsair implements FabricaDeCadeiras {

    @Override
    public Cadeira fabricarCadeira() {
        return new CadeiraGamer();
    }
}
