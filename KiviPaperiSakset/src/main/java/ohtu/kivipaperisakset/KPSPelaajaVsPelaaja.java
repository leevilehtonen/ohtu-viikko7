package ohtu.kivipaperisakset;


public class KPSPelaajaVsPelaaja extends Pelimuoto{

    private IO io;

    public KPSPelaajaVsPelaaja(Tuomari tuomari, IO io) {
        super(tuomari);
        this.io = io;
    }

    @Override
    public String haeEkaSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return io.nextLine();
    }

    @Override
    public String haeTokaSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        return io.nextLine();
    }
}