public class Es5Metodi {
    public static boolean primo (int n){
        for (int i = 2; i <= n-1; i++) {
            boolean nprimo = false;
            if (n % i != 0) {
            }nprimo = true;
            return nprimo;
        }
        return false;
    }

    public static void main(String[] args) {
        StdOut.print("Inserisci un numero: ");
        int num = StdIn.readInt();
        StdOut.println("Primo?  "+primo(num));
    }
}
