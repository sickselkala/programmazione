package PasticceriaTutorato;

public class TortaAllaCrema extends Torta{
    private int percentualeVendibile;

    public TortaAllaCrema(String nome, int prezzo, int quantitaMassima){
        super(nome, prezzo, quantitaMassima);
        this.percentualeVendibile = 30;
    }

    @Override
    public int vendita() {
        if(super.getQuantitaRestante() > 0){
            int quantitaVendibile = (super.getQuantitaRestante() * percentualeVendibile) / 100;
            super.setQuantitaRestante(super.getQuantitaRestante() - quantitaVendibile);
            return quantitaVendibile;
        }
        return super.vendita();
    }
}
