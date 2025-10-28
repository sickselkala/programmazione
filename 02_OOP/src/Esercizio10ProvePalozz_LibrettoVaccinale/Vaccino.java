package Esercizio10ProvePalozz_LibrettoVaccinale;

public abstract class Vaccino {
    private int richiamo; // >10 giorni

    public Vaccino(int richiamo){
        if(richiamo < 10){
            throw new IllegalArgumentException("DatiErrati");
        }
        this.richiamo = richiamo;
    }

    public int getRichiamo() {
        return richiamo;
    }
}
