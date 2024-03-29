package Ristorante;

import Ristorante.SqlService.ClienteService;
import Ristorante.SqlService.MenuService;
import Ristorante.SqlService.PortataService;
import Ristorante.SqlService.TavoloService;
import Ristorante.consumatore.Cliente;
import Ristorante.consumatore.Tavolo;
import Ristorante.enums.EnumTavoli;
import Ristorante.enums.MenuTypeEnum;
import Ristorante.foodAndDrink.Menu;
import Ristorante.foodAndDrink.Portata;
import Ristorante.foodAndDrink.dishEntities.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlMain {
    public static void main(String[] args) throws SQLException {
/*
    //--------CLIENTE SERVICE
        ClienteService clienteService = new ClienteService();

        Cliente cliente1 = new Cliente(1,"Rossi",  MenuTypeEnum.CLASSICO);
        Cliente cliente2 = new Cliente(2,"De paolo", MenuTypeEnum.VEGANO);
        Cliente cliente3 = new Cliente(3,"De luca", MenuTypeEnum.VEGETARIANO);

        clienteService.createClienteTable();

        clienteService.insertClienteIntoTable(cliente1);
        clienteService.insertClienteIntoTable(cliente2);
        clienteService.insertClienteIntoTable(cliente3);


        List<Cliente> listaClienti = clienteService.getAllClienti();

        Cliente clienteDb1 = listaClienti.get(0);
        Cliente clienteDb2 = listaClienti.get(1);
        Cliente clienteDb3 = listaClienti.get(2);

        clienteService.updateClienteDetails(clienteDb2,"De Paolo", MenuTypeEnum.VEGETARIANO);
        clienteService.updateClienteDetails(clienteDb3, "De Luca", MenuTypeEnum.VEGANO);

        clienteService.deleteCliente(clienteDb3);

        clienteService.printAllClienti();
 */

    //--------PORTATA SERVICE
        PortataService portataService = new PortataService();

        //portataService.createPortataTable();

        Portata antipasto1 = new Antipasti(1,"Tagliere di salumi" , 8.0,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto1 = new PrimiPiatti(2,"Spaghetti alla carbonara", 11.5,true, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto1 = new SecondiPiatti(3,"Fiorentina" , 15.5,false, MenuTypeEnum.CLASSICO);
        Portata dessert1 = new Dessert(4,"tortini ripieni", 3.5,false, MenuTypeEnum.CLASSICO);
        Portata drink1 = new Drink(5,"Coca-cola", 2.0, false, MenuTypeEnum.CLASSICO);
        Portata drink2 = new Drink(6,"Acqua", 2.0, false, MenuTypeEnum.CLASSICO);

//        portataService.insertPortataIntoTable(antipasto1);
//        portataService.insertPortataIntoTable(primoPiatto1);
//        portataService.insertPortataIntoTable(secondoPiatto1);
//        portataService.insertPortataIntoTable(dessert1);
//        portataService.insertPortataIntoTable(drink1);
        //portataService.insertPortataIntoTable(drink2);

        List<Portata> listaPortate = portataService.getAllPortata();

        //listaPortate.get(0).setPrice(10.5);
        //listaPortate.get(0).setName("Tagliere Salumi");
        //portataService.updatePortata(listaPortate.get(0));

        //listaPortate.get(3).setPiattoDelGiorno(true);
        //portataService.updatePortata(listaPortate.get(3));

        //listaPortate.get(4).setTipoMenu(MenuTypeEnum.VEGETARIANO);
       // portataService.updatePortata(listaPortate.get(4));
        //portataService.deletePortata(listaPortate.get(4));
        //portataService.printAllPortata();
        //portataService.alterTableForeignKey();

        portataService.addPortataIntoMenu(listaPortate.get(4),MenuTypeEnum.VEGETARIANO.toString());
        portataService.addPortataIntoMenu(listaPortate.get(3),MenuTypeEnum.CLASSICO.toString());
        portataService.addPortataIntoMenu(listaPortate.get(2),MenuTypeEnum.CLASSICO.toString());
        portataService.addPortataIntoMenu(listaPortate.get(1),MenuTypeEnum.CLASSICO.toString());
        portataService.addPortataIntoMenu(listaPortate.get(0),MenuTypeEnum.CLASSICO.toString());
        //--------MENU SERVICE

        MenuService menuService = new MenuService();

           Menu menu1 = new Menu(2,"Classico",MenuTypeEnum.CLASSICO);
           Menu menu2 = new Menu(3,"Vegetariano",MenuTypeEnum.VEGETARIANO);
           Menu menu3 = new Menu(4,"Vegano",MenuTypeEnum.VEGANO);


           //menuService.createMenuTable();

        //   menuService.insertMenuIntoTable(menu1);
        //   menuService.insertMenuIntoTable(menu2);
        //  menuService.insertMenuIntoTable(menu3);

        //   List<Menu> listaMenu = menuService.getAllMenu();

        //   Menu menuDb1 = listaMenu.get(0);
        //    Menu menuDb2 = listaMenu.get(1);
        //   Menu menuDb3 = listaMenu.get(2);

        //   menuService.updateMenuDetails(menuDb1,"Antonio", MenuTypeEnum.CLASSICO);
        //   menuService.updateMenuDetails(menuDb2, "Luca", MenuTypeEnum.VEGETARIANO);

        //   menuService.deleteMenu(menuDb3);

        //   menuService.printAllMenu();


        //--------TAVOLO SERVICE
        //TavoloService tavoloService= new TavoloService();

        //tavoloService.createTavoloTable();

       // Tavolo tavolo1 = new Tavolo(1 ,EnumTavoli.PICCOLO , 1);
        //Tavolo tavolo2 = new Tavolo(2,EnumTavoli.MEDIO , 2);
        //Tavolo tavolo3 = new Tavolo(3,EnumTavoli.PICCOLO , 3);

       // tavoloService.insertTavoloIntoTable(tavolo1);
        //tavoloService.insertTavoloIntoTable(tavolo2);
        //tavoloService.insertTavoloIntoTable(tavolo3);



        //List<Tavolo> listaTavolo = tavoloService.getAllTavolo();

        //listaTavolo.get(1).setTipoTavolo(EnumTavoli.GRANDE);
       // tavoloService.updateTavolo(listaTavolo.get(1));



    }
}

