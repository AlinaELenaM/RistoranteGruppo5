package Ristorante.consumatore;


import Ristorante.enums.EnumTavoli;

import java.time.LocalDateTime;
import java.util.List;

/**
 * La classe Sala usata per gestire i tavoli(prenotare un tavolo)
 * e stampare i dettagli dei tavoli dentro la sala

 */
public class Sala {
    private final String nomeSala;
    private final List<Tavolo> listaTavoli;
    /** Numero totale di ogni tipo di tavolo*/
    public Integer tavoliTotaliMini;
    public Integer tavoliTotaliPiccoli;
    public Integer tavoliTotaliMedio;
    public Integer tavoliTotaliFamiglia;
    public Integer tavoliTotaliGrande;
    /**
     * Inizializza una Sala
     *
     * @param nomeSala    nome sala
     * @param listaTavoli lista tavoli
     */
    public Sala(String nomeSala,List<Tavolo> listaTavoli) {
        this.listaTavoli = listaTavoli;
        this.nomeSala = nomeSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }



    /**
     * Prenota tavolo
     *
     * @param cliente            il cliente che fa la prenotazione
     * @param tipoTavoloRichiesto     i posti richiesti dal cliente
     * @param orarioPrenotazione l'orario della prenotazione
     */
    //TODO gestire la duplicazione prenotazioni sullo stesso tavolo
    /** il metodo prenotaTavolo gestisce l'overbooking*/
    public void prenotaTavolo(Cliente cliente, EnumTavoli tipoTavoloRichiesto, LocalDateTime orarioPrenotazione){
        if (tipoTavoloRichiesto == EnumTavoli.MINI){
            if (tavoliTotaliMini > 0){System.out.println("Il tavolo e disponibile per " + cliente.getCognome());
            } else System.out.println("Il tavolo e disponibile per " + cliente.getCognome());
        }
        if (tipoTavoloRichiesto == EnumTavoli.PICCOLO){
            if (tavoliTotaliPiccoli > 0){System.out.println("Il tavolo e disponibile per " + cliente.getCognome());
            } else System.out.println("Il tavolo richiesto non e disponibile per " + cliente.getCognome());
        }
        if (tipoTavoloRichiesto == EnumTavoli.MEDIO){
            if (tavoliTotaliMedio > 0){System.out.println("Il tavolo e disponibile per " + cliente.getCognome());
            } else System.out.println("Il tavolo richiesto non e disponibile per " + cliente.getCognome());
        }
        if (tipoTavoloRichiesto == EnumTavoli.FAMIGLIA){
            if (tavoliTotaliFamiglia > 0){System.out.println("Il tavolo e disponibile per " + cliente.getCognome());
            } else System.out.println("Il tavolo richiesto non e disponibile per " + cliente.getCognome());
        }
        if (tipoTavoloRichiesto == EnumTavoli.GRANDE){
            if (tavoliTotaliGrande > 0){System.out.println("Il tavolo e disponibile per " + cliente.getCognome());
            } else System.out.println("Il tavolo richiesto non e disponibile per " + cliente.getCognome());
        }
        ;
    }

    /**
     * Stampa sala
     */
    public void stampaSala(){
        System.out.println("Nome Sala: " + this.nomeSala);
        for(Tavolo tavolo : listaTavoli){
            tavolo.stampaTavolo();
        }
    }
}
