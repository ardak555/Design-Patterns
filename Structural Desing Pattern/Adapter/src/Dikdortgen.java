public class Dikdortgen implements IAlan{

    public int a;
    public int b;

    @Override
    public int AlanHesapla(int keanr, int yukseklik) {
        a= keanr;
        b= yukseklik;
        return a*b;
    }
    
}
