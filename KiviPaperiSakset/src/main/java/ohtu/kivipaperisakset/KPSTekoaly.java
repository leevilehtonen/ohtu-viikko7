package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Pelimuoto{

    private IO io;
    private Tekoaly tekoaly;


    public KPSTekoaly(Tuomari tuomari, IO io) {
        super(tuomari);
        this.io = io;
        this.tekoaly = new Tekoaly();
    }

    @Override
    public String haeEkaSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return io.nextLine();
    }

    @Override
    public String haeTokaSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}