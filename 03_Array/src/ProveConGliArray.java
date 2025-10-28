public class ProveConGliArray {
    public static double media_aritmetica (int [] a){
        double somma = 0;
        for (int i = 0; i < a.length; i++){
            somma = somma + a[i];
        }return somma / a.length;
    }
    public static void main(String[] args) {
        int[] b = {4, 6, 8, 9};
        StdOut.println("la lunghezza dell'array a è : " +b.length);
        for (int i = 0; i < b.length; i++) {
            StdOut.println("a{" + i + "] = " + b[i]);
        }
        StdOut.println("Incremento gli array di 1");
        for (int i = 0; i < b.length; i++){
            b[2] = b[i] + 5;
        }
        for (int i = 0; i < b.length; i++) {
            StdOut.println("a{" + i + "] = " + b[i]);
        }
        StdOut.println("Inserisci i valori di un array per calcolarne la media aritmetica: ");
        StdOut.println("La media aritmetica è "+media_aritmetica(b));
    }
}