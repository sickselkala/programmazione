public class ConvCelsius {
    public static void main(String[] args) {
        StdOut.print("Inserisci un valore reale relativo a gradi celsius: ");
        double celsius = StdIn.readDouble();
        double formula= (celsius * (9.0/5) + 32);
        StdOut.println("Il valore in farenheit è: " + formula);
    }
}
