import static java.util.Arrays.sort;

public class EsercizioMistiArray {
    public static void stampa_array(int[] a){
        StdOut.print("{ ");
        for (int i = 0; i<a.length; i++) StdOut.print(" "+a[i]);
        StdOut.println(" }");
        StdOut.println("Inserisci 0 per tornare al menu:");
        int c = StdIn.readInt();
        if (c==0) menu();
    }
    public static void stampa_array_invertito(int[] a){
        StdOut.print("L'array nell'ordine invertito è: ");
        StdOut.print("{ ");
        for (int i = a.length-1; i>=0; i--) StdOut.print(" "+a[i]);
        StdOut.println(" }");
    }
    public static int [] inserisci_array1(){
        StdOut.print("Inserisci la dimensione dell'array A: ");
        int l = StdIn.readInt();
        int [] a = new int[l];
        for (int i = 0; i<a.length; i++) {
            StdOut.print("Inserisci valore:");
            int j = StdIn.readInt();
            a[i] = a[i] + j;
        }
        return a;
    }
    public static int [] inserisci_array2(){
        StdOut.print("Inserisci la dimensione dell'array B: ");
        int l = StdIn.readInt();
        int [] b = new int[l];
        for (int i = 0; i< b.length; i++) {
            StdOut.print("Inserisci valore:");
            int j = StdIn.readInt();
            b[i] = b[i] + j;
        }
        return b;
    }
    public static int[] ordina_array(int []a){
        StdOut.print("L'array ordinato è: ");
        int [] a1 = a;
        for (int i = 0; i<a1.length-1; i++){
            for (int j = 0; j<a1.length-i-1; j++){
                if (a1[j]>a1[j+1]){
                    int temp = a1[j];
                    a1[j] = a1[j+1];
                    a1[j+1] = temp;
                }
            }
        }
        stampa_array(a1);//il costo di memoria di questo ordinamento è la somma da i a a.length
        return a1;
    }
    public static void min_array(int[] a) {
        ordina_array(a);
        if (a.length != 0) {
            int min = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] < min) min = a[i];
            }
            StdOut.println("L'elemento più piccolo nell'array è: " + min);
        }
    }
    public static void max_array(int[] a){
        ordina_array(a);
        if (a.length != 0){
            int max = a[a.length - 1];
            for (int i = 0; i < a.length; i++){
                if (a[i] > max) max = a[i];
            }
            StdOut.println("L'elemento più grande nell'array è: " + max);
        }
    }
    public static int menu (){
        StdOut.println("Scegli l'opzione: ");
        StdOut.println("1- Stampa array ");
        StdOut.println("2- Stampa array invertito ");
        StdOut.println("3- Stampa array ordinato ");
        StdOut.println("4- Stampa valore min dell'array");
        StdOut.println("5- Stampa valore max dell'array");

        int n = StdIn.readInt();
        int [] a = inserisci_array1();
        //int [] b = inserisci_array2();
        if (n == 1) stampa_array(a);
        if (n == 2) stampa_array_invertito(a);
        if (n == 3) ordina_array(a);
        if (n == 4) min_array(a);
        if (n == 5) max_array(a);
        return n;
    }
    public static void main(String[] args) {
        int n = menu();
    }
}
