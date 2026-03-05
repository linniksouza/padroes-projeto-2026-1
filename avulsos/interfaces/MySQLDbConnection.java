public class MySQLDbConnection implements DbConnection {

    @Override
    public String execute() {
        return "SELECT * FROM users";
    }
}
