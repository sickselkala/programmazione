package Esercizio5ProvePalozz_Prezioso;

public class Pietra extends Prezioso {
    private int carati;

    public Pietra(int peso, int carati) throws Exception {
        super(peso);
        if (carati < 0) {
            throw new RuntimeException("Parametri non validi");
        }
        this.carati = carati;
    }

    @Override
    public int getCarati() {
        return carati;
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }
}
