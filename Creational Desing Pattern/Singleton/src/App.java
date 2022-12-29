public class App {
    public static void main(String[] args) throws Exception {
        
        Singleton st1 =  new Singleton();
        Singleton st2 =  new Singleton();

        if(st1==st2){
            System.out.println("Nesneler Aynıdır.");
        }else{
            System.out.println("Nesneler Farklıdır.");
        }

        
    }
}
