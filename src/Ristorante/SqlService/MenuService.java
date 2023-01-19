package Ristorante.SqlService;

import java.sql.*;

/**
 * The class Menu service that manages the Menu Table on the database
 */
public class MenuService {

    /**
     * The Db url
     */
    final String DB_URL = "jdbc:mysql://localhost:3306/newdb";
    /**
     * The DB User
     */
    final String USER = "utente";
    /**
     * The DB User Password
     */
    final String PASS = "ristorante";

    /**
     * Create Menu table using as model the Menu class
     *
     * @throws SQLException the sql exception
     */
    public void createMenuTable() throws SQLException {

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        String queryCreateMenu = ""
                + "CREA TABELLA newdb.menu ( "
                + "menu_id INT NOT NULL, "
                + " portata varchar(25) NULL, "
                + " nome varchar(100) NULL, "
                + " `tipo` varchar(25) NULL, "
                + " coperto varchar(100) NULL "
                + ") "
                + "MOTORE=InnoDB "
                + "SET CARATTERI PREDEFINITO=utf8mb4 "
                + "COLLATE=utf8mb4_0900_ai_ci;";

        statement.executeUpdate(queryCreateMenu);
        statement.close();
        System.out.println("Eseguito con successo!");
    }
}
