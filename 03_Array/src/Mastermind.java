public class Mastermind {

    public static void main(String[] args) {
        int n = scegliLunghezzaSequenza();
        int[] segreto = inserisciSequenza(n);
        int[] risultato = {0, 0};
        int tentativi = 0;
        while (risultato[0] < n) {
            StdOut.println("\n\nInserisci Sequenza (Tentativo "+(++tentativi)+").");
            int[] guess = inserisciSequenza(n);
            risultato = confronta(segreto, guess);
            StdOut.println("\n\nStrike: "+risultato[0]);
            StdOut.println("Ball: "+risultato[1]);
        }
        if (tentativi==1) {
            StdOut.println("\n\nSequenza indovinata al primo tentativo!");
        } else {
            StdOut.println("\n\nSequenza indovinata dopo "+tentativi+" tentativi!");
        }
    }

    public static int[] confronta(int[] segreto, int[] guess) {
        int[] risultato = {0, 0};
        risultato[0] = contaCorretti(segreto, guess);
        risultato[1] = contaPosizioneSbagliata(segreto, guess);
        return risultato;
    }

    private static int contaPosizioneSbagliata(int[] segreto, int[] guess) {
        boolean[] elementiUsati = new boolean[segreto.length];
        int c = 0;
        for (int i = 0; i < guess.length; i++) {
            boolean found = false;
            for(int j = 0; (j < segreto.length)&&!found; j++) {
                if (!elementiUsati[j]
                        &&(i!=j)
                        &&(guess[i] == segreto[j])
                        &&(guess[j] != segreto[j])) {
                    c++;
                    elementiUsati[j] = true;
                    found = true;
                }
            }
        }
        return c;
    }

    public static int contaCorretti(int[] segreto, int[] guess) {
        int c=0;
        for(int i=0; i<segreto.length; i++) {
            if(segreto[i] == guess[i]) {
                c++;
            }
        }
        return c;
    }

    public static int[] inserisciSequenza(int n) {
        int[] guess = new int[n];
        for(int i = 0; i < n; i++) {
            StdOut.print("Inserire l'elemento in posizione "+i+": ");
            guess[i] = StdIn.readInt();
        }
        return guess;
    }

    public static int scegliLunghezzaSequenza() {
        StdOut.print("Inserisci un valore intero (maggiore di 0): ");
        return StdIn.readInt();
    }


}
