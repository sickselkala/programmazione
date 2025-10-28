package EsercizioEsame5;

public class AgendaProva {
    private Appuntamento[] appuntamenti;
    private int nMax;
    private int c;

    public AgendaProva(int nMax){
        if (nMax < 0){
            throw new IllegalArgumentException("Valori fuori campo!");
        }
        this.nMax = nMax;
        this.appuntamenti =new Appuntamento[nMax];
        this.c = 0;
    }

    boolean aggiungi(Appuntamento a){
        boolean flag = false;
        if (a == null) {
            throw new IllegalArgumentException("Impossibile aggiungere un appuntamento");
        }
        if (c == nMax){
            throw new IllegalArgumentException("Agenda appuntamenti piena!");
        }
        for (int i = 0; i < nMax; i++){
            if (appuntamenti[i] == null) {
                appuntamenti[i] = a;
                c++;

            }
            else
                {
                    throw new IllegalArgumentException("Appuntamento gia presente!");
                }
            Appuntamento temp;
            if(a.crono() < appuntamenti[i].crono()){
                flag = true;
                temp = appuntamenti[i];
                appuntamenti[i] = a;
                a = temp;
            }
        }
        if (flag){
            c++;
            return true;
        }else{
            return false;
        }
    }
    public boolean disdetta (int n){
        if (n >= 0 && n < nMax && appuntamenti[n] != null) {
            appuntamenti[n] = null;
            c--;
            return true;
        }
        return false;
    }
    public int numeroAppuntamenti(){
        return c;
    }
    public Appuntamento appuntamento(int i){
        if (i >= 0 && i < nMax) {
            return appuntamenti[i];
        }
        return null;
    }
}
