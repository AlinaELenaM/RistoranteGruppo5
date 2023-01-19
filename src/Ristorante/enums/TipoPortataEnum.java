package Ristorante.enums;

public enum TipoPortataEnum {
    ANTIPASTI("Antipasti"),
    DESSERT("Dessert"),
    DRINK("Drink"),
    PRIMI_PIATTI("Primi piatti"),
    SECONDI_PIATTI("Secondi piatti");

    private final String descrizione;
    TipoPortataEnum(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione() {
        return descrizione;
    }
}
