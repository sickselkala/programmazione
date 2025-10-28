package Esercizio10ProvePalozz_LibrettoVaccinale;

public class VaccinoA extends Vaccino{
    private int id;
    private String azienda;

    public VaccinoA(int id, String azienda, int richiamo){
        super(richiamo);
        this.azienda = azienda;
        this.id = id;
        if(this.id < 0 || this.azienda == null){
            throw new IllegalArgumentException("DatiErrati");
        }
    }

    public int getId() {
        return id;
    }

    public String getAzienda() {
        return azienda;
    }
}
