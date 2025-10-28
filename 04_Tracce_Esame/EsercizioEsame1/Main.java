package EsercizioEsame1;


public class Main{
    public static void main(String[] args) {
        //StdOut.println("Prova di esame. Benvenuto nel sistema di prenotazione");
        Coda coda = new Coda(10);
        Visita v1 = new Visita("Ignazio", "ilSurname");
        Visita v2 = new Visita("Paolo", "corazza");
        Visita v3 = new Visita("Mirko", "Biondi");
        Visita v4 = new Visita("Cristo", "Cane");
        Visita v5 = new Visita("GIAMMARCO", "TUZI");
        Visita v6 = new Visita("dio", "cane");
        coda.inserimento(v1);
        coda.inserimento(v2);
        coda.inserimento(v3);
        coda.inserimento(v4);
        coda.inserimento(v5);
        coda.inserimento(v6);
        coda.stampaCoda();
        //StdOut.println("IL PROSSIMO!");
        coda.estrazione();
        coda.estrazione();
        coda.estrazione();
        coda.stampaCoda();
        coda.cancella("Cristo", "Cane");
        coda.stampaCoda();
        }
    }