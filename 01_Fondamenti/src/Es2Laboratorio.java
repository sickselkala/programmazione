//CONTROLLO DI UN TRIANGOLO
public class Es2Laboratorio {
    public static void main(String[] args) {
        StdOut.println("Inserisci 3 valori relativi ai lati di un triangolo: ");
        double a, b, c;
        StdOut.println("Primo: ");
        a = StdIn.readDouble();
        StdOut.println("Secondo: ");
        b = StdIn.readDouble();
        StdOut.println("Terzo: ");
        c = StdIn.readDouble();
        //inseriti 3 double verifico che corrispondano ai lati di un trinangolo
        boolean TuttiPositivi = a > 0 && b > 0 && c > 0;
        boolean aPiubMaggioreC = a + b > c;
        if (TuttiPositivi && aPiubMaggioreC){
            StdOut.println("E\' un triangolo");
        }else StdOut.println("non è un triangolo");
    }
}
