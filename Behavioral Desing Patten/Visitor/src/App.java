public class App {
    public static void main(String[] args) throws Exception {
       Wifi wifi = new Wifi();
       FiveG fiveG = new FiveG();
       Galaxy galaxy = new Galaxy();
       Ipad ipad = new Ipad();
       galaxy.accept(wifi);
       galaxy.accept(fiveG);
       
       ipad.accept(wifi);
       
    }
}
