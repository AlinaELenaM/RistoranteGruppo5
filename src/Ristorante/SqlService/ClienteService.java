package Ristorante.SqlService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteService {


    final String DB_URL = "jdbc:mysql://localhost:3306/newdb";
    final String USER = "root";
    final String PASS = "admin";

    public void createClientiTable() throws SQLException {


        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        String queryCreateCliente = ""
                + "CREATE TABLE newdb.cliente_service ( "
                + "	cliente_id INT auto_increment NOT NULL, "
                + "	cognome varchar(100) NULL, "
                + "	gusti varchar(15) NULL, "
                + "	CONSTRAINT ClienteService_pk PRIMARY KEY (cliente_id) "
                + ") "
                + "ENGINE=InnoDB "
                + "DEFAULT CHARSET=utf8mb4 "
                + "COLLATE=utf8mb4_0900_ai_ci;";
        statement.executeUpdate(queryCreateCliente);
        statement.close();
        System.out.println("eseguito con successo");


    }
}