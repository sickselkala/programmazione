public class Main {
    public static int fibonacci(int k) {
        return k == 0 ? 0 : k == 1 ? 1 : fibonacci(k - 1) + fibonacci(k - 2);
    }

    public static void main(String[] args) {
        StdOut.print("Inserisci un numero per calcolare la sua sequenza di fibonacci: ");
        int num = StdIn.readInt();
        StdOut.print(Main.fibonacci(num));
    }
}