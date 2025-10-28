//esercizio 1 slide metodi
//calcolo MCD e mcm invocando i metodi
public class Es1MetodiMCDmcm {
    //calcolo del MCD usando l'algortimo di euclide
    public static int mcd (int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a; //quando b è zero si esce dal ciclo restituendo a come MCD
    }
    //calcolo del mcm utilizzando la formula euclide con MCD
    public static int mcm (int a, int b){
        return (a * b) / mcd (a,b); //usa la formula mcm = a*b/mcd (a,b) dove mcd invoca il metodo "mcd"
    }
    public static void main(String[] args) {
        StdOut.print("Inserisci il primo numero: ");
        int num1 = StdIn.readInt();
        StdOut.print("Inserisci il secondo numero: ");
        int num2 = StdIn.readInt();
        StdOut.println("L'MCD è : " +mcd(num1,num2));
        StdOut.println("l'mcm è : " +mcm(num1,num2));
    }

}