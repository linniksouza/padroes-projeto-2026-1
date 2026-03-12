public class DbConexao {

    private static DbConexao instance;

    private DbConexao() {}

    public void execute(String sql) {
        System.out.println(sql);
    }

    public static DbConexao singleton() {
        if(instance == null){
            System.out.println("Instancia esta nula, criando...");
            instance = new DbConexao();
        }

        return instance;
    }
}
