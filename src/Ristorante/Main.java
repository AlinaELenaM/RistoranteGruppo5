package Ristorante;

import Ristorante.SqlService.ClienteService;
import Ristorante.consumatore.Cliente;
import Ristorante.consumatore.Prenotazione;
import Ristorante.consumatore.Sala;
import Ristorante.consumatore.Tavolo;
import Ristorante.enums.EnumTavoli;
import Ristorante.enums.MenuTypeEnum;
import Ristorante.foodAndDrink.*;
import Ristorante.foodAndDrink.dishEntities.*;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.*;

/**
 * In questa classe sono stati creati delle istanze di oggetti nelle varie classi e aggiunti alla lista
 *  con il metodo stampaMenu viene stampato il menu
 *  con il metodo piatto del giorno viene stampato un piatto randomico
 *  con il metodo piattoConsigliato vengono stampate le portate riguardante i gusti del cliente
 * La classe che fa riferimento al main
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 1
 */

public class Main {
    public static void main(String[] args) {

      //  Menu menu = new Menu(new ArrayList<>());

/*

         //ANTIPASTI

        Portata antipasto1 = new Antipasti("Tagliere di salumi" , 8.0,false, MenuTypeEnum.CLASSICO);
        Portata antipasto2 = new Antipasti("Rustici di carne" , 6.0,true, MenuTypeEnum.CLASSICO);
        Portata antipasto3 = new Antipasti("Tartare di manzo", 8.0,false, MenuTypeEnum.CLASSICO);
        Portata antipasto4 = new Antipasti("Tartare di zucchine e tartufo", 8.0,true, MenuTypeEnum.VEGANO);
        Portata antipasto5 = new Antipasti("Toast con Avocado e melanzane", 8.5,false, MenuTypeEnum.VEGANO);
        Portata antipasto6 = new Antipasti("Bruschette con pomodoro", 8.5,false, MenuTypeEnum.VEGETARIANO);
        Portata antipasto7 = new Antipasti("Grigliata di verdura mista", 8.5,true, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(antipasto1);
        menu.addPortata(antipasto2);
        menu.addPortata(antipasto3);
        menu.addPortata(antipasto4);
        menu.addPortata(antipasto5);
        menu.addPortata(antipasto6);
        menu.addPortata(antipasto7);


         //PRIMI PIATTI

        Portata primoPiatto1 = new PrimiPiatti("Spaghetti alla carbonara", 11.5,true, MenuTypeEnum.CLASSICO);
        Portata primoPiatto2 = new PrimiPiatti("Rigatoni alla bolognese", 9.0,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto3 = new PrimiPiatti("Tortiglioni salsiccia e cipolla", 8.0,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto4 = new PrimiPiatti("Linguine pompelmo e pistacchio", 12.0,false, MenuTypeEnum.VEGANO);
        Portata primoPiatto5 = new PrimiPiatti("Parmigiana vegana", 8.0,true, MenuTypeEnum.VEGANO);
        Portata primoPiatto6 = new PrimiPiatti("Lasagna zucchine, speck e besciamella", 10.0,false, MenuTypeEnum.VEGETARIANO);
        Portata primoPiatto7 = new PrimiPiatti("Orecchiette con broccoli", 7.0,true, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(primoPiatto1);
        menu.addPortata(primoPiatto2);
        menu.addPortata(primoPiatto3);
        menu.addPortata(primoPiatto4);
        menu.addPortata(primoPiatto5);
        menu.addPortata(primoPiatto6);
        menu.addPortata(primoPiatto7);


         //Secondi Piatti

        Portata secondoPiatto1 = new SecondiPiatti("Fiorentina" , 15.5,false, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto2 = new SecondiPiatti("Involtini di carne" , 8.0,false, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto3 = new SecondiPiatti("Cotoletta di pollo" , 7.0,true, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto4 = new SecondiPiatti("Frittata di fagiolini" , 7.0,true, MenuTypeEnum.VEGANO);
        Portata secondoPiatto5 = new SecondiPiatti("Cotoletta di ceci" , 7.0,false, MenuTypeEnum.VEGANO);
        Portata secondoPiatto6 = new SecondiPiatti("Uova al tegamini con pomodoro" , 7.0,true, MenuTypeEnum.VEGETARIANO);
        Portata secondoPiatto7 = new SecondiPiatti("Zuppa di ceci e cavolo nero" , 7.0,false, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(secondoPiatto1);
        menu.addPortata(secondoPiatto2);
        menu.addPortata(secondoPiatto3);
        menu.addPortata(secondoPiatto4);
        menu.addPortata(secondoPiatto5);
        menu.addPortata(secondoPiatto6);
        menu.addPortata(secondoPiatto7);


          //Dessert

        Portata dessert1 = new Dessert("tortini ripieni", 3.5,false, MenuTypeEnum.CLASSICO);
        Portata dessert2 = new Dessert("torta di ciliege", 9.0,true, MenuTypeEnum.CLASSICO);
        Portata dessert3 = new Dessert("crostata di mele", 6.0,false, MenuTypeEnum.CLASSICO);
        Portata dessert4 = new Dessert("Plumcake marmorizzato vegan al cioccolato e vaniglia", 4.0, true, MenuTypeEnum.VEGANO);
        Portata dessert5 = new Dessert("Torta di mele vegan", 5.0, false, MenuTypeEnum.VEGANO);
        Portata dessert6 = new Dessert("Plumcake fragole e mascarpone", 4.0, false, MenuTypeEnum.VEGETARIANO);
        Portata dessert7 = new Dessert("Muffin al cioccolato", 3.0, true, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(dessert1);
        menu.addPortata(dessert2);
        menu.addPortata(dessert3);
        menu.addPortata(dessert4);
        menu.addPortata(dessert5);
        menu.addPortata(dessert6);
        menu.addPortata(dessert7);


        Portata drink = new Drink("Acqua liscia o gassata", 1.0,false, MenuTypeEnum.CLASSICO);
        Portata drink1 = new Drink("Coca-cola", 2.0, false, MenuTypeEnum.CLASSICO);
        Portata drink2 = new Drink("Aranciata", 2.0, false, MenuTypeEnum.CLASSICO);
        Portata drink3 = new Drink("The alla pesca o al limone", 2.0,false,MenuTypeEnum.CLASSICO);
        Portata drink4 = new Drink("Bergamotto bio", 3.0, false, MenuTypeEnum.VEGANO);
        Portata drink5 = new Drink("Ginger_Bio", 3.0, false, MenuTypeEnum.VEGANO);
        Portata drink6 = new Drink("Mix di frutta esotica", 5.0, false, MenuTypeEnum.VEGETARIANO);
        Portata drink7 = new Drink("Latte di cocco e mandorla", 7.0, false, MenuTypeEnum.VEGETARIANO);

        menu.addPortata(drink);
        menu.addPortata(drink1);
        menu.addPortata(drink2);
        menu.addPortata(drink3);
        menu.addPortata(drink4);
        menu.addPortata(drink5);
        menu.addPortata(drink6);
        menu.addPortata(drink7);

        System.out.println("============================================================================================================================");
        menu.stampaMenu();
        System.out.println("============================================================================================================================");
        menu.stampaPiattoDelGiorno();
        System.out.println("============================================================================================================================");

        System.out.println("============SEZIONE CLIENTE============");
        Cliente cliente = new Cliente(1,"Rossi",  MenuTypeEnum.CLASSICO);
        Cliente cliente1 = new Cliente(2,"De paolo", MenuTypeEnum.VEGANO);
        Cliente cliente2 = new Cliente(3,"De luca", MenuTypeEnum.VEGETARIANO);

        cliente.infoCliente();
        cliente1.infoCliente();
        cliente2.infoCliente();

        menu.stampaPiattoInBaseAlCliente(cliente);
        System.out.println("============================================================================================================================");
        menu.stampaPiattoInBaseAlCliente(cliente1);
        System.out.println("============================================================================================================================");
        menu.stampaPiattoInBaseAlCliente(cliente2);
        System.out.println("============================================================================================================================");

        List<Cliente> clienteList = new ArrayList<>();

        clienteList.add(cliente);
        clienteList.add(cliente1);
        clienteList.add(cliente2);


//Gestione Tavoli e Prenotazioni
        Tavolo tavolo1 = new Tavolo(EnumTavoli.MEDIO,1);
        Tavolo tavolo2 = new Tavolo(EnumTavoli.MEDIO,2);
        Tavolo tavolo3 = new Tavolo(EnumTavoli.GRANDE,3);
        Tavolo tavolo4 = new Tavolo(EnumTavoli.PICCOLO,4);
        Tavolo tavolo5 = new Tavolo(EnumTavoli.PICCOLO,5);

        List<Tavolo> listaTavoli= new ArrayList<>();
        listaTavoli.add(tavolo1);
        listaTavoli.add(tavolo2);
        listaTavoli.add(tavolo3);
        listaTavoli.add(tavolo4);
        listaTavoli.add(tavolo5);

        Sala sala = new Sala("Ristorante Team 5", listaTavoli);

        sala.prenotaTavolo(cliente, EnumTavoli.PICCOLO,
                LocalDateTime.of(2022,12,20, 20,00));
        sala.prenotaTavolo(cliente1, EnumTavoli.GRANDE,
                LocalDateTime.of(2022,12,20, 20,00));
        sala.prenotaTavolo(cliente2, EnumTavoli.PICCOLO,
                LocalDateTime.of(2022,12,20, 20,00));

        sala.stampaSala();
*/

    }
}
