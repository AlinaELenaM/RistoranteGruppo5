package Ristorante.foodAndDrink.dishEntities;

import Ristorante.enums.TipoPortataEnum;
import Ristorante.foodAndDrink.Portata;
import Ristorante.enums.MenuTypeEnum;


/**
 * La classe che fa riferimento ai Ristorante.FoodAndDrink.PortEnti.PrimiPiatti che estende la classe Ristorante.FoodAndDrink.Portata
 * @author Nicola boniello
 * @version 1
 */
public class PrimiPiatti extends Portata {

    /**
     * metodo costruttore della classe PrimiPiatti
     * @param name --> nome del primo piatto
     * @param price --> prezzo del primo piatto
     * @param piattoDelGiorno --> piatto del giorno
     * @param tipoMenu --> tipo(categoria) del menu a cui appartiene(CLASSICO, VEGETARIANO, VEGANO)
     */

    public PrimiPiatti(String name, Double price, boolean piattoDelGiorno, MenuTypeEnum tipoMenu) {
        super(TipoPortataEnum.PRIMI_PIATTI, name, price ,piattoDelGiorno, tipoMenu);

    }
}
