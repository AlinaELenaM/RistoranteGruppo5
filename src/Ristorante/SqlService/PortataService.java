package Ristorante.SqlService;

import Ristorante.consumatore.Cliente;
import Ristorante.enums.MenuTypeEnum;
import Ristorante.enums.TipoPortataEnum;
import Ristorante.foodAndDrink.Portata;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PortataService {

private final Connection connection = DbConnection.getConnection();

    public void createPortataTable() throws SQLException {
        Statement statement = connection.createStatement();

        String queryCreatePortataTable = ""
                + "CREATE TABLE IF NOT EXISTS newdb.portata ( "
                + "	portata_id INT auto_increment NOT NULL, "
                + "	tipo_portata varchar(20) NULL, "
                + "	nome varchar(30) NULL, "
                + "	prezzo DOUBLE NULL, "
                + "	is_piatto_del_giorno BOOL DEFAULT FALSE NOT NULL, "
                + "	tipo_menu varchar(20) NULL, "
                + "	CONSTRAINT portata_pk PRIMARY KEY (portata_id) "
                + ");";


        statement.executeUpdate(queryCreatePortataTable);
        statement.close();
        System.out.println("Tabella Portata creata!");
    }

    public void insertPortataIntoTable(Portata portata) throws SQLException {
        Statement statement = connection.createStatement();

        String insertQuery =
                """ 
                 INSERT INTO newdb.portata (tipo_portata, nome, prezzo, is_piatto_del_giorno, tipo_menu)
                 VALUES ('""" + portata.getTipoPortataEnum() + "', '" + portata.getName() + "', " + portata.getPrice() + ", " +
                        portata.isPiattoDelGiorno() + ", '" + portata.getTipoMenu() + "');";

        statement.executeUpdate(insertQuery);
        statement.close();
        System.out.println("Portata - " + portata.getTipoPortataEnum().getDescrizione() + " inserita!");
    }

    public void updatePortata(Portata portata) throws SQLException {

        Statement statement = connection.createStatement();

        String updatePortataDetailsQuery = ""
                + "UPDATE portata "
                + "SET tipo_portata='" + portata.getTipoPortataEnum() + "', "
                + "nome='" + portata.getName() + "', "
                + "prezzo=" + portata.getPrice() + ", "
                + "is_piatto_del_giorno=" + portata.isPiattoDelGiorno() + ", "
                + "tipo_menu='" + portata.getTipoMenu() + "' "
                + "WHERE portata_id=" + portata.getPortataId() + ";";

        statement.executeUpdate(updatePortataDetailsQuery);
        statement.close();
        System.out.println("Portata - " + portata.getTipoPortataEnum().getDescrizione() + " modificata!");
    }
    public List<Portata> getAllPortata() throws SQLException {
        Statement statement = connection.createStatement();

        String selectQuery = """
                SELECT * from newdb.portata;
                """;

        ResultSet resultSet = statement.executeQuery(selectQuery);
        List<Portata> portate = new ArrayList<>();

        while (resultSet.next()) {
            portate.add(new Portata(resultSet.getInt("portata_id"),
                                    TipoPortataEnum.valueOf(resultSet.getString("tipo_portata")),
                                    resultSet.getString("nome"),
                                    resultSet.getDouble("prezzo"),
                                    resultSet.getBoolean("is_piatto_del_giorno"),
                                    MenuTypeEnum.valueOf(resultSet.getString("tipo_menu"))));
        }
        statement.close();
        return portate;
    }
    public void printAllPortata() throws SQLException {
        List<Portata> portate = getAllPortata();

        System.out.println("Lista Portate: ");
       for (Portata portata : portate){
           System.out.println(portata.stampaInfoPortata());
       }
    }

    public void deletePortata(Portata portata) throws SQLException{
        Statement statement = connection.createStatement();

        String deletePortataQuery = "DELETE FROM portata WHERE portata_id= " + portata.getPortataId() + ";";

        statement.executeUpdate(deletePortataQuery);
        statement.close();
        System.out.println("Portata cancellata!");
    }
    public void alterTableForeignKey() throws SQLException {
        Statement statement = connection.createStatement();

        String alterTableAddMenuIdColumnQuery = ""
                + "ALTER TABLE newdb.portata ADD menu_id INT NOT NULL;";


        String alterTableAddForeignKey = ""
                + "ALTER TABLE newdb.portata ADD CONSTRAINT portata_FK FOREIGN KEY " +
                "(menu_id) REFERENCES newdb.menu(menu_id);";

        statement.executeUpdate(alterTableAddMenuIdColumnQuery);
        statement.executeUpdate(alterTableAddForeignKey);

        System.out.println("menu_id aggiunto e creata la foreign key!");
        statement.close();
    }
    public void addPortataIntoMenu (Portata portata, String menuName) throws SQLException {
        Statement statement = connection.createStatement();

        int menu_id =0;
        String selectMenuId = "SELECT menu_id FROM newdb.menu WHERE name='" +menuName +"';";
        ResultSet result = statement.executeQuery(selectMenuId);
        while(result.next()) {
            menu_id = result.getInt("menu_id");
        }

        String addMenuIntoPortata = "UPDATE portata SET menu_id = " +  menu_id
                + " WHERE portata_id=" +portata.getPortataId() +";";
        statement.executeUpdate(addMenuIntoPortata);
        System.out.println("Portata aggiunta nel menu specifico!");
        statement.close();
    }
}
