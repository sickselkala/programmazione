//Scrivere un programma che accetti numeri
// positivi fino a impostare il numero 0
//Quindi calcola la media dei numeri inseriti e la stampa
public class Media {
    public static void main(String[] args) {
        int somma = 0;
        int n = 0;
        int v = 0;
        do{
            StdOut.print("Inserire il prossimo numero (0 per uscire):  ");
            v = StdIn.readInt();
            somma += v;
            if (v > 0){
                n++;
            }
        }while (v != 0);
        StdOut.println("Inseriti "+n+" valori con media: "+((float) somma/n));
    }
}