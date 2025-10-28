package Esercizio12ProvePalozz_Insieme;


public class InsiemePalozz {
    private int c;
    private int[] insieme;

    public InsiemePalozz(int n) {
        n = n;
        if (n < 0) {
            throw new RuntimeException("La dimensione dell'insieme non può essere negativa");
        }
        this.c = 0;
        this.insieme = new int[n];
    }

    public boolean contiene(int x) {
        for (int i = 0; i < this.c; i++) {
            if (insieme[i] == x) {
                return true;
            }
        }
        return false;
    }

    public boolean aggiungi(int x) {
        if (this.contiene(x)) {
            return false;
        }
        for (int i = 0; i < insieme.length; i++) {
            if (insieme[i] == 0) {
                insieme[i] = x;
                c++;
                return true;
            }
        }
        return false;
    }


    public int getDimensione() {
        return insieme.length;
    }

    public InsiemePalozz intersezione(InsiemePalozz that) {
        InsiemePalozz u = new InsiemePalozz(Math.min(this.c, that.c));
        for (int i = 0; i < this.c; i++) {
            if (that.contiene(this.insieme[i])) {
                u.aggiungi(that.insieme[i]);
            }
        }
        return u;
    }

    public InsiemePalozz differenza(InsiemePalozz that) {
        InsiemePalozz dif = new InsiemePalozz(Math.min(this.c, that.c));
        for (int i = 0; i < this.c; i++) {
            if (that.contiene(this.insieme[i])) {
                return null;
            }
            dif.aggiungi(this.insieme[i]);
        }
        return dif;
    }
}
