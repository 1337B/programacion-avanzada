package Model;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConn {
    private static DBConn instance;
    private Connection conn;
    private final String url = "jdbc:postgresql://localhost:5432/Pavanzada";
    private final String user = "postgres";
    private final String password = "";

    private  DBConn() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
    public static DBConn getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConn();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBConn();
        }
        return instance;
    }
}
