package Esercizio9ProvePalozz_Colesterolo;

public class Esami {
    private EsameColesterolo[] esami;
    private int numeroEsami;

    public Esami(int n){
        if (n < 0 ){
            throw new RuntimeException("Il numero di esami non può essere negativo!");
        }
        this.esami = new EsameColesterolo[n];
        this.numeroEsami = 0;
    }

    boolean add(EsameColesterolo m){
        if(m == null){
            return false;
        }
        if(this.esami.equals(m)){
            return false;
        }
        for(int i = 0; i < esami.length; i++){
            if(esami[i] == null){
                esami[i] = m;
                numeroEsami++;
                return true;
            }
        }
        return false;
    }

    public int trigliceridiMassimo(){
        int max = 0;
        for(int i = 0; i < numeroEsami; i++){
            if(esami[i] != null){
                max += esami[i].getTrigliceridi();
            }
        }
        return max;
    }

    public double intervallo(){    double sommaDifferenze = 0;
        int count = 0;
        for (int i = 0; i < numeroEsami; i++) {
            if (esami[i] != null) {
                sommaDifferenze += (esami[i].getLdl() - esami[i].getHdl());
                count++;
            }
        }
        return count > 0 ? sommaDifferenze / count : 0;
    }
}
