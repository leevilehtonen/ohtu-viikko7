package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends  Pelimuoto{

    private IO io;
    private TekoalyParannettu tekoalyParannettu;

    public KPSParempiTekoaly(Tuomari tuomari, IO io) {
        super(tuomari);
        this.io = io;
        this.tekoalyParannettu = new TekoalyParannettu(20);
    }


    @Override
    public String haeEkaSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return io.nextLine();
    }

    @Override
    public String haeTokaSiirto() {
        String tokanSiirto = tekoalyParannettu.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}
