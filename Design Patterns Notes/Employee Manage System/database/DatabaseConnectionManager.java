import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager{

    private Connection connection;
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){
        // empty constructor
    }

    public static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    // contains connection details
    // @throws SQLException
    public void connect() throws SQLException{
        // processing spedific to database connection details...
        connection = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Database Connection...");
    }

    public Connection getConnectionObject(){
        return connection;
    }

}