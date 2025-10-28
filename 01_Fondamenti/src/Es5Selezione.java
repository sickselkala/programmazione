//DETERMINA SE X E' UN QUADRATO PERFETTO
public class Es5Selezione {
    public static void main(String[] args) {
        StdOut.println("INSERISCI UN numero: ");
        int x = StdIn.readInt();
        int n = (int) Math.sqrt(x);
        if (x > 0){
            if ((n*n)==x){
                StdOut.println(x+" è un quadrato perfetto");
            }else StdOut.println( x+ " non è un quadrato perfetto");

            StdOut.println(x + " = " + n + "^2");
        }
    }
}
