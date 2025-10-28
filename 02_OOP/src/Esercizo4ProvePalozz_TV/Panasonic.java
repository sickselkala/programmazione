package Esercizo4ProvePalozz_TV;

public class Panasonic extends TV{
    private int nCanali;
    private String risoluzione;
    private int [] canale;
    private int [] frequenza;

    public Panasonic (int nCanali,String risoluzione, int pollici, String nomeModello) throws Exception {
        super(pollici);
        this.nomeModello = nomeModello;
        this.risoluzione = risoluzione;
        this.nCanali = nCanali;
        canale = new int [nCanali];
        frequenza = new int[nCanali];
        if(nCanali < 12) throw new IllegalArgumentException("Numero di canali inferiore a 12");
    }

    public void setCanale(int c, int f) throws CanaliSovrapposti {
        if(c < 0 || f < 550 || f > 790){
            throw new IllegalArgumentException("PARAMETRI FUORI SCALA");
        }
        boolean aggiunto = false;
        for (int i = 0; i < nCanali; i++){
            if(frequenza[i] == f){
                throw new CanaliSovrapposti("CANALE SOVRAPPOSTO! LA FREQUENZA " + f +" è gia stata assegnata");
            }
        }
        for (int i = 0; i < nCanali; i++){
            if(canale[i] == 0){
                canale[i] = c;
                frequenza[i] = f;
                aggiunto = true;
                break;
            }
        }
        // Se non c'è stato spazio, significa che non ci sono canali liberi
        if (!aggiunto) {
            throw new IllegalStateException("Nessun spazio disponibile per aggiungere un nuovo canale.");
        }
    }

    @Override
    public String toString() {
        String s = "TV " + nomeModello + " (" + getPollici() + " pollici, " + risoluzione + ")\n";
        for (int i = 0; i < nCanali; i++) {
            if (canale[i] != 0) {
                s += "Canale " + canale[i] + ": " + frequenza[i] + " MHz\n";
            }
        }
        return s;
    }
}
