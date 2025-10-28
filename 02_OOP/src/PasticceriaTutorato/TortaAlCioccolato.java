package PasticceriaTutorato;

public class TortaAlCioccolato extends Torta{
    private int percentualeVendibile;

    public TortaAlCioccolato(String nome, int prezzo, int quantitaMassima){
        super(nome, prezzo, quantitaMassima);
        this.percentualeVendibile = 20;
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
