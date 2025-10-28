public class PiGreco {
    public static void main(String[] args) {
        StdOut.println( PiGreco( 1000000));
        StdOut.println(Math.PI);
    }
    public static double PiGreco(int n){
        double somma = 0.0;
                for (int i = 0; i <= n; i ++){
                    //if (i % 2 == 0) somma += 1.0/(2*n+1); else somma -= 1.0/(2*n+1);
                }
                return somma * 4;
    }
}
