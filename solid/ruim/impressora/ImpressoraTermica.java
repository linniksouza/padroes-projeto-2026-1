public class ImpressoraTermica implements Multifuncional {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo cupom...");
    }

    @Override
    public void escanear() {
        throw new UnsupportedOperationException("Não escaneia.");
    }

    @Override
    public void copiar() {
        throw new UnsupportedOperationException("Não copia");
    }
}
