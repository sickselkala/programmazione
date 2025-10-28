public class risultato{
public static void printSquare(int n) {
    Math.abs(n);
    char [][] q = new char [n][n];
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j ++){
            q[i][j] = '*';
            System.out.print(q[i][j]);
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
     //   printSquare(5);

        String nome;
        String cognome;

        nome = "Mario";
        cognome = "Rossi";
        String saluto = "Benvenuto " + nome + " "+ cognome;
        System.out.println(saluto);
        int[] x = new int[] {5, 4, 3, 2, 1};
        int z = x[x[1]];
        System.out.println(z);
    }
}