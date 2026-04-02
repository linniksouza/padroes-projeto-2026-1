public class Main {
    
    public static void main(String[] args) {
        Cafe cafe = new Nescau(new Leite(new CafeSimples("Cafe simples", 2.0)));

        System.out.println(String.format("%s - %.2f", cafe.getDescricao(), cafe.getCusto()));
    }
}
