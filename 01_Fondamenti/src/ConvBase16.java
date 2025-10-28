public class ConvBase16 {
    public static void main(String[] args) {
        StdOut.println("INSERISCI NUMERO DA CONVERTIRE: ");
        int n = StdIn.readInt();
        String x = "";
        do {
            int d = n % 16;
            if (d < 10) x = (char) (d + '0') + x;
            else x = (char) (d - 10 + 'A' ) + x;
            n = n / 16;
        } while (n > 0);
        StdOut.println(x);
    }
}
