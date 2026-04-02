public class Main {

    public static void main(String[] args) {
        Transacao t = new Transacao("12345678900", 1_000_000.00);

        Aprovador conselho = new ConselhoExecutivo();
        Aprovador diretor = new DiretorRegional(conselho);
        Aprovador gerente = new GerenteConta(diretor);

        boolean aprovou = gerente.aprovar(t);
        System.out.println(String.format("Transacao aprovada? %s.", aprovou));
    }
}
