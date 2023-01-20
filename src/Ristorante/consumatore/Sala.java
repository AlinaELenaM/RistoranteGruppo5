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
    public void prenotaTavolo(Prenotazione prenotazione){
        if (prenotazione.getMisuraTavolo() == EnumTavoli.MINI){
            if (tavoliTotaliMini > 0){System.out.println("Il tavolo e disponibile per " + prenotazione.getCliente().getCognome());
                tavoliTotaliMini -= 1;
            } else System.out.println("Il tavolo e disponibile per " + prenotazione.getCliente().getCognome());
        }
        if (prenotazione.getMisuraTavolo() == EnumTavoli.PICCOLO){
            if (tavoliTotaliPiccoli > 0){System.out.println("Il tavolo e disponibile per " + prenotazione.getCliente().getCognome());
                tavoliTotaliPiccoli -= 1;
            } else System.out.println("Il tavolo richiesto non e disponibile per " + prenotazione.getCliente().getCognome());
        }
        if (prenotazione.getMisuraTavolo() == EnumTavoli.MEDIO){
            if (tavoliTotaliMedio > 0){System.out.println("Il tavolo e disponibile per " + prenotazione.getCliente().getCognome());
                tavoliTotaliMedio -= 1;
            } else System.out.println("Il tavolo richiesto non e disponibile per " + prenotazione.getCliente().getCognome());
        }
        if (prenotazione.getMisuraTavolo() == EnumTavoli.FAMIGLIA){
            if (tavoliTotaliFamiglia > 0){System.out.println("Il tavolo e disponibile per " + prenotazione.getCliente().getCognome());
                tavoliTotaliFamiglia -= 1;
            } else System.out.println("Il tavolo richiesto non e disponibile per " + prenotazione.getCliente().getCognome());
        }
        if (prenotazione.getMisuraTavolo() == EnumTavoli.GRANDE){
            if (tavoliTotaliGrande > 0){System.out.println("Il tavolo e disponibile per " +prenotazione.getCliente().getCognome());
                tavoliTotaliGrande -= 1;
            } else System.out.println("Il tavolo richiesto non e disponibile per " + prenotazione.getCliente().getCognome());
        }
        ;
    }
    public void liberaTavolo(Prenotazione prenotazione){
        if (prenotazione.getMisuraTavolo() == EnumTavoli.MINI){
            tavoliTotaliGrande += 1;
        }
        if (prenotazione.getMisuraTavolo() == EnumTavoli.PICCOLO){
            tavoliTotaliGrande += 1;
        }
        if (prenotazione.getMisuraTavolo() == EnumTavoli.MEDIO){
            tavoliTotaliGrande += 1;
        }
        if (prenotazione.getMisuraTavolo() == EnumTavoli.FAMIGLIA){
            tavoliTotaliGrande += 1;
        }
        if (prenotazione.getMisuraTavolo() == EnumTavoli.GRANDE){
            tavoliTotaliGrande += 1;
        }


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
