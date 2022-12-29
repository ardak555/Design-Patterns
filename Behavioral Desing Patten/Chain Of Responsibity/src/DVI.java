public class DVI extends IGoreuntuKaynagi {

    @Override
    public void paly(String fielPath) {
        if(fielPath.endsWith(".DVI")){
            System.out.println("DVI file is playing..."+fielPath);
        }else{
            if(_sonrakiGoruntuKaynagi != null){
                _sonrakiGoruntuKaynagi.paly(fielPath);
            }
        }
        
        
    }

    
}
