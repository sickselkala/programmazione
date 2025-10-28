public class Laboratorio {
    public static void main(String[] args) {
        int [] a = new int [10000];
        for (int i = 0; i < 10000; i++) a[i] = i+1;
        StdOut.print("{ ");
        for (int i = 0; i<a.length; i++) StdOut.print(" "+a[i]);
        StdOut.print(" }");
        StdOut.println(" ");
        boolean [] p = new boolean[10000];
        for (int i = 0; i < 10000; i++) {
            int n = 2;
            if (a[i] % n == 0) p[i] = true;
        }
        StdOut.print("{ ");
        for (int i = 0; i<p.length; i++) StdOut.print(" "+p[i]);
        StdOut.print(" }");

    }
}
