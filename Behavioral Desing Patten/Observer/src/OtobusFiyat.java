import java.util.ArrayList;
import java.util.List;

public class OtobusFiyat {

     private List <Musteriler> musteriList = new ArrayList<>();
     private String message = "Unutmaaaa :)";
     private double price = 20;
     private double pprice = 30;
     
     

    public void add(Musteriler musteriler){

        musteriList.add(musteriler);

    }

    public void remove(Musteriler musteriler){
        musteriList.remove(musteriler);
    }

    public void check(double new_price){
        if(price<pprice){
            System.out.println("Zam geldi");
            notifyMe();
        }else{
            System.out.println("indirim geldi");
        }
        
    }

    public void notifyMe(){
        for (Musteriler musteriler : musteriList) {
            musteriler.update();
        }

    }
    
   
}
