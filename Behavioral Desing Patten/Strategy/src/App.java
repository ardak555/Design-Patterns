public class App {
    public static void main(String[] args) throws Exception {
        Tema1 tema1 = new Tema1();
        Tema2 tema2 = new Tema2();
        Telefon telefon = new Telefon();

        telefon.setTema(tema1);
        telefon.goster();
        telefon.setTema(tema2);
        telefon.goster();
        
}
}
