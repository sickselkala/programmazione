
package EsercizioEsame7;


public class Carrozza extends Vagone{
    private int posti;

    public Carrozza (int posti,int peso) throws Exception{
        super(peso);
        if (posti < 40 || posti > 200){
            throw new IllegalArgumentException("Posti fuori range!");
        }
        this.posti = posti;
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }

    public int getPosti() {
        return posti;
    }
}
