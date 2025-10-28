package Esercizio1ProvePalozz_SistemaSolare;

public class SistemaSolare {
    private Pianeta[] sistema;
    private int numero;

    public SistemaSolare(int nMax){
        if(nMax < 0){
            throw new RuntimeException("Il sistema solare non può avere grandezza negativa!");
        }
        sistema = new Pianeta[nMax];
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public boolean nuovo(Pianeta p) {
        if(p == null || numero >= sistema.length){
            return false;
        }
        if((int)p.getDistanza() >= sistema.length){
            throw new ArrayIndexOutOfBoundsException("Il pianeta è troppo lontano!");
        }
        boolean flag = false;
        for (int i = 0; i < sistema.length; i++) {
            if (sistema[i] == null) {
                sistema[i] = p;
                numero++;
                flag = true;
                break;
            }
            Pianeta temp;
            if (p.getDistanza() < sistema[i].getDistanza()) {
                temp = sistema[i];
                sistema[i] = p;
                p = temp;
                flag = true;
            }
        }
        return flag;
    }

    Pianeta getPianeta(int n){
        for(int i = 0; i < numero; i++){
            if(sistema[i] == sistema[n]) {
                return sistema[i];
            }
        }
        return null;
    }

    public void stampaPianeti(){
        for(int i = 0; i < numero; i++){
            System.out.println(sistema[i].getNome()+ " " + sistema[i].getMassa() + " " + sistema[i].getDistanza());
        }
    }

    Pianeta getMaxPianeta(){
        Pianeta max = sistema[0];
        for(int i = 0; i < numero; i++){
            if(sistema[i].getMassa() > max.getMassa()){
                max = sistema[i];
            }
        }
        return max;
    }
}
