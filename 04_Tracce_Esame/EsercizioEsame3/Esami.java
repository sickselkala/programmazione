package EsercizioEsame3;

public class Esami {
    private Esame[] elenco;
    private int n;
    private int nmax;

    public Esami (int nmax){
        if (nmax < 0){
            throw new IllegalArgumentException("valore massimo negativo!");
        }
        this.nmax = nmax;
        this.n = 0;
        elenco = new Esame[nmax];
    }

    public Esame[] getElenco() {
        return elenco;
    }
    public boolean add (Esame m){
        if (m == null) return false;
        if (n >= elenco.length) {
            return false;
        }
        elenco[n] = m;
        n++;
        return true;
    }
    public int trigliciridiMassimo(){
        if (n == 0) throw new IllegalStateException("nessun esame precedente...");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
                max = Math.max (max, elenco[i].getTrigliceridi());
            }
        return max;
    }
    public double intervallo(){
        double sum = 0;
        for (int i = 0; i < n; i++){
            sum += (elenco[i].getIdl() - elenco[i].getHdl());
        }
        return n > 0 ? sum / n : 0;
    }

}
