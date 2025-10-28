public class Fattoriale {
    public static void main(String[] args) {
        StdOut.println("Inserire un valore intero: ");
        int n = StdIn.readInt();
        int r = 1;
        int i = 1;
        while (i <= n) {
            StdOut.println("N = " + n);
            r = r * i;
            i = i + 1;
        }
        StdOut.println(n+"! = "+r);
    }
}
