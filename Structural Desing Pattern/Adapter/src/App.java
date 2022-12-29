public class App {
    public static void main(String[] args) throws Exception {
        
        IAlan alan = new Kare();
        IAlan alan2 = new Dikdortgen();
        Adapter alan3 = new Adapter();
        DikdorgenPrizmaAdaptor alan4 = new DikdorgenPrizmaAdaptor();
        System.out.println(alan.AlanHesapla(5,5)); 
        System.out.println(alan2.AlanHesapla(4,5)); 
        System.out.println(alan3.AlanHesapla(2,2)); 
        System.out.println(alan4.AlanHesapla(3, 5));
        
    }
}
