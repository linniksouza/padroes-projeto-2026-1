public class Repository {
    
    public final DbConnection conn;

    public Repository(DbConnection conn) {
        this.conn = conn;
    }

    public String findUsers() {
        return this.conn.execute();
    }
}
