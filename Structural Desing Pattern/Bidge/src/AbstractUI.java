public abstract class AbstractUI {
    protected AbstractThem abstractThem;
    abstract void darkMode();
    abstract void lightMode();
    abstract void greyMode();

    AbstractUI(AbstractThem abstractThem){
        super();
        this.abstractThem =abstractThem;

    }
    
}
