public class Main {
    
    public static void main(String[] args) {
        ImpressoraTermica termica = new ImpressoraTermica();
        ImpressoraHp hp = new ImpressoraHp();

        termica.imprimir();

        hp.imprimir();
        hp.copiar();
        hp.escanear();
    }
}
