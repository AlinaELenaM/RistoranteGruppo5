package Ristorante;

import Ristorante.SqlService.ClienteService;
import Ristorante.SqlService.PortataService;
import Ristorante.consumatore.Cliente;
import Ristorante.enums.MenuTypeEnum;
import Ristorante.foodAndDrink.Portata;
import Ristorante.foodAndDrink.dishEntities.Antipasti;

import java.sql.SQLException;
import java.util.List;

public class SqlMain {
    public static void main(String[] args) throws SQLException {
/*
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
        PortataService portataService = new PortataService();

        Portata antipasto1 = new Antipasti("Tagliere di salumi" , 8.0,false, MenuTypeEnum.CLASSICO);

        portataService.createPortataTable();
        portataService.insertPortataIntoTable(antipasto1);

    }
}

