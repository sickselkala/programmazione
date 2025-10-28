package Esercizio5ProvePalozz_Prezioso;

public class Gioiello {
    private Prezioso[] elenco;
    private int n;

    public Gioiello (int nMax){
        if(nMax < 1){
            throw new RuntimeException("Parametri non validi");
        }
        this.n = 0;
        this.elenco = new Prezioso[nMax];
    }

    public boolean add (Prezioso p) {   //Aggiunge un prezioso all'elenco oro o pietra
        for(int i = 0; i < elenco.length; i++){
            if(elenco[i] == null){
                elenco[i] = p;
                n++;
                return true;
            }
        }
        return false;
    }

    public boolean check (){
        int totCarati = 0;
        int totPeso = 0;
        for (int i = 0; i < n; i++){
            if(elenco[i] instanceof Pietra){
                totCarati += elenco[i].getCarati();
                totPeso += elenco[i].getPeso();
            }
        }
        return totCarati > totPeso;
    }

    public int caratiPietre(){
        int totCarati = 0;
        for (int i = 0; i < n; i++){
            if(elenco[i] instanceof Pietra){
                totCarati += elenco[i].getCarati();
            }
        }
        return totCarati;
    }
}
