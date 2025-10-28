/*realizzare un array di 100 posizioni che contiene la somma dei due precedenti numeri*/
public class Fibonacci {
    public static void main(String[] args) {
        long [] a = new long [100];
        a[0] = a[1] = 1;
        for (int i = 2; i<100; i++){
            a[i] = a[i-1 ]+a[i-2];
            StdOut.println("a[" + i+ "] "+a[i]);
        }
    }
}
