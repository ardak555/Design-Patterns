public class App {
    public static void main(String[] args) throws Exception {
        
        Facade facade = new Facade();
        facade.WatchMovie("Arda");
        System.out.println("---------");
        facade.EndMovie();
    }
}
