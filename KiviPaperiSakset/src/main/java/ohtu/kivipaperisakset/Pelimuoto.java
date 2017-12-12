package ohtu.kivipaperisakset;

public abstract class Pelimuoto {

    private Tuomari tuomari;

    public Pelimuoto(Tuomari tuomari) {
        this.tuomari = tuomari;
    }

    public final void pelaa() {
        String ekaSiirto, tokaSiirto;
        do {
            ekaSiirto = haeEkaSiirto();
            tokaSiirto = haeTokaSiirto();
            tuomari.kirjaaSiirto(ekaSiirto, tokaSiirto);
            System.out.println(tuomari);
            System.out.println();
        } while (tarkistaSiirrot(ekaSiirto, tokaSiirto));
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    public boolean tarkistaSiirrot(String ekaSiirto, String tokaSiirto) {
        return onkoOkSiirto(ekaSiirto) && onkoOkSiirto(tokaSiirto);
    }
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    public abstract String haeEkaSiirto();
    public abstract String haeTokaSiirto();

    public static Pelimuoto luoPelaajaVsPelaajaPeli(Tuomari tuomari, IO io){
        return new KPSPelaajaVsPelaaja(tuomari, io );
    }
    public static Pelimuoto luoPelaajaVsTekoalyPeli(Tuomari tuomari, IO io){
        return new KPSTekoaly(tuomari, io );
    }

    public static Pelimuoto luoPelaajaVsKehittynytTekoalyPeli(Tuomari tuomari, IO io){
        return new KPSParempiTekoaly(tuomari, io );
    }
}
