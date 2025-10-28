package EsercizioEsame3;

import java.time.Instant;

public class Esame {
    private long data;
    private int hdl;
    private int idl;
    private int trigliceridi;

    public Esame (long data, int hdl, int idl, int trigliceridi){
        if(idl >= 500 || hdl >= idl || trigliceridi < 1 || trigliceridi > 600){
            throw new IllegalArgumentException("VALORI NON VALIDI");
        }
        this.data = Instant.now().getEpochSecond();
        this.hdl = hdl;
        this.idl = idl;
        this.trigliceridi = trigliceridi;
    }

    public long getData() {
        return data;
    }

    public int getHdl() {
        return hdl;
    }

    public int getIdl() {
        return idl;
    }

    public int getTrigliceridi() {
        return trigliceridi;
    }
}
