public class Es4Assegnazione {
    //DATO 0<=X<=64 DETERMINA IL NUMERO DI BIT A 1 CHE OCCORRONO PER RAPPRESENTARE X
        public static void main(String[] args) {
            StdOut.println("INSERIRE UN INTERO");
            int n = StdIn.readInt();
            int n1 = n;
            String x0 = " ";
            String x1= " ";
            if(0 <= n && n <= 64) {
                do{
                    int r = n % 2;
                    if (r == 1) {
                        x1 = (char) (r + '0') + x1;
                        //StdOut.println(r);
                        n = n / 2;
                    }else{
                        x0 = (char) (r + '0') + x0;
                        //StdOut.println(r);
                        n = n / 2;
                    }
                }while(n>0);
                StdOut.println("");
                int b = x1.length() -1 ;
                StdOut.println("Il numero di bit A 1 che occorrono per rappresentare " +n1+ " è " +b);
            }else StdOut.println("FUORI SCALA");
        }
    }
