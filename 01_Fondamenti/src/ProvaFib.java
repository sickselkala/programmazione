public class ProvaFib {
    public static void main(String[] args) {
        long[] fibonacci = new long[100];
        StdOut.println(fibonacci.length);
        fibonacci[0] = fibonacci[1] = 1;
        for (int i = 0, j = 1, k = 2; k < fibonacci.length; i++, j++, k++){
            fibonacci[k] = fibonacci[j] + fibonacci[i];
        }
        for (int i = 0; i<fibonacci.length; i++)StdOut.println(fibonacci[i]);
    }
}