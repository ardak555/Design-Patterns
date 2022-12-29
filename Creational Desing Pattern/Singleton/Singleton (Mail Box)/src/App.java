public class App {
    public static void main(String[] args) throws Exception {
        
        
        MailBox mb1 = MailBox.showMailBox("Sol", "sag", "orta", 300, 600, 900);
        MailBox mb2 =  MailBox.showMailBox("Sol_ust", "sag_ust", "sağ_alt", 200, 300, 600);

        if(mb1 == mb2){
            System.out.println("Nesenler Aynıdır.");
            System.out.println( mb1.mailBoxKonum + mb1.mailContentKonum + mb1.baslikKonum);
        }else{
            System.out.println("Neseneler Farklıdır.");
        }
    }
}
