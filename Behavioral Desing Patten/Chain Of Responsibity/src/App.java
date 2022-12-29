public class App {
    public static void main(String[] args) throws Exception {
        IGoreuntuKaynagi vga = new VGA();
        IGoreuntuKaynagi dvi = new DVI();
        IGoreuntuKaynagi hdmi = new HDMI();

        vga.SonrakiGoruntuKaynagi = dvi;
        dvi.SonrakiGoruntuKaynagi=hdmi;

        vga.paly("video.DVI");
        vga.paly("a.VGA");
        vga.paly("b.HDMI");
        vga.paly("fjdfhk.sgfjshg");
    }
}
