public class Es3Metodi {
    public static int round (double n) {
        int arr = (int) n;
        if (n > arr) {
            arr++;
        }return arr;
    }

    public static void main(String[] args) {
        StdOut.println("Inserisci un numero: ");
        double num = StdIn.readDouble();
        StdOut.print("Il numero arrotondato è: "+round(num));
    }
}
