//CONVERTIRE I MINUTI IN ORE
public class OreMinuti {
    public static void main(String[] args) {
        StdOut.print("Inserisci i minuti per convertirli in ore: ");
        int m = StdIn.readInt();
        boolean positivo = m > 0;
        if (positivo){
            int h = m / 60;
            int mt = m % 60;
            StdOut.println(m+ " minuti in ore è: " +h+"."+mt);
        }
    }
}
