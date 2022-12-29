import java.util.concurrent.locks.Lock;

public class MailBox {

    private static MailBox staticMailBox;
    private static Object  controlObject = new Object();
    
    
    public static String mailBoxKonum , mailContentKonum , baslikKonum;
    public static int mailBoxBoyut , mailContentBoyut , baslikBoyut;

    private MailBox(){}

    static MailBox showMailBox(String mailBoxKonum , String mailContentKonum , String baslikKonum , int mailBoxBoyut , int mailContentBoyut ,int baslikBoyut){
        mailBoxKonum = mailBoxKonum;
        mailContentKonum = mailContentKonum;
        baslikKonum = baslikKonum;

        mailBoxBoyut = mailBoxBoyut;
        mailContentBoyut = mailContentBoyut;
        baslikBoyut = baslikBoyut;
        
        return staticMailBox;

    }

    public static MailBox mailBox(){
        if(staticMailBox == null){
            synchronized(controlObject){
                if(staticMailBox == null){
                    staticMailBox = new MailBox();
                }
            }
        }
        return staticMailBox;
    }


    
}
