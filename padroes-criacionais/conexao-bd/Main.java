public class Main {

    public static void main(String[] args) {
        DbConexao conn = DbConexao.singleton();
        conn.execute("SELECT 1");

        conn = DbConexao.singleton();
        conn.execute("SELECT 2");

        conn = DbConexao.singleton();
        conn.execute("SELECT 2");
    }
}
