public class Libro {
    private String autore;  //Principio di incapsulamento, inserisco all'interno dei contenitori
    private String titolo;  //i 3 oggetti, ognuno col suo tipo primitivo.
    private int pagine;

    //per permettere a questi dati di essere coerenti tra di loro creo la classe costruttore, in modo
    //che quando l'oggetto viene creato si controlla che questi attributi siano coerenti tra di loro
    //nel costruttore vanno anche aggiunti i controlli degli attributi

    public Libro (String a, String t, int p){
        if (p < 0 || p > 10000) p = 0;                      //controlla se il numero delle pagine sia coerente
        if (a.length() < 1 || a.length() > 1000) a = " ";   //controlla se l'autore sia un nome  coerente
        if (t.length() < 1 || t.length() > 1000) t = " ";   //controlla se il titolo sia coerente
        autore = a;
        titolo = t;
        pagine = p;
        //il controllo può essere fatto in diversi modi, come ad esempio aggiungendo una variabile booleana
        //che diventa false. IN LINEA TEORIA VANNO USATE LE ECCEZIONI MA NON SONO ANCORA STATE AFFRONTATE NEL CORSO
    }

    //Successivamente vanno creati i metodi get


    public String getTitolo() {
        return titolo;
    }
    public String getAutore() {
        return autore;
    }
    public int getPagine() {
        return pagine;
    }

}
