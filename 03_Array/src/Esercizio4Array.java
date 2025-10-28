public class Esercizio4Array {
    public static int [] inserisci_array_a(){
        StdOut.print("Inserisci la dimensione dell'array A: ");
        int l = StdIn.readInt();
        int [] a = new int[l];
        for (int i = 0; i<a.length; i++) {
            StdOut.print("Inserisci valore:");
            int j = StdIn.readInt();
            a[i] = a[i] + j;
            //stampa_array(a);
        }
        return a;
    }
    public static int [] inserisci_array_b(){
        StdOut.print("Inserisci la dimensione dell'array B: ");
        int l = StdIn.readInt();
        int [] b = new int[l];
        for (int i = 0; i< b.length; i++) {
            StdOut.print("Inserisci valore:");
            int j = StdIn.readInt();
            b[i] = b[i] + j;
            //stampa_array(b);
        }
        return b;
    }
    public static void stampa_array(int[] a) {
        StdOut.print("{ ");
        for (int i = 0; i < a.length; i++) StdOut.print(" " + a[i]);
        StdOut.println(" }");
        //int c = StdIn.readInt();
        //if (c==0) menu();
    }
    public static void ordina_array(int []a){
        StdOut.print("L'array ordinato è: ");
        for (int i = 0; i<a.length-1; i++){
            for (int j = 0; j<a.length-1-i; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        stampa_array(a);//il costo di memoria di questo ordinamento è la somma da i a a.length
    }
    public static int [] concatena(int [] a, int [] b){
        int k = 0;
        int [] c = new int[a.length + b.length];
        for (int i = 0; i<a.length;i++) {
            c[k] = a[i];
            k++;
        }
        for (int j = 0; j<a.length;j++){
            c[k] = b[j];
            k++;
        }
        StdOut.print("C: ");
        stampa_array(c);
        ordina_array(c);
        return c;
    }

    public static void main(String[] args) {
        int [] a = inserisci_array_a();
        StdOut.print("A: "); stampa_array(a);
        int [] b = inserisci_array_b();
        StdOut.print("B: "); stampa_array(b);
        concatena(a,b);
    }
}
