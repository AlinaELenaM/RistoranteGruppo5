package Ristorante.foodAndDrink;

import Ristorante.enums.MenuTypeEnum;

/**
 * La classe che fa riferimento alla portata
 * @author Fabrizio Trupia, Alessandro Trupia, Nicola Boniello, Andrea Sciscioli
 * @version 1
 */

public class Portata {

    /**
     * Tipo della portata
     */
    private String type;

    /**
     * Nome del piatto
     */
    private String name;

    /**
     * Prezzo del piatto
     */
    private Integer price;

    /**
     * possibilità d'indicare se un piatto è del giorno o meno
     */

    private boolean piattoDelGiorno;

    /**
     * tipo di menu
     */
    private MenuTypeEnum tipoPortata;

    public Portata(String type, String name,Integer price, boolean piattoDelGiorno){
        this.type = type;
        this.name = name;
        this.price = price;
        this.piattoDelGiorno=piattoDelGiorno;
    }

    /**
     * Metodo costruttore della classe portata
     * @param type --> tipo della portata
     * @param name --> nome del piatto
     * @param price --> prezzo del piatto
     * @param piattoDelGiorno --> piatto del giorno
     */
    public Portata(String type, String name,Integer price, boolean piattoDelGiorno, MenuTypeEnum tipoPortata){
        this.type = type;
        this.name = name;
        this.price = price;
        this.piattoDelGiorno=piattoDelGiorno;
        this.tipoPortata =tipoPortata;
    }

    public boolean isPiattoDelGiorno(){
        return piattoDelGiorno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public MenuTypeEnum getTipoPortata() {
        return tipoPortata;
    }

    public void setTipoPortata(MenuTypeEnum typeMenuEnum) {
        this.tipoPortata = tipoPortata;
    }

    public void setPiattoDelGiorno(boolean piattoDelGiorno) {
        this.piattoDelGiorno = piattoDelGiorno;
    }

    /**
     * Metodo che stampa le info della portata
     */
    public String stampaInfoPortata() {
        return "Tipo: " + type + " , Nome del piatto: " + name + " , Prezzo: " + price + " euro " + " Categoria: " + tipoPortata;
    }


}
