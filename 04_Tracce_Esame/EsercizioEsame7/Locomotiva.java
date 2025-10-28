package EsercizioEsame7;

public class Locomotiva extends Vagone{
    private int cavalli;

    public Locomotiva (int cavalli, int peso) throws Exception{
        super(peso);
        this.cavalli = cavalli;
        if (cavalli < 0){
            throw new IllegalArgumentException("I cavalli non possono essere minori di 0");
        }
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }

    public int getCavalli() {
        return cavalli;
    }
}
