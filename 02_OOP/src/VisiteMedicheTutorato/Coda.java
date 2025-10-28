package VisiteMedicheTutorato;

public class Coda {
    private Visita [] elenco;
    private int n;
    private int c;

    public Coda(int n){
        if(n < 0){
            throw new IllegalArgumentException("La dimensione dell'elenco non può essere negativa");
        }
        this.c = 0;
        this.n = n;
        this.elenco = new Visita[n];
    }

    public int getC() {
        return c;
    }

    public boolean inserimento (Visita v){
        if(this.c >= this.elenco.length){
            return false;
        }
        this.elenco[this.c] = v;
        this.c++;
        return true;
    }

    public Visita estrazione(){
        if (this.c == 0) {
            return null;
        }
        Visita visita = this.elenco[0];
        for(int i = 0; i < this.c - 1; i++){
            this.elenco[i] = this.elenco[i+1];
        }
        this.c--;
        return visita;
    }


    public boolean cancellazione(String nome, String cognome){
        for (int i = 0; i < this.c; i++){
            if(this.elenco[i].getNome().equals(nome) && this.elenco[i].getCognome().equals(cognome)){
                for(int j = i-1; j < this.c-1; j++){
                    this.elenco[j] = this.elenco[j+1];
                    c--;
                    return true;
                }
            }
        }
        return false;
    }

}
