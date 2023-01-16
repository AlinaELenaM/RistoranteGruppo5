package Ristorante.SqlService;

import Ristorante.consumatore.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteService {

    final String DB_URL = "jdbc:mysql://localhost:3306/newdb";
    final String USER = "utente";
    final String PASS = "ristorante";

    public void createClienteTable() throws SQLException {


        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        String queryCreateCliente = ""
                + "CREATE TABLE IF NOT EXISTS newdb.cliente ( "
                + "	cliente_id INT auto_increment NOT NULL, "
                + "	cognome varchar(100) NULL, "
                + "	gusti varchar(15) NULL, "
                + "	CONSTRAINT cliente_pk PRIMARY KEY (cliente_id) "
                + ") "
                + "ENGINE=InnoDB "
                + "DEFAULT CHARSET=utf8mb4 "
                + "COLLATE=utf8mb4_0900_ai_ci;";

        statement.executeUpdate(queryCreateCliente);
        statement.close();
        System.out.println("Eseguito con successo!");
    }

    public void insertClienteIntoTable(Cliente cliente) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();

        String insertQuery =
                """ 
                 INSERT INTO newdb.cliente (cognome, gusti)
                 VALUES ('""" + cliente.getCognome() + "', '" + cliente.getGusti() + "');";

        statement.executeUpdate(insertQuery);
        statement.close();
        System.out.println("Cliente inserito!");
    }


}