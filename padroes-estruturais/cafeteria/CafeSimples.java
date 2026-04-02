public class CafeSimples implements Cafe {
    
    private final String descricao;
    private final double custo;

    public CafeSimples(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getCusto() {
        return this.custo;
    }
}
