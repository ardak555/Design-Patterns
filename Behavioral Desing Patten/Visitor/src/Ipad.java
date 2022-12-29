public class Ipad implements Tablet {
public void accept(IVisitor visitor){
    visitor.accept(this);
}
}
