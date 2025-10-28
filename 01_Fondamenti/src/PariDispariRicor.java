public class PariDispariRicor {
    public static void main(String[] args) {
        StdOut.println(pari(-10));
        StdOut.println(dispari(11));
    }
    public static boolean pari (int n){
        if (n<0) return false; else if (n == 0) return true; else return dispari (n-1);
    }
    public static boolean dispari (int n){
        if (n<0) return false; else if (n == 0) return true; else return pari (n-1);
    }
    public static int dec(int n) { return n-1; }
}
