package Ristorante.foodAndDrink.dishEntities;


import Ristorante.enums.MenuTypeEnum;
import Ristorante.enums.TipoPortataEnum;
import Ristorante.foodAndDrink.Portata;

public class Drink extends Portata {

    /**
     * metodo costruttore della classe Drink
     * @param portataId --> id della portata
     * @param name --> nome del drink
     * @param price --> prezzo del drink
     * @param piattoDelGiorno --> piatto del giorno
     * @param tipoMenu --> tipo(categoria) del menu a cui appartiene(CLASSICO, VEGETARIANO, VEGANO)
     */
    public Drink(Integer portataId, String name, Double price, boolean piattoDelGiorno, MenuTypeEnum tipoMenu) {
        super(portataId, TipoPortataEnum.DRINK, name, price ,piattoDelGiorno, tipoMenu);
    }

}



