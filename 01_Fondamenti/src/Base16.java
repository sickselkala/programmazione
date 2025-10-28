public class Base16 {
    public static void main(String[] args) {
        StdOut.print("Inserire un numero intero");
        int n = StdIn.readInt();
        String x = "";
        while (n > 0) {
            int r = n % 16;
            if (r<10){
                x= r + x;
            }else {
                x = (r - 10 + 'A')+x; //qui avviene un widening in int per il char 'A'
            }
            n = n / 16;
        }
        StdOut.println(" in base 16 è  "+x);
    }
}
