public class Password {
    public static void main(String[] args) {
        long psw = 9072002;
        long pswInserita;
        byte c = 5;
        boolean wrongPsw = true;
        for(int i = 5; i > 0; i--){
            StdOut.print("Inserisci una password: ");
            pswInserita = StdIn.readLong();
            if (psw == pswInserita){
                i=0;
                wrongPsw = false;
            }
        }
        if (wrongPsw) StdOut.print("Tentativi esauriti");
        else StdOut.print("Esatto");
    }
}
