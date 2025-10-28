public class Es3ConvBase16Ricorsivo {
    public static void main(String[] args) {
        StdOut.println("INSERISCI NUMERO DA CONVERTIRE: ");
        int n = StdIn.readInt();
        StdOut.println(hex(n));
    }
    public static String hex (int num){
        if (num == 0){
            return "";
        }
        int r = num % 16;
        char hexD;
        if (r < 10){
            hexD = (char) (r + '0') ;
        }
        else{
            hexD = (char) (r - 10 + 'A');
        }
        return hex(num / 16)+hexD;
    }
}
