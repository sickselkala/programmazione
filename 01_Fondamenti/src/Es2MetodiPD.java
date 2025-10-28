//Es2 slide metodi
//
public class Es2MetodiPD {
    public static String paridispari(int n) { //metodo per controllare se un numero è pari
        String a = "pari";
        String b = "dispari";
        int r = n % 2;
         if(r == 0) {
            boolean pari = true;
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
        StdOut.print("inserisci un numero: ");
        int num = StdIn.readInt();
        StdOut.println("il numero è : " +paridispari(num));
    }
}


