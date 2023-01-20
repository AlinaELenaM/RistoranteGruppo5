package Ristorante.foodAndDrink;

import Ristorante.consumatore.Cliente;
import Ristorante.enums.MenuTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe che fa riferimento al menu
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 1
 */
public class Menu {

    private Integer menuId;
    /**
     * Il tipo di menu
     */
    private MenuTypeEnum type;

    /**
     * Il nome del ristorante
     */
    private String name;

    /**
     * costo del coperto
     */
    private Integer coperto;


    /**
     * Lista del menu
     */
    private List<Portata> listaMenu;


    /**
     * Lista delle portate Menu Vegano
     */
    private final List<Portata> listaPortata = new ArrayList<>();


    /**
     * Metodo costruttore classe Menu
     * @param list lista delle portate
     */
    public Menu(List<Portata> list, Integer menuId,String name, String type) {
        this.listaMenu = list;
    }

    public Menu(int menu_id, String name, MenuTypeEnum type) {
        this.menuId = menuId;
        this.name = name;
        this.type = type;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public MenuTypeEnum getType() {
        return type;
    }

    public void setType(MenuTypeEnum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoperto() {
        return coperto;
    }

    public void setCoperto(Integer coperto) {
        this.coperto = coperto;
    }

    public List<Portata> getPortataList() {
        return listaMenu;
    }

    public void setPortataList(List<Portata> portataList) {
        this.listaMenu = portataList;
    }


    /**
     * Un metodo per stampare il menu
     */
    public void stampaMenu() {
        System.out.println("===============  MENU  ===============");
        for (Portata portaList:listaPortata) {
            System.out.println(portaList.stampaInfoPortata());
        }
    }

    /**
     * un metodo per aggiungere la portata alla lista Menu classico
     * @param portata l'oggetto portata
     */
    public void addPortata(Portata portata){
        listaPortata.add(portata);
    }


    /**
     * un metodo per stampare il piatto del giorno e le relative informazioni del piatto
     */
    public void stampaPiattoDelGiorno() {
        System.out.println("==============PIATTO DEL GIORNO==============");
        for (Portata piattoDelGiorno : listaPortata) {
            if (piattoDelGiorno.isPiattoDelGiorno()) {
                System.out.println("Piatto del giorno raccomandato: " + piattoDelGiorno.getTipoPortataEnum() + " = " + piattoDelGiorno.getName() + " - " + piattoDelGiorno.getPrice() + " euro ");
            }
        }
    }

    /**
     * metodo che consiglia un piatto al cliente in base alle preferenze del cliente
     * @param cliente l'oggetto cliente
     */
    public void stampaPiattoInBaseAlCliente(Cliente cliente){
        System.out.println("Gentile " + cliente.getCognome()
                + " in base alle tue preferenze abbiamo il seguente menu per te");
        for(Portata portata : listaPortata){
            if (cliente.getGusti() == portata.getTipoMenu()){
                System.out.println(portata.stampaInfoPortata());
            }
        }
    }
    public String toString() {
        return "Menu: " +
                "menuId= " + menuId +
                ",name= '" + name + '\'' +
                ",type= " + type +
                "\n";
    }

    public void infoMenu() {
        System.out.println("Menu: " + this.name + " tipo menu : " + this.type);
    }
}