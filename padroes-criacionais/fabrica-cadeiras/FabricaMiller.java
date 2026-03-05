public class FabricaMiller implements FabricaDeCadeiras {

    @Override
    public Cadeira fabricarCadeira() {
        return new CadeiraDeEscritorio();
    }
}
