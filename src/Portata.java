public class Portata {

    public EnumType type;
    public String name;
    public int price;

    public Portata(EnumType type, String name,int price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Portata: " + type + " , Nome del piatto: " + name + " , Prezzo: " + price + " euro";
    }



}