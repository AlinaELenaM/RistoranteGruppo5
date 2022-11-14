/**
 * La classe che fa riferimento ai Drink
 * @author Fabrizio Trupia
 * @version 1
 */

public class Drink {

    /**
     * tipo : "Bevanda"
     */
    private String type;

    /**
     * nome della bevanda
     */
    private String name;

    /**
     * prezzo della bevanda
     */
    private Integer price;

    /**
     * Metodo costruttore della classe Drink
     * @param type --> tipo: "Bevanda"
     * @param name --> nome della bevanda
     * @param price --> prezzo della bevanda
     */
    public Drink(String type, String name,Integer price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    /**
     * Metodo to string della classe Drink
     * @return i parametri: type , name, price della classe drink
     */
    @Override
    public String toString() {
        return "Bibita: " + type + " , Nome della bevanda: " + name + " , Prezzo: " + price + " euro";
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
}
