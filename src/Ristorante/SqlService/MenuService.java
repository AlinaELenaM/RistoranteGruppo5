package Ristorante.SqlService;

import Ristorante.consumatore.Cliente;
import Ristorante.enums.MenuTypeEnum;
import Ristorante.foodAndDrink.Menu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
                + " nome varchar(100) NULL, "
                + " `tipo` varchar(25) NULL "
                + ") "
                + "MOTORE=InnoDB "
                + "SET CARATTERI PREDEFINITO=utf8mb4 "
                + "COLLATE=utf8mb4_0900_ai_ci;";

        statement.executeUpdate(queryCreateMenu);
        statement.close();
        System.out.println("Eseguito con successo!");
    }
    /*
     insert menu in the menu table
     */
    public void insertMenuIntoTable(Menu menu) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();

        String insertQuery =
                """ 
                 INSERT INTO newdb.menu (name, type)
                 VALUES ('""" + menu.getName() + "', '" + menu.getType() + "');";

        statement.executeUpdate(insertQuery);
        statement.close();
        System.out.println("Menu inserito!");
    }
    /*
    update the menu in the menu table
    */
    public void updateMenuDetails(Menu menu, String newName, MenuTypeEnum newType) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();

        String updateMenuQuery =  ""
                + "UPDATE newdb.menu "
                + "SET name='" + newName + " ', type='" + newType + "' "
                + "WHERE menu_id =" + menu.getMenuId() + " ;";

        statement.executeUpdate(updateMenuQuery);
        statement.close();
        System.out.println("Menu modificato!");
    }
    /*
    delete the menu in the menu table
     */
    public void deleteMenu(Menu menu) throws SQLException{
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();

        String deleteMenuQuery = "DELETE FROM menu WHERE menu_id= " + menu.getMenuId() + ";";

        statement.executeUpdate(deleteMenuQuery);
        statement.close();
        System.out.println("Menu cancellato!");
    }

    /*
    the list of all menu in database
     */
    public List<Menu> getAllMenu() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();

        String selectQuery = """
                SELECT * from newdb.menu;
                """;

        ResultSet resultSet = statement.executeQuery(selectQuery);
        List<Menu> menu = new ArrayList<>();

        while (resultSet.next()) {
            menu.add(new Menu(resultSet.getInt("menu_id"),
                    resultSet.getString("name"),
                    MenuTypeEnum.valueOf(resultSet.getString("type"))));
        }

        statement.close();
        return menu;
    }
/*
print all menu in the table
 */
    public void printAllMenu() throws SQLException {

        List<Menu> menu = getAllMenu();

        System.out.println("Menu menu: ");
        System.out.println(menu);
    }
}
