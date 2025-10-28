public class Es4Metodi {
    public static String hex (int x){
        String h = "";
        do {
            int d = x % 16;
            if (d < 10) h = (char) (d + '0') + h;
            else h = (char) (d - 10 + 'A' ) + h;
            x = x / 16;
        } while (x > 0);
        return h;
    }
    public static void main(String[] args) {
        StdOut.println("Inserisci un numero da convertire: ");
        int num = StdIn.readInt();
        StdOut.print("il numero in base 16 è: " +hex(num));
    }
}
