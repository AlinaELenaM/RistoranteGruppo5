package Ristorante.foodAndDrink;

import Ristorante.enums.MenuTypeEnum;
import Ristorante.enums.TipoPortataEnum;

/**
 * La classe che fa riferimento alla portata
 * @author Fabrizio Trupia, Alessandro Trupia, Nicola Boniello, Andrea Sciscioli
 * @version 1
 */

public abstract class Portata {

    /**
     * Tipo della portata(DESSERT, DRINK, PRIMI_PIATTI, ECC)
     */
    private TipoPortataEnum tipoPortataEnum;

    /**
     * Nome del piatto
     */
    private String name;

    /**
     * Prezzo del piatto
     */
    private Double price;

    /**
     * possibilità d'indicare se è piatto del giorno o meno
     */
    private boolean piattoDelGiorno;
    /**
     * categoria di menu a cui appartiene (CLASSICO, VEGETARIANO, VEGANO)
     */
    private MenuTypeEnum tipoMenu;


    /**
     * Metodo costruttore della classe portata
     * @param tipoPortataEnum --> tipo della portata(DESSERT, DRINK, PRIMI_PIATTI, ECC)
     * @param name --> nome del piatto
     * @param price --> prezzo del piatto
     * @param piattoDelGiorno --> piatto del giorno
     * @param tipoMenu --> tipo(categoria) del menu a cui appartiene(CLASSICO, VEGETARIANO, VEGANO)
     */
    public Portata(TipoPortataEnum tipoPortataEnum, String name,
                   Double price, boolean piattoDelGiorno, MenuTypeEnum tipoMenu){
        this.tipoPortataEnum = tipoPortataEnum;
        this.name = name;
        this.price = price;
        this.piattoDelGiorno = piattoDelGiorno;
        this.tipoMenu = tipoMenu;
    }

    public TipoPortataEnum getTipoPortataEnum() {
        return tipoPortataEnum;
    }
    public void setTipoPortataEnum(TipoPortataEnum tipoPortataEnum) {
        this.tipoPortataEnum = tipoPortataEnum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public MenuTypeEnum getTipoMenu() {
        return tipoMenu;
    }
    public void setTipoMenu(MenuTypeEnum tipoMenu) {
        this.tipoMenu = tipoMenu;
    }
    public boolean isPiattoDelGiorno(){
        return piattoDelGiorno;
    }
    public void setPiattoDelGiorno(boolean piattoDelGiorno) {
        this.piattoDelGiorno = piattoDelGiorno;
    }

    /**
     * Metodo che stampa le info della portata
     */
    public String stampaInfoPortata() {
        return "Tipo: " + tipoPortataEnum + " , Nome della portata: " + name
                + " , Prezzo: " + price + " euro " + " Categoria: " + tipoMenu;
    }
}
