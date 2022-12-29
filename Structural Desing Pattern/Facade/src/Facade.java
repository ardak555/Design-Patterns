public class Facade {

    Popper poper = new Popper();
    Lights light = new Lights();
    Screen screen = new Screen();
    Ampfi amp = new Ampfi();
    Projector projector = new Projector();
    Dvdplayer dvd = new Dvdplayer();




    public void WatchMovie(String movie){
        System.out.println(movie + "Film başlatılıyor....");
        poper.On();
        poper.Pop();
        light.Dim(10);
        screen.Down();
        projector.On();
        projector.Wide("16:9");
        amp.On();
        amp.Dvd("movie");
        amp.volume(10);
        dvd.On();
        dvd.Play();
    }

    public void EndMovie(){
        System.out.println("Fil Bitti...");
        poper.Close();
        light.Dim(50);
        screen.Up();
        projector.Wide("Kapalı");
        projector.Close();
        amp.volume(0);
        amp.Close();
        dvd.Close();
    }
}
