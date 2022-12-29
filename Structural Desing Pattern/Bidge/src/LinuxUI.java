public class LinuxUI extends AbstractUI {

  LinuxUI(AbstractThem abstractThem) {
    super(abstractThem);
  }

  @Override
  void darkMode() {
   System.out.println("Linux Dark Mode");
    
  }

  @Override
  void lightMode() {
    System.out.println("Linux Light Mode");
    
  }

  @Override
  void greyMode() {
    System.out.println("Linux Gray Mode");
    
  }


}