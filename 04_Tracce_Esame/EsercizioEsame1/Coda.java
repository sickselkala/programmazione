package EsercizioEsame1;

public class Coda {
    private Visita[] coda;
    private int npren = 0;
    private int numero = npren;

    public Coda(int nprenmax) {
        this.coda = coda;
        this.npren = npren;
        if (nprenmax <= 0) {
            throw new RuntimeException("Il numero di prenotazioni massime non può essere negativo!");
        }
        coda = new Visita[nprenmax];
    }

    public Visita[] getCoda() {
        return coda;
    }

    public boolean inserimento(Visita v) {
        if (v == null) return false;
        if (npren >= coda.length) {
            return false;
        }
        coda[npren] = v;
        npren++;
        return true;
    }

    public Visita estrazione() {
        if (npren == 0) {
            return null;
        }
        Visita estratta = coda[0];
        for (int i = 0; i < npren - 1; i++) {
            coda[i] = coda[i + 1];
        }
        coda[npren - 1] = null;
        npren--;
        return estratta;
    }

    public boolean cancella(String nome, String cognome) {
        for (int i = 0; i < npren; i++) {
            if (coda[i] != null &&
                    coda[i].getCognome().equals(cognome) &&
                    coda[i].getNome().equals(nome)) {
                for (int j = i; j < npren - 1; j++) {
                    coda[j] = coda[j + 1];
                }
                coda[npren - 1] = null;
                npren--;
                return true;
            }else throw new RuntimeException("NOME INESISTENTE");
        }
        return false;
    }
    public void stampaCoda(){
        StdOut.println("CODA ATTUALE: ");
        for (int i = 0; i < npren; i++){
            StdOut.println(coda[i]);
        }
    }
    public int getNumero() {
        return numero;
    }
}