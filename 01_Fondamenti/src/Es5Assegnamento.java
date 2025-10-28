//legge una sequenza di tre numeri interi (memorizzati in tre variabili
//distinte) e conta il numero di inversioni della sequenza, ovvero quante volte un numero letto
//prima è più grande di un numero letto dopo.
public class Es5Assegnamento {
    public static void main(String[] args) {
        StdOut.println("Inserisci una sequenza di 3 numeri interi");
        StdOut.println("A: ");
        int a = (char) StdIn.readInt();
        StdOut.println("B: ");
        int b = (char) StdIn.readInt();
        StdOut.println("C: ");
        int c = (char) StdIn.readInt();
        String x = a +" " + b + " " + c + " ";
        StdOut.println("Sequenza inserita: " +x);
        if (a > b) {
            int r1 = a - b;
            StdOut.println("la differenza tra a e b è: " + r1);
        }else StdOut.println("A non è più grande di B");
        if (b > c){
            int r2 = b-c;
            StdOut.println("La differenza tra b e c è: "+r2);
        } else {
            StdOut.println("B non è più grande di C");
        }
    }
}
