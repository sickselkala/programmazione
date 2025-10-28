public class Es6Metodi {
    public static boolean primo (int n){
        for (int i = 2; i <= n-1; i++) {
            if (n % i != 0) {
            }StdOut.print(n);
        }
        return false;
    }
    public static int stampa_primi (int n){
        for (int i = 1; i <=n; i++){
            StdOut.print(primo(n));
        }
        return n;
    }

    public static void main(String[] args) {
        StdOut.print("Inserisci un numero per stampare tutti i numeri primi compresi tra 1 e il numero: ");
        int num = StdIn.readInt();
        StdOut.print(stampa_primi(num));
    }
}
