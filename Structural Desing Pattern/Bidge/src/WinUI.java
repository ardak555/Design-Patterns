public class WinUI extends AbstractUI{


    WinUI(AbstractThem abstractThem) {
        super(abstractThem);
        
    }

    @Override
    void darkMode() {
        System.out.println("Windows Dark Mode");
        
    }

    @Override
    void lightMode() {
        System.out.println("Windows Light Mode");
        
    }

    @Override
    void greyMode() {
        System.out.println("Windows Grey Mode");
        
    }

    

 
    
}
