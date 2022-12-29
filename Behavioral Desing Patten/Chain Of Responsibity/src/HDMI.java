public class HDMI extends IGoreuntuKaynagi{

    @Override
    public void paly(String fielPath) {
        if(fielPath.endsWith(".HDMI")){
            System.out.println("HDMI file is playing..."+fielPath);
        }else{
            if(_sonrakiGoruntuKaynagi != null){
                _sonrakiGoruntuKaynagi.paly(fielPath);
            }
        }
        
        
    }


    
}
