package ohtu.kivipaperisakset;

import java.util.HashMap;

public class Pelitehdas {
    private HashMap<String, Pelimuoto> pelimuodot;

    public Pelitehdas(IO io) {
        pelimuodot = new HashMap<String, Pelimuoto>();
        pelimuodot.put("a", Pelimuoto.luoPelaajaVsPelaajaPeli(new Tuomari(), io));
        pelimuodot.put("b", Pelimuoto.luoPelaajaVsTekoalyPeli(new Tuomari(), io));
        pelimuodot.put("c", Pelimuoto.luoPelaajaVsKehittynytTekoalyPeli(new Tuomari(), io));
    }


    public Pelimuoto hae(String koodi) {
        return pelimuodot.get(koodi);
    }

    public boolean onkoKomennollePelia(String koodi) {
        return pelimuodot.containsKey(koodi);
    }
}