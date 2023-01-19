package Ristorante.foodAndDrink.dishEntities;

import Ristorante.enums.TipoPortataEnum;
import Ristorante.foodAndDrink.Portata;
import Ristorante.enums.MenuTypeEnum;

/**La classe che fa riferimento ai dessert del Ristorante.FoodAndDrink.Menu
 * @Author Andrea Sciscioli
 * @Version 1
 */
public class Dessert extends Portata {

    /**Metodo costruttore della classe Dessert
     * @param portataId --> id della portata
     * @param name --> nome del dessert
     * @param price --> prezzo del dessert
     * @param piattoDelGiorno --> piatto del giorno
     * @param tipoMenu --> tipo(categoria) del menu a cui appartiene(CLASSICO, VEGETARIANO, VEGANO)
     */
    public Dessert(Integer portataId, String name, Double price, boolean piattoDelGiorno, MenuTypeEnum tipoMenu) {
        super(portataId, TipoPortataEnum.DESSERT, name, price ,piattoDelGiorno, tipoMenu);
    }
}
