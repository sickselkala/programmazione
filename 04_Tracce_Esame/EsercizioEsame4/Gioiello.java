package EsercizioEsame4;


public class Gioiello{
    private Prezioso[] preziosi;
    private int nPreziosi;
    private int count = 0;

    public Gioiello(int nPreziosi){
        if (nPreziosi < 1) {
            throw new IllegalArgumentException("Il numero di preziosi non può essere negativo");
        }
        this.nPreziosi = nPreziosi;
        preziosi = new Prezioso[nPreziosi];
        count = 0;
    }
    public boolean add(Prezioso p){
        if (count == preziosi.length){
            return false;
        }
        preziosi[count++] = p;
        return true;
    }
    public int getPeso() {
        int pesoTot = 0;
        for(int i = 0; i < count; i++){
            pesoTot += preziosi[i].getPeso();
        }
        return pesoTot;
    }
    public int getCarati() {
        int caratiTot = 0;
        for(int i = 0; i < count; i++){
            caratiTot += preziosi[i].getCarati();
        }
        return caratiTot;
    }

    public boolean check(){
        for(int i = 0; i < preziosi.length; i++){
            if (preziosi[i] == null) {
                return false;
            }else{
                if (preziosi[i].getCarati() > preziosi[i].getPeso()) {
                    return true;
                }
            }
        }
        return false;
    }
    public int CaratiPietre(){
        int caratiTot = 0;
        for(int i = 0; i < count; i++){
            if (preziosi[i] instanceof Pietra) {
                caratiTot += preziosi[i].getCarati();
            }
        }
        return caratiTot;
    }
}
