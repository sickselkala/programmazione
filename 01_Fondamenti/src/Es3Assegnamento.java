//DATO 0<=X<=64 DETERMINA IL NUMERO DI BIT CHE OCCORRONO PER RAPPRESENTARE X
public class Es3Assegnamento {
    public static void main(String[] args) {
        StdOut.println("INSERIRE UN INTERO");
        int n = StdIn.readInt();
        int n1 = n;
        String x = " ";
        if(0 <= n && n <= 64) {
            do{
                int r = n % 2;
                x = (char) (r + '0') + x;
                //StdOut.println(r);
                n = n / 2;
            }while(n>0);
            StdOut.println(n1 + "in bit: " +x);
            StdOut.println("");
            int b = x.length() -1 ;
            StdOut.println("Il numero di bit che occorrono per rappresentare " +n1+ " è " +b);
        }else StdOut.println("FUORI SCALA");
    }
}
