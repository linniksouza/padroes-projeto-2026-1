public class Nescau extends CafeDecorator {

    public Nescau(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return this.cafeDecorado.getDescricao() + ", com Nescau";
    }

    @Override
    public double getCusto() {
        return this.cafeDecorado.getCusto() + 0.5;
    }
}
