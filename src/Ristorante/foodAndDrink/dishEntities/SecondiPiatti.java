package Ristorante.foodAndDrink.dishEntities;

import Ristorante.enums.TipoPortataEnum;
import Ristorante.foodAndDrink.Portata;
import Ristorante.enums.MenuTypeEnum;


/**
 * La classe che fa riferimento ai Secondi piatti che estende la classe Ristorante.FoodAndDrink.Portata
 * @author Fabrizio Trupia
 * @version 1
 */
public class SecondiPiatti extends Portata {

    /**
     * metodo costruttore della classe SecondiPiatti
     * @param name --> nome del secondo piatto
     * @param price --> prezzo del secondo piatto
     * @param piattoDelGiorno  --> piatto del giorno
     * @param tipoMenu --> tipo(categoria) del menu a cui appartiene(CLASSICO, VEGETARIANO, VEGANO)
     */
    public SecondiPiatti(String name, Double price, boolean piattoDelGiorno, MenuTypeEnum tipoMenu) {
        super(TipoPortataEnum.SECONDI_PIATTI, name, price, piattoDelGiorno, tipoMenu);
    }
}
