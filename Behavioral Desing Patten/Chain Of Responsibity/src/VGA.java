public class VGA extends IGoreuntuKaynagi {


    @Override
    public void paly(String fielPath) {
        if(fielPath.endsWith(".VGA")){
            System.out.println("VGA file is playing..."+fielPath);
        }else{
            if(_sonrakiGoruntuKaynagi != null){
                _sonrakiGoruntuKaynagi.paly(fielPath);
            }
        }
        
    }
    
}
