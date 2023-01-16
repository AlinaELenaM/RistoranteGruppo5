package Ristorante;

import Ristorante.SqlService.ClienteService;
import Ristorante.consumatore.Cliente;
import Ristorante.enums.MenuTypeEnum;

import java.sql.SQLException;

public class SqlMain {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente("Rossi",  MenuTypeEnum.CLASSICO);
        Cliente cliente1 = new Cliente("De paolo", MenuTypeEnum.VEGANO);
        Cliente cliente2 = new Cliente("De luca", MenuTypeEnum.VEGETARIANO);

        ClienteService clienteService = new ClienteService();
/*
        clienteService.createClienteTable();
        clienteService.insertClienteIntoTable(cliente);
        clienteService.insertClienteIntoTable(cliente1);
        clienteService.insertClienteIntoTable(cliente2);
*/

    }
}

