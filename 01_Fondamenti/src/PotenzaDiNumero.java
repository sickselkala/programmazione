/*realizzare un metodo potenza con argomenti a di tipo double ed _n_ di
tipo int e valore di ritorno di tipo double che calcoli an.
Qual è il “costo” (in termini di moltiplicazioni) per calcolare an
usando questo metodo? È possibile fare meglio modificando il metodo?
 */
public class PotenzaDiNumero {

    static double potenza (double a, int n){
        if (n == 0){
            return 1;//se viene chiesta la potenza di
        }else return a * potenza(a, n-1);
    }

    public static void main(String[] args) {
        StdOut.print("Inserisci il valore per la base: ");
        double v = StdIn.readDouble();
        StdOut.print("Inserisci il valore per l'esponente: ");
        int num = StdIn.readInt();
        StdOut.print("Risultato: "+potenza(v, num));
    }
}



//Essendo un metodo ricorsivo, il suo costo è uguale a n in termini di operazioni che vengono conservate in memoria
//quindi aggiungendo frame per ogni ricorsione.