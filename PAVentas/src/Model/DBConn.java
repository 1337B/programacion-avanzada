package Model;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConn {

    // Clase autoreferenciada, es decir, que se llama a si misma.
    // Patrón Singleton: solo una instancia de la clase DBConn.
    private static DBConn instance;

    private Connection conn;
    // final sirve para que la variable no cambie su valor una vez inicializada.
    private final String url = "jdbc:postgresql://localhost:5432/postgres/Pavanzada";
    private final String user = "postgres";
    private final String password = "";

    // Constructor privado para evitar que se pueda crear una instancia de la clase desde fuera.
    // El metodo DBConn intenta conectarse a la base de datos y si no puede, lanza una excepcion.
    private  DBConn() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully" . concat(url));
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }

    // Metodo que devuelve la conexion a la base de datos.
    public Connection getConnection() {
        return this.conn;
    }

    // patron Singleton, nos devuelve la conexion a la base de datos.
    // El patron Singleton asegura que solo haya una instancia de DBConn en toda la aplicacion.
    public static DBConn getInstance() throws SQLException {
        // Si la instancia es nula o la conexion esta cerrada, se crea una nueva instancia.
        if (instance == null) {
            instance = new DBConn();
        }
        // Si la instancia no es nula y la conexion esta abierta, se devuelve la instancia.
        else if (instance.getConnection().isClosed()) {
            instance = new DBConn();
        }
        return instance;
    }

}
