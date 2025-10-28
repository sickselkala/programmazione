package Esercizio2ProvePalozz_VisiteMediche;

public class Coda{
    private Visita[] coda;
    private int prenotati;

    public Coda(int n){
      n = n;
      if(n < 0){
          throw new IllegalArgumentException("Valore max non valido!");
      }
      this.prenotati = 0;
      this.coda = new Visita[n];
    }

    public boolean inserimento(Visita v){
        if(v == null){
            return false;
        }
        if(prenotati >= coda.length){
            return false;
        }
        for(int i = 0; i < this.coda.length; i++){
            if(this.coda[i] == null){
                this.coda[i] = v;
                prenotati++;
                return true;
            }
        }
        return false;
    }

    public Visita estrazione(){
        if(prenotati == 0){
            return null;
        }
        Visita v = coda[0];
        for(int i = 0; i < this.prenotati -1; i++){
            coda[i] = coda[i + 1];
        }
        prenotati--;
        return v;
    }

    public boolean cancellazione(String nome, String cognome){
        for(int i = 0; i < this.prenotati; i++){
            if(this.coda[i].getNome().equals(nome) && this.coda[i].getCognome().equals(cognome)){
                estrazione();
                return true;
            }
        }
        return false;
    }
}