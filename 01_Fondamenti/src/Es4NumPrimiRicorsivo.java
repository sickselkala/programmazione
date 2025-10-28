//CONTROLLO SE UN NUMERO N E' PRIMO
public class Es4NumPrimiRicorsivo {
    public static void main(String[] args) {
        StdOut.println("INSERISCI UN NUMERO");
        int num = StdIn.readInt();
        if (num <= 1) {
            StdOut.print("non è primo");
        } else if (primo(num)) {
            StdOut.print("è primo");
        } else {
            StdOut.print("non è primo");
        }
    }
    public static boolean primo (int n) {
        return primoAus(n, 2);
    }
    public static boolean primoAus (int n, int k){
        if (k * k > n){
            return true;
        }
        if (n % k == 0){
            return false;
        }
        return primoAus(n, k+1);
    }


}