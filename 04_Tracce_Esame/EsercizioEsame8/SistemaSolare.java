package EsercizioEsame8;
public class SistemaSolare {
    private Pianeta[] pianeti;
    private int nMaxPianeti;

    public SistemaSolare(int nMaxPianeti) {
        if (nMaxPianeti<0) {
            throw new IllegalArgumentException("Il numero di pianeti non può essere negativo");
        }
        this.nMaxPianeti = nMaxPianeti;
        pianeti = new Pianeta[nMaxPianeti];
    }
    public boolean nuovoOrdinato(Pianeta p){

        boolean flag = false;

        for(int i = 0; i < pianeti.length; i++){
            if(pianeti[i] == null){
                pianeti[i] = p;
                nMaxPianeti++;
                return true;
            }
            Pianeta temp;
            if(p.getDistanza() < pianeti[i].getDistanza()){
                flag = true;
                temp = pianeti[i];
                pianeti[i] = p;
                p = temp;
            }
        }

        if (flag) {
            nMaxPianeti++;
            return true;
        } else {
            return false;
        }

    }
    //aggiunge un pianeta in base nella posizione corrispondente alla distanza

    boolean nuovo (Pianeta p){
        for (int i = 0; i < pianeti.length; i++){
            if(pianeti[i] == null){
                pianeti[i] = p;
                return true;
            }
        }
        return false;
    }
    int getNumero(){
        int count = 0;
        for(int i = 0; i < pianeti.length; i++){
            if (pianeti[i] != null){
                count++;
            }
        }
        return count;
    }
    Pianeta getPianeta(int n){
        if (n < 0 || n >= pianeti.length){
            return null;
        }
        return pianeti[n];
    }
    Pianeta getMaxPianeta() {
        Pianeta max = pianeti[0];
        for (int i = 1; i < pianeti.length; i++) {
            if (pianeti[i] != null && pianeti[i].getMassa() > max.getMassa()) {
                max = pianeti[i];
            }
        }
        return max;
    }
    public void stampaPianeti(){
        for (int i = 0; i < pianeti.length; i++){
            if (pianeti[i] != null){
                System.out.println(pianeti[i].getNome());
            }
        }
    }
}
