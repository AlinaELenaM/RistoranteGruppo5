package Ristorante.SqlService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    /**
     * The Db url
     */
    private static final String URL = "jdbc:mysql://localhost:3306/newdb";
    /**
     * The DB User
     */
    private static final String USER = "utente";
    /**
     * The DB User Password
     */
    private static final String PASS = "ristorante";

    private static final Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private DbConnection(){
    }
    public static Connection getConnection(){
        return connection;
    }
}
