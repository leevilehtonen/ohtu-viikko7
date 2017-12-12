package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        IO io = new KonsoliIO();
        Pelitehdas pelitehdas = new Pelitehdas(io);

        while (true) {
            tulostaOhjeet();
            String komento = io.nextLine();
            if(!pelitehdas.onkoKomennollePelia(komento)) {
                break;
            }
            pelitehdas.hae(komento).pelaa();

        }

    }

    private static void tulostaOhjeet() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
}
