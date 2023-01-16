package Ristorante.SqlService;

import Ristorante.consumatore.Cliente;
import Ristorante.enums.MenuTypeEnum;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The class Cliente service that manages the Cliente Table on the database
 */
public class ClienteService {

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
     * Create cliente table using as model the Cliente class
     *
     * @throws SQLException the sql exception
     */
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

    /**
     * Insert cliente into the cliente table
     *
     * @param cliente the cliente
     * @throws SQLException the sql exception
     */
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

    /**
     * Update cliente details
     *
     * @param cliente           the cliente
     * @param newCognome        the new cognome
     * @param newPreferenzaMenu the new preferenza menu
     * @throws SQLException the sql exception
     */
    public void updateClienteDetails(Cliente cliente, String newCognome, MenuTypeEnum newPreferenzaMenu) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();

        String updateClienteQuery =  ""
                + "UPDATE newdb.cliente "
                + "SET cognome='" + newCognome + " ', gusti='" + newPreferenzaMenu + "' "
                + "WHERE cliente_id =" + cliente.getClienteId() + " ;";

        statement.executeUpdate(updateClienteQuery);
        statement.close();
        System.out.println("Cliente modificato!");
    }

    /**
     * Delete cliente by the cliente_id
     *
     * @param cliente the cliente
     * @throws SQLException the sql exception
     */
    public void deleteCliente(Cliente cliente) throws SQLException{
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();

        String deleteClienteQuery = "DELETE FROM cliente WHERE cliente_id= " + cliente.getClienteId() + ";";

        statement.executeUpdate(deleteClienteQuery);
        statement.close();
        System.out.println("Cliente cancellato!");
    }

    /**
     * Print all clienti
     *
     * @throws SQLException the sql exception
     */
    public void printAllClienti() throws SQLException {

        List<Cliente> clienti = getAllClienti();

        System.out.println("Lista Clienti: ");
        System.out.println(clienti);
    }

    /**
     * Gets all clienti from the database
     *
     * @return the list of all clienti
     * @throws SQLException the sql exception
     */
    public List<Cliente> getAllClienti() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();

        String selectQuery = """
                SELECT * from newdb.cliente;
                """;

        ResultSet resultSet = statement.executeQuery(selectQuery);
        List<Cliente> clienti = new ArrayList<>();

        while (resultSet.next()) {
            clienti.add(new Cliente(resultSet.getInt("cliente_id"),
                    resultSet.getString("cognome"),
                    MenuTypeEnum.valueOf(resultSet.getString("gusti"))));
        }

        connection.close();
        return clienti;
    }
}