package EsercizioEsame2;

public class VaccinoB extends Vaccino{
    private String somministrazione;
    public VaccinoB (int identificativo, String aziendaFarm, int richiamo, String somministrazione){
        super(identificativo, aziendaFarm, richiamo);
        this.somministrazione = somministrazione;
    }

    public String getSomministrazione() {
        return somministrazione;
    }
    @Override
    public String toString() {
        return super.toString() +
                " somministrazione='" + somministrazione + '\'' +
                '}';
    }
}
