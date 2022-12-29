public class App {
    public static void main(String[] args) throws Exception {
        AbstractThem abstractThem = new DarkMode();
        AbstractUI abstractUI = new WinUI(abstractThem);
        abstractUI.darkMode();
        
        AbstractThem abstractThem2 = new LightMode();
        AbstractUI abstractUI2 = new LinuxUI(abstractThem2);
        abstractUI2.lightMode();
    }
}
