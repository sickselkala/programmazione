package Esercizio5ProveGithub_Supermercato;

public class Ricevuta {
    private int progressivo;
    private double totale;
    private Prodotto[] lista;

    public Ricevuta(Prodotto[] lista, int progressivo, double totale) {
        this.progressivo = 0;
        this.totale = totale;
        this.lista = new Prodotto[lista.length];
    }

    public int getProgressivo() {
        return progressivo;
    }

    public double getTotale() {
        return totale;
    }

    public boolean aggiungiArticolo(Prodotto p){
        if(p == null){
            return false;
        }
        if(this.equals(p)){
            return false;
        }
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                lista[i] = p;
                this.totale += p.getPrezzo();
                progressivo++;
                return true;
            }
        }
        return false;
    }

    public boolean rimuoviArticolo(Prodotto p){
        if(p == null){
            return false;
        }
        for(int i = 0; i < lista.length; i++){
            if(lista[i].equals(p)){
                this.totale -= p.getPrezzo();
                lista[i] = null;
                progressivo--;
                return true;
            }
        }
        return false;
    }

    public boolean nuovaRicevuta(Prodotto[] a, int progressivo) {
        if (a == null) {
            return false;
        }
        if (progressivo < 1) {
            return false;
        }
        for(int i = 0; i < this.progressivo; i++) {
            if (a[i] == null) {
                return false;
            }
            this.totale += a[i].getPrezzo();
            a[i].setQuantita((int) (a[i].getQuantita() - 1));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < progressivo; i++) {
            s += lista[i].getNome() + " " + lista[i].getPrezzo() + " " + lista[i].getCodice() + "\n";
        }
        s += "Totale: " + totale;
        return s;
    }
}
