public abstract class CafeDecorator implements Cafe {
    
    protected final Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String getDescricao() {
        return this.cafeDecorado.getDescricao();
    }

    @Override
    public double getCusto() {
        return this.cafeDecorado.getCusto();
    }
}
