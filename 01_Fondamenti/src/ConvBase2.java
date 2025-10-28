//CONVERTITORE NUMERO DECIMALE IN BASE 2
public class ConvBase2 {
    public static void main(String[] args) {
        StdOut.println("INSERISCI UN NUMERO DECIMALE POSITIVO INTERO: ");
        int n = StdIn.readInt();
        String x = "";
        do{
            int r = n % 2;
            x = (char) (r + '0') + x;
            //StdOut.println(r);
            n = n / 2;
        }while(n>0);
        StdOut.println("IN BASE DUE: " +x);
    }
}