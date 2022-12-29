public class FiveG  implements IVisitor{

    public void ara(){
        System.out.println("5G aranıyor.");
    }

    @Override
    public void accept(Tablet tablet) {
        ara();
        
    }

}
