public class Factory implements IDosya {
    
    IDosya dosyam ;
    
    
    public IDosya Factory(String dosya){
        if( dosya == "pdf"){
            dosyam =new Pdf();
        }
        else if( dosya == "word"){
            dosyam =new MSWord();
        }
        else if( dosya == "excel"){
            dosyam =new MSExcel();
        }
        return dosyam;
    }


    @Override
    public void setle() {
        // TODO Auto-generated method stub
        
    }
}
