package EsercizioEsame4;

public class Oro extends Prezioso {
    private int carati;

    public Oro(int peso, int carati) {
        super(peso);
        this.carati = carati;
        if (carati < 8 && carati > 14) {
            throw new IllegalArgumentException("I carati non possono essere negativi");
        }
    }

    @Override
    public int getCarati() {
        return carati;
    }
}
