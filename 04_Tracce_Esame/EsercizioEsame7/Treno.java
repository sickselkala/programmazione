package EsercizioEsame7;

public class Treno {
    private int nVagoni;
    private Vagone[] vagoni;

    public Treno(int nVagoni) {
        if (nVagoni < 1) {
            throw new IllegalArgumentException("Numero vagoni non valido");
        }
        this.nVagoni = nVagoni;
        vagoni = new Vagone[nVagoni];
    }

    public int getnVagoni() {
        return nVagoni;
    }
    public boolean add(Vagone v) {
        for (int i = 0; i < vagoni.length; i++) {
            if (vagoni[i] == null) {
                vagoni[i] = v;
                nVagoni++;
                return true;
            }
        }
        return false;
    }

    public boolean check(){
        boolean check = false;
        int pesoTot = 0;
        int cavalliTot = 0;
        for(int i = 0; i < vagoni.length; i++){
            if (vagoni[i] == null) {
                return false;
            }else{
                pesoTot += vagoni[i].getPeso();
            }
        }
        for(int i = 0; i < vagoni.length; i++){
            if (vagoni[i] == null) {
                return false;
            }else{
                if (vagoni[i] instanceof Locomotiva) {
                    Locomotiva l = (Locomotiva) vagoni[i];
                    cavalliTot += l.getCavalli();
                    if (cavalliTot > pesoTot) {
                        check = true;
                    }
                }
            }
        }
        return check;
    }
    public int passeggeri(){
        int postiTot = 0;
        for (int i = 0; i < vagoni.length; i++){
            if(vagoni[i] instanceof Carrozza){
                Carrozza c = (Carrozza) vagoni[i];
                postiTot += c.getPosti();
            }
        }
        return postiTot;
    }
}

