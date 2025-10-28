public class Es4Selezione {
    public static void main(String[] args) {
        StdOut.println("INSERIRE UN INTERO");
        int n = StdIn.readInt();
        String x = " ";
        if(0 <= n && n <= 255) {
            while (n > 0) {
                int d = n % 16;
                if (d < 10) x = (char) (d + '0') + x;
                else x = (char) (d - 10 + 'A') + x;
                n = n / 16;
            }
            StdOut.println(x);
        }else {StdOut.println("FUORISCALA");}
    }
}
