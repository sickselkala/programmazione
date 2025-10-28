/*Scrivere un proogramma o una funzione che somma tutti i numeri interi positivi minori di n
che sono divisibili per 3 o per 7 */
public class SommaNumeri {
   public static int somma (int n){
       int a = 0;
       if (n > 0) for (int i = 0; i <= n; i++) {
           if (i % 3 == 0 || i % 7 == 0) {
               a = a + i;
           }
       }
       return a;
   }

    public static void main(String[] args) {
       StdOut.print("Inserisci un numero intero positivo; ");
       int num = StdIn.readInt();
        StdOut.println("il numero intero è "+somma(num));

    }
}
/*
public class SommaNumeri {
    public static void main(String[] args) {
        StdOut.print("Inserisci un numero intero positivo: ");
        int num = StdIn.readInt();
        int a = 0;
        for (int i = 0; i <= num; i++){
            if (i % 3 == 0 || i % 7 == 0){
                a = a + i;
            }
        }
        StdOut.println(a);
    }
}

 */