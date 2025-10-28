package EsercizioEsame4;

public class Pietra extends Prezioso {
    private int carati;

    public Pietra(int peso, int carati) {
        super(peso);
        this.carati = carati;
        if (carati < 0) {
            throw new IllegalArgumentException("I carati non possono essere negativi");
        }
    }

    @Override
    public int getCarati() {
        return carati;
    }
}
