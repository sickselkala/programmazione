package EsercizioEsame5;

public class Agenda {
    private Appuntamento[] app; //["null", "null", "null"] ad es.
    private int appuntamenti; //n deve essere positivo, numero di appuntamenti gia prenotati

    public Agenda(int n){
        if (n < 0){
            throw new IllegalArgumentException("Il numero massimo di appuntamenti non può essere minore di 0");
        }
        this.appuntamenti = 0;
        this.app = new Appuntamento[n];
    }
    /*
    vincoli:
    - Se "a" e` null oppure
    - se si e` raggiunta la dimensione massima dell'agenda oppure
    -se c'e` gia` un appuntamento nel giorno e ora indicati in "a"

    il metodo non effettua alcuna operazione e restituisce false.
    Altrimenti, il metodo aggiunge "a" rispettando
    l'ordine cronologico degli appuntamenti.
    Da notare che, in generale, il metodo puo` dover effettuare lo
    scorrimento di alcuni appuntamenti gia` presenti nell'agenda.

    Funzionamento:
    Aggiungi "a" rispettando l'ordine cronologico degli appuntamenti;
    caso 1: agenda vuota -> aggiunge in 1° posizione;
    caso 2: appuntamento da mettere n coda  -> aggiunta e basta;
    caso 3: appuntamento intermedio -> spostare app gia registrati.

    verificare che l'agenda sia vuota -> caso 1, oppure
    verificare indice dove dobbiamo inserire "a"
        -> caso 2 o caso 3
     */

    public boolean aggiungi (Appuntamento a){
        if(a == null || appuntamenti == app.length) return false;
        for(int i = 0; i < appuntamenti; i++){
            if(a.crono() == app[i].crono()){
                return false;
            }
        }
        int i = 0;
        while(a.crono() > app[i].crono()){
            i++;
        }
        /*
        a = g1 o3
            [g1 o1, g2 o1, g2 o4, null]
      ind      0       1       2    3
         */
        for(int j =(appuntamenti - 1); j >= i; j--){
            app[j+1] = app[j];
            /* Prima iterazione
            j = 2 | app[3] = app[2] | [g1 o1, g2 o1, g2 o4, g2 o4]
                                ind      0       1       2    3
            j = 1 | app[2] = app[1] | [g1 o1, g2 o2 , g2 o1, g2 o4]
                                ind      0       1       2    3
            j = 0 fine ciclo
             */
        }
        app[i] = a; //a è il nuovo appuntamento
        /*
        [g1 o1, *g1 o3* , g2 o1, g2 o4]
  ind      0       1       2    3
         */
        appuntamenti++;
        return true;
    }
    public boolean disdetta (int i){
        if(i < 0 || i >= appuntamenti) return false;
        for(int j = i +1; j < appuntamenti; j++){
            app[j-1] = app[j];
                    /*
        [g1 o1, *g1 o3* , g2 o1, g2 o4]  | disdetta(1) i = 1
  ind      0       1       2        3

        se i = 1 allora valido

        j = i+1 (2) | app(1) = app (2)
        quindi [g1 o1, g2 o1 , g2 o1, g2 o4]
        ind      0       1       2       3
        j = 3 | app(2) = app (3)
        quindi [g1 o1, g2 o1 , g2 o4, g2 o4]
        ind      0       1       2       3

        quindi il for ci lascia con l'ultimo appuntamento duplicato
         */
        }
        app[appuntamenti-1] = null; //crea null l'ultimo appuntamento ->[g1 o1, g2 o1 , g2 o4, null]
        appuntamenti--; //visto la disdetta, decremento la variabile appuntamenti
        return true;
    }

    public int numeroAppuntamenti(){
        return appuntamenti;
    }

    public Appuntamento appuntamento(int i) {
        if (i >= 0 && i < appuntamenti) {
            return app[i];
        }
        return null;
    }
}
