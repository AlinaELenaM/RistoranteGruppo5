package Ristorante.SqlService;

import Ristorante.consumatore.Tavolo;
import Ristorante.enums.EnumTavoli;
import Ristorante.enums.MenuTypeEnum;
import Ristorante.enums.TipoPortataEnum;
import Ristorante.foodAndDrink.Portata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TavoloService {

    private final Connection connection = DbConnection.getConnection();

    public void createTavoloTable() throws SQLException {
        Statement statement = connection.createStatement();

        String queryCreateTavoloTable = ""
                + "CREATE TABLE IF NOT EXISTS newdb.tavolo ( "
                + "	tavolo_id INT auto_increment NOT NULL, "
                + "	tipo_tavolo varchar(30) NULL, "
                + "	numero_tavolo INT NULL, "
                //   + "	lista_prenotazioni varchar(255) NULL, "
                + "	CONSTRAINT tavolo_pk PRIMARY KEY (tavolo_id) "
                + ");";


        statement.executeUpdate(queryCreateTavoloTable);
        statement.close();
        System.out.println("Tabella Tavolo creata!");
    }


    public void insertTavoloIntoTable(Tavolo tavolo) throws SQLException {
        Statement statement = connection.createStatement();

        String insertQuery =
                """ 
                 INSERT INTO newdb.tavolo (tipo_tavolo, numero_tavolo)
                 VALUES ('""" + tavolo.getTipoTavolo() + "', '" + tavolo.getNumeroTavolo() + "');";

        statement.executeUpdate(insertQuery);
        statement.close();
        System.out.println("Tavolo inserito!");
    }


    public void updateTavolo(Tavolo tavolo) throws SQLException {

        Statement statement = connection.createStatement();

        String updateTavoloDetailsQuery = ""
                + "UPDATE tavolo "
                + "SET tipo_tavolo='" + tavolo.getTipoTavolo() + "', "
                + "numero_tavolo='" + tavolo.getNumeroTavolo() + "' "
                // + "lista_prenotazioni=" + tavolo.getListaPrenotazioni() + ", "
                + "WHERE tavolo_id=" + tavolo.getTavoloId() + ";";

        statement.executeUpdate(updateTavoloDetailsQuery);
        statement.close();
        System.out.println("Tavolo modificato!");
    }

    public List<Tavolo> getAllTavolo() throws SQLException {
        Statement statement = connection.createStatement();

        String selectQuery = """
                SELECT * from newdb.tavolo;
                """;

        ResultSet resultSet = statement.executeQuery(selectQuery);
        List<Tavolo> tavolo = new ArrayList<>();

        while (resultSet.next()) {
            tavolo.add(new Tavolo(resultSet.getInt("tavolo_id"),
                    EnumTavoli.valueOf(resultSet.getString("tipo_tavolo")),
                    resultSet.getInt("numero_tavolo")
            ));
        }
        statement.close();
        return tavolo;
    }
    public void printAllTavolo() throws SQLException {
        List<Tavolo> tavolo = getAllTavolo();

        System.out.println("Lista Tavolo: ");
        for (Tavolo tavoli : tavolo){
            System.out.println(tavolo);
        }
    }

    public void deleteTavolo(Tavolo tavolo) throws SQLException{
        Statement statement = connection.createStatement();

        String deleteTavoloQuery = "DELETE FROM tavolo WHERE tavolo_id= " + tavolo.getTavoloId() + ";";

        statement.executeUpdate(deleteTavoloQuery);
        statement.close();
        System.out.println("Tavolo cancellato!");
    }



}
