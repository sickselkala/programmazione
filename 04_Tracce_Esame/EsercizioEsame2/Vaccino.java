package EsercizioEsame2;
//Classe astratta vaccino. La classe è astratta visto che deve definire
//parametri in comune a due tipi di vaccini destinati a persone diverse
public abstract class Vaccino {
    private int identificativo;     //Numero identificativo (int > 1000)
    private String aziendaFarm;     //Nome azienda farmaceutica (String >3)
    private int richiamo;           //Durata in GIORNI prima del successivo richiamo (int > 10)

    //definisco il costruttore
    public Vaccino (int identificativo, String aziendaFarm, int richiamo){
        //controllo sui dati, lancia eccezione se non sono corretti
        if (identificativo <1000 || aziendaFarm.length() < 3 || richiamo < 10) { throw new RuntimeException("DatiErrati!");}
        this.identificativo = identificativo;
        this.aziendaFarm = aziendaFarm;
        this.richiamo = richiamo;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public int getRichiamo() {
        return richiamo;
    }

    public String getAziendaFarm() {
        return aziendaFarm;
    }

    @Override
    public String toString() {
        return "Vaccino{" +
                "identificativo=" + identificativo +
                ", aziendaFarm='" + aziendaFarm + '\'' +
                ", richiamo=" + richiamo +
                '}';
    }
}
