package Ristorante.consumatore;

import Ristorante.enums.MenuTypeEnum;

/**
 * La classe che fa riferimento ai clienti
 * @author Andrea Sciscioli
 * @version 1
 */

public class Cliente {
    private Integer clienteId;

    /**
     * cognome dei clienti
     */
    private String cognome;

    /**
     * gusto del cliente
     */
    private MenuTypeEnum gusti;

    /**
     * metodo costruttore cliente
     *
     * @param cognome --> cognome del cliente
     * @param gusti   --> gusto del cliente
     */
    public Cliente(Integer clienteId, String cognome, MenuTypeEnum gusti) {
        this.clienteId = clienteId;
        this.cognome = cognome;
        this.gusti = gusti;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public MenuTypeEnum getGusti() {
        return gusti;
    }

    public void setGusti(MenuTypeEnum gusti) {
        this.gusti = gusti;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "clienteId= " + clienteId +
                ",cognome= '" + cognome + '\'' +
                ",gusti= " + gusti +
                "\n";
    }

    /**
     * Metodo info cliente
     */
    public void infoCliente() {
        System.out.println("Cliente: " + this.cognome + " Gusto cliente: " + this.gusti);
    }



}