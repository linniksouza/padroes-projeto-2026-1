public class Leite extends CafeDecorator {

    public Leite(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return this.cafeDecorado.getDescricao() + ", com leite";
    }

    @Override
    public double getCusto() {
        return this.cafeDecorado.getCusto() + 2.0;
    }
}
