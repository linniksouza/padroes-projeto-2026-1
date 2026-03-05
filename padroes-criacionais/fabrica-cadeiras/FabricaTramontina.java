public class FabricaTramontina implements FabricaDeCadeiras {

    @Override
    public Cadeira fabricarCadeira() {
        return new CadeiraDeBar();
    }
}
