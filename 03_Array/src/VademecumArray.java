public class VademecumArray {
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
    public static void stampa_array_invertito(int[] a){
        StdOut.print("L'array nell'ordine invertito è: ");
        StdOut.print("{ ");
        for (int i = a.length-1; i>=0; i--) StdOut.print(" "+a[i]);
        StdOut.println(" }");
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
    public static int menu (){
        StdOut.println("Scegli l'opzione: ");
        StdOut.println("1- Stampa array invertito ");
        StdOut.println("2- Stampa array ordinato ");
        StdOut.println("3- Stampa valore min dell'array");
        StdOut.println("4- Stampa valore max dell'array");
        StdOut.println("5- Concatena 2 array");

        int n = StdIn.readInt();
        int [] a = inserisci_array_a();
        int [] b = inserisci_array_b();
        if (n == 1) stampa_array_invertito(a);
        if (n == 2) ordina_array(a);
        if (n == 3) min_array(a);
        if (n == 4) max_array(a);
        if (n == 5) concatena(a,b);
        return n;
    }
    public static void main(String[] args) {
        int n = menu();
    }
}
