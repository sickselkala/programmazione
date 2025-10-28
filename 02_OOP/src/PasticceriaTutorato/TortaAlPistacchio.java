package PasticceriaTutorato;

public class TortaAlPistacchio extends Torta{
    private int percentualeVendibile;

    public TortaAlPistacchio(String nome, int prezzo, int quantitaMassima){
        super(nome, prezzo, quantitaMassima);
        this.percentualeVendibile = 25;
    }

    @Override
    public int vendita() {
        if(super.getQuantitaRestante() > 0){
            int quantitaVendibile = (super.getQuantitaRestante() * percentualeVendibile) / 100;
            super.setQuantitaRestante(super.getQuantitaRestante() - quantitaVendibile);
            return getQuantitaRestante();
        }
        return super.vendita();
    }
}
