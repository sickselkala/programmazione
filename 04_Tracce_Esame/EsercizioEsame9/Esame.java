package EsercizioEsame9;

public class Esame {
    private String nome;
    private int CFU;
    private int voto;
    private long data;
    private int CFUtot;

    public Esame(String nome, int CFU) {
        if (nome == null || CFU < 1 || CFU > 18) {
            throw new IllegalArgumentException("I parametri non possono essere nulli o negativi");
        }
        this.nome = nome;
        this.CFU = CFU;
        this.CFUtot = 0;
        for (int i = 0; i < 30; i++) {
            if (CFU > 180) {
                throw new IllegalArgumentException("Non è possibile aggiungere esami con CFU maggiori di 180");
            } else {
                CFUtot += CFU;
            }
        }
        this.voto = 0;
        this.data = 20200000;
    }
    public void esameSostenuto (int voto, long data){
        if(voto < 18 || voto > 30 || data < 20200000){
            throw new IllegalArgumentException("I parametri non possono essere nulli o negativi");
        }
        this.voto = voto;
        this.data = data;
    }

    public int getCFU() {
        return CFU;
    }

    public long getData() {
        return data;
    }

    public int getVoto() {
        return voto;
    }
}


