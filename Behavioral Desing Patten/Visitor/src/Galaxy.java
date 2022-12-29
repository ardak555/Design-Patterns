public class Galaxy implements Tablet {
    public void accept(IVisitor iVisitor){
        iVisitor.accept(this);
    }
}
