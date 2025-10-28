import java.util.Scanner;

public class prova {
    private final int x;
    private final int y;
    public prova(){
        this(5,5);
    }
    public prova(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    boolean checkPrime (int nb){
        for (int i = 2; i < nb - 1; i++){
            if (nb % i == 0){
                return false;
            }
        }
        return true;
    }
    void stampaPariNonMultipliDiTre (int n){

    }
    long fibonacci (int n){
        long [] fibonacci = new long [n];
        fibonacci[0] = fibonacci[1] = 1;
        for (int i = 2; i < n; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[n-1];
    }
    void voto (int v){
        String risultato = (v >= 18)
                ? ((v <= 30) ? "Superato" : "Superato con lode")
                : ((v <18)? "Non superato" : "Superato");
    }
    boolean inverti (boolean check){
        boolean risultato = !check;
        return risultato;
    }
    public static int countTriples(int[] nums){
        int c = 0;
        for (int i = 0; i < (nums.length -2); i++){
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                c++;
            }
        }
        return c;
    }
    public static String alternaCase (String s){
        String risultato = "";
        String [] d = s.split(" ");
        for (int i = 0; i < d.length ; i++){
            if (i % 2 == 0){
                risultato += d[i].toUpperCase();
            } else {
                risultato += d[i].toLowerCase();
            }
            if (i < d.length - 1){
                risultato += " ";
            }
        }
        return risultato;
    }
    public static boolean areOpposite(String w1, String w2){
        for(int i = 0; i < w1.length(); i++){
            if(w1.charAt(i) == w2.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void stampaNumeri (int numero) {
        int i = 0;
        do{
            System.out.println(Math.abs(i));
            i++;
            numero--;
        }while(numero >= 0);
    }
    public static int contaCaratteri(String s){
        int c = 0;
        for (int i = 0; i < s.length(); i++){
            c++;
        }
        return c;
    }

    public static int moltiplica4VolteSenzaOperatoreConShift(int num){
        int risultato = num;
        risultato = risultato << 4;
        return risultato;
    }
    public static void isPari(int numero){
        boolean pari = (numero % 2 == 0);
        if(pari) System.out.println(pari);
        else System.out.println(pari);
    }
    public static boolean verificaIngredienti (String ricetta, String ingredienti){
        String [] r = ricetta.split(",\\s*");
        String [] i = ingredienti.split(",\\s*");
        boolean trovato = false;
        for (int j = 0; j < r.length; j++){
            for (int k = 0; k < i.length; k++){
                if (r[j].equalsIgnoreCase(i[k])){
                    trovato = true;
                }
            }
        }
        return trovato;
    }


    public void prova(){
        int x = 9;
        int y= 7;
        if((y<10) | (++x>10)){
            x--;
        }// risultato =
    }
    public static void main(String[] args) {
        int x = 5;
        int z = (--x)+(x++);
        System.out.println(z);
    }

}