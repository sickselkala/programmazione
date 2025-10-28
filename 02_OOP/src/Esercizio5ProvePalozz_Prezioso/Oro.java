package Esercizio5ProvePalozz_Prezioso;

public class Oro extends Prezioso{
    private int carati; //intero tra 8 e 14

    public Oro (int peso, int carati) throws Exception {
        super(peso);
        if(carati < 8 || carati > 14){
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
