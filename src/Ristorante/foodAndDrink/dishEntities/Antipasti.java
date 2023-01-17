package Ristorante.foodAndDrink.dishEntities;

import Ristorante.enums.TipoPortataEnum;
import Ristorante.foodAndDrink.Portata;
import Ristorante.enums.MenuTypeEnum;

/**
 * La classe che fa riferimento agli antipasti che estende la classe Ristorante.FoodAndDrink.Portata
 * @author Alessandro Trupia
 * @version 1
 */
public class Antipasti extends Portata {
    /**
     * metodo costruttore della classe Antipasti
     * @param name --> nome dell'antipasto
     * @param price --> prezzo dell'antipasto
     * @param piattoDelGiorno --> piatto del giorno
     * @param tipoMenu --> tipo(categoria) del menu a cui appartiene(CLASSICO, VEGETARIANO, VEGANO)
     */
    public Antipasti(String name, Double price, boolean piattoDelGiorno, MenuTypeEnum tipoMenu) {
        super(TipoPortataEnum.ANTIPASTI, name, price ,piattoDelGiorno, tipoMenu);
    }
}
