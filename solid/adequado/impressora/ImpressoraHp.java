public class ImpressoraHp implements Impressora, Escaner, Copiadora {

    @Override
    public void copiar() {
        System.out.println("Tirando xerox do documento...");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando o documento...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo o documento...");
    }
}
