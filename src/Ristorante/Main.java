package Ristorante;

import Ristorante.consumatore.Cliente;
import Ristorante.consumatore.Prenotazione;
import Ristorante.foodAndDrink.*;
import Ristorante.foodAndDrink.dishEntities.Antipasti;
import Ristorante.foodAndDrink.dishEntities.Dessert;
import Ristorante.foodAndDrink.dishEntities.PrimiPiatti;
import Ristorante.foodAndDrink.dishEntities.SecondiPiatti;

import Ristorante.foodAndDrink.dishEntities.*;

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

        Menu menuClassico = new Menu(new ArrayList<>(), MenuTypeEnum.CLASSICO);
        Menu menuVegano = new Menu(new ArrayList<>(), MenuTypeEnum.VEGANO);
        Menu menuVegetariano = new Menu(new ArrayList<>(), MenuTypeEnum.VEGETARIANO);

        /**
         * ANTIPASTI
         */
        Portata antipasto1 = new Antipasti("Antipasto", "Tagliere di salumi" , 8,false, MenuTypeEnum.CLASSICO);
        Portata antipasto2 = new Antipasti("Antipasto", "Rustici di carne" , 6,true, MenuTypeEnum.CLASSICO);
        Portata antipasto3 = new Antipasti("Antipasto", "Tartare di manzo", 8,false, MenuTypeEnum.CLASSICO);
        Portata antipasto4 = new Antipasti("Antipasto", "Tartare di zucchine e tartufo", 8,true, MenuTypeEnum.VEGANO);
        Portata antipasto5 = new Antipasti("Antipasto", "Toast con Avocado e melanzane", 8,false, MenuTypeEnum.VEGANO);
        Portata antipasto6 = new Antipasti("Antipasto", "Bruschette con pomodoro", 8,false, MenuTypeEnum.VEGETARIANO);
        Portata antipasto7 = new Antipasti("Antipasto", "Grigliata di verdura mista", 8,true, MenuTypeEnum.VEGETARIANO);

        menuClassico.addPortata(antipasto1);
        menuClassico.addPortata(antipasto2);
        menuClassico.addPortata(antipasto3);
        menuClassico.addPortata(antipasto4);
        menuClassico.addPortata(antipasto5);
        menuClassico.addPortata(antipasto6);
        menuClassico.addPortata(antipasto7);


        /**
         * PRIMI PIATTI
         */
        Portata primoPiatto1 = new PrimiPiatti("Primo piatto", "Spaghetti alla carbonara", 11,true, MenuTypeEnum.CLASSICO);
        Portata primoPiatto2 = new PrimiPiatti("Primo piatto", "Rigatoni alla bolognese", 9,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto3 = new PrimiPiatti("Primo piatto", "Tortiglioni salsiccia e cipolla", 8,false, MenuTypeEnum.CLASSICO);
        Portata primoPiatto4 = new PrimiPiatti("Primo piatto", "Linguine pompelmo e pistacchio", 12,false, MenuTypeEnum.VEGANO);
        Portata primoPiatto5 = new PrimiPiatti("Primo piatto", "Parmigiana vegana", 8,true, MenuTypeEnum.VEGANO);
        Portata primoPiatto6 = new PrimiPiatti("Primo piatto", "Lasagna zucchine, speck e besciamella", 10,false, MenuTypeEnum.VEGETARIANO);
        Portata primoPiatto7 = new PrimiPiatti("Primo piatto", "Orecchiette con broccoli", 7,true, MenuTypeEnum.VEGETARIANO);

        menuClassico.addPortata(primoPiatto1);
        menuClassico.addPortata(primoPiatto2);
        menuClassico.addPortata(primoPiatto3);
        menuClassico.addPortata(primoPiatto4);
        menuClassico.addPortata(primoPiatto5);
        menuClassico.addPortata(primoPiatto6);
        menuClassico.addPortata(primoPiatto7);


        Portata secondoPiatto1 = new SecondiPiatti("Secondo piatto" , "Fiorentina" , 15,false, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto2 = new SecondiPiatti("Secondo piatto" , "Involtini di carne" , 8,false, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto3 = new SecondiPiatti("Secondo piatto" , "Cotoletta di pollo" , 7,true, MenuTypeEnum.CLASSICO);
        Portata secondoPiatto4 = new SecondiPiatti("Secondo piatto" , "Frittata di fagiolini" , 7,true, MenuTypeEnum.VEGANO);
        Portata secondoPiatto5 = new SecondiPiatti("Secondo piatto" , "Cotoletta di ceci" , 7,false, MenuTypeEnum.VEGANO);
        Portata secondoPiatto6 = new SecondiPiatti("Secondo piatto" , "Uova al tegamini con pomodoro" , 7,true, MenuTypeEnum.VEGETARIANO);
        Portata secondoPiatto7 = new SecondiPiatti("Secondo piatto" , "Zuppa di ceci e cavolo nero" , 7,false, MenuTypeEnum.VEGETARIANO);

        menuClassico.addPortata(secondoPiatto1);
        menuClassico.addPortata(secondoPiatto2);
        menuClassico.addPortata(secondoPiatto3);
        menuClassico.addPortata(secondoPiatto4);
        menuClassico.addPortata(secondoPiatto5);
        menuClassico.addPortata(secondoPiatto6);
        menuClassico.addPortata(secondoPiatto7);




        Portata dessert1 = new Dessert("Dessert", "tortini ripieni", 3,false, MenuTypeEnum.CLASSICO);
        Portata dessert2 = new Dessert("Dessert", "torta di ciliege", 9,true, MenuTypeEnum.CLASSICO);
        Portata dessert3 = new Dessert("Dessert", "crostata di mele", 6,false, MenuTypeEnum.CLASSICO);

        Portata dessert4 = new Dessert("Dessert", "Plumcake marmorizzato vegan al cioccolato e vaniglia", 4, true, MenuTypeEnum.VEGANO);
        Portata dessert5 = new Dessert("Dessert", "Torta di mele vegan", 5, false, MenuTypeEnum.VEGANO);

        Portata dessert6 = new Dessert("Dessert", "Plumcake fragole e mascarpone", 4, false, MenuTypeEnum.VEGETARIANO);
        Portata dessert7 = new Dessert("Dessert", "Muffin al cioccolato", 3, true, MenuTypeEnum.VEGETARIANO);

        menuClassico.addPortata(dessert1);
        menuClassico.addPortata(dessert2);
        menuClassico.addPortata(dessert3);
        menuClassico.addPortata(dessert4);
        menuClassico.addPortata(dessert5);
        menuClassico.addPortata(dessert6);
        menuClassico.addPortata(dessert7);


        Portata drink = new Portata("Bevanda", "Acqua liscia o gassata", 1,false);
        Portata drink1 = new Portata("Bevanda", "Coca-cola", 2, false);
        Portata drink2 = new Portata("Bevanda", "Aranciata", 2, false);
        Portata drink3 = new Portata("Bevanda", "The alla pesca o al limone", 2,false);
        Portata drink4 = new Portata("Bevanda_Vegana", "Bergamotto bio", 3, false);
        Portata drink5 = new Portata("Bevanda_Vegana", "Ginger_Bio", 3, false);
        Portata drink6 = new Portata("Bevanda_Vegetariana", "Mix di frutta esotica", 5, false);
        Portata drink7 = new Portata("Bevanda_Vegetariana", "Latte di cocco e mandorla", 7, false);

        menuClassico.addPortata(drink);
        menuClassico.addPortata(drink1);
        menuClassico.addPortata(drink2);
        menuClassico.addPortata(drink3);
        menuClassico.addPortata(drink4);
        menuClassico.addPortata(drink5);
        menuClassico.addPortata(drink6);
        menuClassico.addPortata(drink7);



        System.out.println("============================================================================================================================");
        menuClassico.stampaMenu();
        System.out.println("============================================================================================================================");
        menuClassico.stampaPiattoDelGiorno();
        System.out.println("============================================================================================================================");


        System.out.println("============SEZIONE CLIENTE============");
        Cliente cliente = new Cliente("Rossi",  MenuTypeEnum.CLASSICO,"25 Dicembre 20:00");
        Cliente cliente1 = new Cliente("De paolo", MenuTypeEnum.VEGANO,"25 Dicembre 21:00");
        Cliente cliente2 = new Cliente("De luca", MenuTypeEnum.VEGETARIANO,"25 Dicembre 22:00");


        cliente.infoCliente();
        cliente1.infoCliente();
        cliente2.infoCliente();


        menuClassico.stampaPiattoInBaseAlCliente(cliente);
        System.out.println("=============================================================================");


        List<Cliente> clienteList = new ArrayList<>();

        clienteList.add(cliente);
        clienteList.add(cliente1);
        clienteList.add(cliente2);



        Prenotazione prenotazione = new Prenotazione(clienteList);
        prenotazione.aggiungerePrenotazioni(clienteList);

        prenotazione.stampaPrenotazioni();

        Tavolo tavolo1 = new Tavolo(4);
        Tavolo tavolo2 = new Tavolo(4);
        Tavolo tavolo3 = new Tavolo(4);
        Tavolo tavolo4 = new Tavolo(4);
        Tavolo tavolo5 = new Tavolo(4);

        List<Tavolo> listaTavoli= new ArrayList<>();
        listaTavoli.add(tavolo1);
        listaTavoli.add(tavolo2);
        listaTavoli.add(tavolo3);
        listaTavoli.add(tavolo4);
        listaTavoli.add(tavolo5);



        tavolo1.assegnaPosti(prenotazione);
        System.out.println(tavolo1.getClientiOccupanti().toString());

    }
}
