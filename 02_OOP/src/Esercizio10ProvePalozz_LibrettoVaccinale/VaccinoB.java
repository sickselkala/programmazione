package Esercizio10ProvePalozz_LibrettoVaccinale;

public class VaccinoB extends Vaccino{
    private int id;
    private String azienda;
    private String somministrazione;

    public VaccinoB(int id, String azienda, String somministrazione, int richiamo){
        super(richiamo);
        this.azienda = azienda;
        this.id = id;
        this.somministrazione = somministrazione;
        if(this.id < 0 || this.azienda == null || somministrazione == null){
            throw new IllegalArgumentException("DatiErrati");
        }
    }

    public String getAzienda() {
        return azienda;
    }

    public int getId() {
        return id;
    }

    public String getSomministrazione() {
        return somministrazione;
    }
}
