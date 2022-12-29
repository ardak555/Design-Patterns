public class Adapter implements IAlan {

    public Daire daire;
   


    @Override
    public int AlanHesapla(int x, int r){
        daire = new Daire();
        return daire.dairealanhesapla(x);
        
    }
    
}
