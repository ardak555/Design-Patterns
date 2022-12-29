public class Wifi implements IVisitor {
    
    public void baglan(){
        System.out.println("Wifi baglandı.");
    }

    @Override
    public void accept(Tablet tablet) {
        baglan();
        
    }


}
