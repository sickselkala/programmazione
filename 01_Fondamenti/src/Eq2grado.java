//ALGORITMO EQUAZIONI DI 2 GRADO
public class Eq2grado {
    public static void main(String[] args) {
        StdOut.println("Inserisci i valori delle 3 costanti a,b e c");
        StdOut.println("a: ");
        int a = StdIn.readInt();
        StdOut.println("b: ");
        int b = StdIn.readInt();
        StdOut.println("c: ");
        int c = StdIn.readInt();
        double delta = (b*b)-(4*a*c);
        if (delta == 0){
                    double r = (-b)/(2*a);
                    StdOut.println("il risultato è: " +r);
                }else StdOut.println("nessuna soluzione reale");
        if (delta > 0) {
            double r2 = (-b - Math.sqrt(delta) / (2 * a));
            StdOut.println("Il risultato è " + r2);
        }
    }
}
