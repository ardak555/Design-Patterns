public class DikdorgenPrizmaAdaptor implements IAlan {

    DikdortgenPrizma dikdortgenPrizma;

    int derinlik = 3;

    @Override
    public int AlanHesapla(int keanr, int yukseklik) {
        dikdortgenPrizma = new DikdortgenPrizma();
        return dikdortgenPrizma.DikdorgenPrizmaAlanHesapla(keanr, yukseklik, derinlik) ;
    }


    
}
