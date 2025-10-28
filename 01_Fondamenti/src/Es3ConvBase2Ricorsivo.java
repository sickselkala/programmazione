public class Es3ConvBase2Ricorsivo {
    public static void main(String[] args) {
        StdOut.println("INSERISCI UN NUMERO DECIMALE POSITIVO INTERO: ");
        int num = StdIn.readInt();
        StdOut.println("base 2: "+binario(num));
    }
    public static String binario (int n){
        if (n == 0) {
            return "";
        }
        return binario(n/2)+(n%2);
    }
}
