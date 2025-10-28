package ProvaEsameCulmone;

public class Insieme {
    private int [] a;
    private int numero;

    public Insieme (int n){
        if(n < 0){
            throw new RuntimeException("La grandezza dell'array non può essere negativa!");
        }
        this.a = new int[n];
        this.numero = 0;
    }

    public int dimensione(){
        return a.length;
    }

    public boolean aggiungi (int x){
        for(int i = 0; i < a.length; i++ ){
            if(a[i] == 0|| a[i] != x){
                a[i] = x;
                numero++;
                return true;
            }
        }
        return false;
    }

    public boolean contiene (int x){
        for (int i = 0; i < numero; i++){
            if(a[i] == x){
                return true;
            }
        }
        return false;
    }

    public boolean inclusoIn (Insieme that){
        for (int i = 0; i < this.numero; i++){
            if(that.contiene(this.a[i])){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    public boolean ugualeA(Insieme that){
        return this.inclusoIn(that) && that.inclusoIn(this);
    }

    public Insieme unione(Insieme that){
        Insieme u = new Insieme(this.dimensione() + that.dimensione());
        for (int i = 0; i < this.numero; i++){
            u.aggiungi(this.a[i]);
        }
        for (int i = 0; i < that.numero; i++){
            u.aggiungi(that.a[i]);
        }
        return u;
    }
}
