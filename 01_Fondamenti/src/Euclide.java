public class Euclide {
    public static void main(String[] args) {
        StdOut.print("Inserire il valore a:  ");
        int a = StdIn.readInt();
        StdOut.print("Inserire il valore b:   ");
        int b = StdIn.readInt();
        while (b > 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        StdOut.println("MCD (A,B) = "+a);
    }
}
