package Esercizio9ProvePalozz_Colesterolo;

public class EsameColesterolo {
    private long data; //data dell'esame in formato unix timestamp
    private int hdl;
    private int ldl;
    private int trigliceridi;

    public EsameColesterolo(int data, int hdl, int ldl, int trigliceridi) {
        if(ldl < 0 || ldl > 500 || ldl < hdl || trigliceridi < 0 || trigliceridi > 600) {
            throw new RuntimeException("Valori non validi");
        }
        this.data = data;
        this.hdl = hdl;
        this.ldl = ldl;
        this.trigliceridi = trigliceridi;
    }

    public long getData() {
        return data;
    }

    public int getHdl() {
        return hdl;
    }

    public int getLdl() {
        return ldl;
    }

    public int getTrigliceridi() {
        return trigliceridi;
    }
}
