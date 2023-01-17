package Ristorante.SqlService;

import Ristorante.foodAndDrink.Portata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PortataService {

private final Connection connection = DbConnection.getConnection();
    public void createPortataTable() throws SQLException {
        Statement statement = connection.createStatement();

        String queryCreatePortataTable = ""
                + "CREATE TABLE newdb.portata ( "
                + "	portata_id INT auto_increment NOT NULL, "
                + "	tipo_portata varchar(20) NULL, "
                + "	nome varchar(30) NULL, "
                + "	prezzo DOUBLE NULL, "
                + "	is_piatto_del_giorno BOOL DEFAULT FALSE NOT NULL, "
                + "	tipo_menu varchar(20) NULL "
                + ");";

        statement.executeUpdate(queryCreatePortataTable);
        statement.close();
        System.out.println("Tabella Portata creata!");
    }

    public void insertPortataIntoTable(Portata portata) throws SQLException {
        Statement statement = connection.createStatement();

        String insertQuery =
                """ 
                 INSERT INTO newdb.portata (nome, prezzo, is_piatto_del_giorno, tipo_menu)
                 VALUES ('""" + portata.getName() + "', " + portata.getPrice() + ", '" +
                        portata.isPiattoDelGiorno() + "', '" + portata.getTipoMenu() + "');";

        statement.executeUpdate(insertQuery);
        statement.close();
        System.out.println( portata.getTipoPortataEnum() + " inserita!");
    }
}
