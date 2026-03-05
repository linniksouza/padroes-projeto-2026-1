public class Calculadora {

    private Taxa taxa;
    
    public double calculaImposto(double preco, double taxa) {
        return this.taxa.calcula(preco, taxa);
    }

    public void setTaxa(Taxa taxa) {
        this.taxa = taxa;
    }
}
