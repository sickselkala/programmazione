public class PotenzaIterazione {
    static double potenza (double b, int n1){
      double risultato = 1;
        while (n1 != 0){
          risultato = risultato * b;
          n1--;
          }
      return risultato;
    }
    public static void main(String[] args) {
        StdOut.print("Inserisci il valore per la base: ");
        double v = StdIn.readDouble();
        StdOut.print("Inserisci il valore per l'esponente: ");
        int num = StdIn.readInt();
        StdOut.print("Risultato: "+potenza(v, num));
    }
}
