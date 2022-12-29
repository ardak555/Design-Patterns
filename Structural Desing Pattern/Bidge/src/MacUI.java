public class MacUI extends AbstractUI{

    MacUI(AbstractThem abstractThem) {
        super(abstractThem);
    }

    @Override
    void darkMode() {
        System.out.println("Mac Dark");
        
    }

    @Override
    void lightMode() {
        System.out.println("Mac Light");
    
        
    }

    @Override
    void greyMode() {
        System.out.println("Mac Gray");
        
    }


    
}
