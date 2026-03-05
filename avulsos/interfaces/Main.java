public class Main {
    
    public static void main(String[] args) {
        DbConnection conn = new MySQLDbConnection();
        Repository repo = new Repository(conn);

        System.out.println(repo.findUsers());
    }
}
