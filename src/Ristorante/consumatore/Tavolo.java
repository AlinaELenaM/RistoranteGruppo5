package Ristorante.consumatore;

import Ristorante.enums.EnumTavoli;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Tavolo.
 */
public class Tavolo {
    private Integer tavoloId;
    private EnumTavoli tipoTavolo;
    private Integer numeroTavolo;
    private Sala salaDiAppartenenza;
    private final List<Prenotazione> listaPrenotazioni = new ArrayList<>();
//lista prenotazioni



    /**
     * Inizializza un Tavolo
     *
     * @param tipoTavolo   tipo del tavolo (grande, medio, piccolo)
     * @param numeroTavolo numero del tavolo (identificativo)
     */
    public Tavolo(EnumTavoli tipoTavolo, Integer numeroTavolo, Sala salaDiAppartenenza){
        this.tipoTavolo= tipoTavolo;
        this.numeroTavolo = numeroTavolo;
        this.salaDiAppartenenza = salaDiAppartenenza;
        aggiungiTavolo();
    }

    public Tavolo(int tavoloId, EnumTavoli tipoTavolo, int numeroTavolo) {
        this.tipoTavolo= tipoTavolo;
        this.numeroTavolo = numeroTavolo;
    }

    public EnumTavoli getTipoTavolo() {
        return tipoTavolo;
    }

    public void setTipoTavolo(EnumTavoli tipoTavolo) {
        this.tipoTavolo = tipoTavolo;
    }

    public Integer getNumeroTavolo() {
        return numeroTavolo;
    }

    public Integer getTavoloId() {
        return tavoloId;
    }

    public void setTavoloId(Integer tavoloId) {
        this.tavoloId = tavoloId;
    }

    public Sala getSalaDiAppartenenza() {
        return salaDiAppartenenza;
    }

    public void setSalaDiAppartenenza(Sala salaDiAppartenenza) {
        this.salaDiAppartenenza = salaDiAppartenenza;
    }

    public List<Prenotazione> getListaPrenotazioni() {
        return listaPrenotazioni;
    }

    public void setNumeroTavolo(Integer numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    /**
     * Aggiungi prenotazione al tavolo
     *
     * @param prenotazione la prenotazione da aggiungere al tavolo
     */
    public void aggiungiPrenotazione(Prenotazione prenotazione){
        listaPrenotazioni.add(prenotazione);
    }

    /**
     * Stampa tavolo
     * stampa i dettagli del tavolo e le sue prenotazioni.
     */
    public void stampaTavolo(){
        System.out.println("Numero del tavolo: " + numeroTavolo +
                " Tipo tavolo: " + tipoTavolo);
        for(Prenotazione prenotazione : listaPrenotazioni){
            prenotazione.stampaPrenotazione();
        }
    }
    public void aggiungiTavolo(){
        if (tipoTavolo == EnumTavoli.MINI){
            salaDiAppartenenza.tavoliTotaliMini += 1;
        } else if (tipoTavolo == EnumTavoli.PICCOLO){
            salaDiAppartenenza.tavoliTotaliPiccoli += 1;
        } else if(tipoTavolo == EnumTavoli.MEDIO){
            salaDiAppartenenza.tavoliTotaliMedio += 1;
        } else if (tipoTavolo == EnumTavoli.FAMIGLIA){
            salaDiAppartenenza.tavoliTotaliFamiglia += 1;
        } else if (tipoTavolo == EnumTavoli.GRANDE){
            salaDiAppartenenza.tavoliTotaliGrande += 1;
        }
    }
}
