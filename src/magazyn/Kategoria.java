package magazyn;

import java.util.ArrayList;

public class Kategoria implements KomponentKategorii {
    private String nazwa;
    private ArrayList<Towar> towary = new ArrayList<>();

    public Kategoria(String nazwa) { this.nazwa = nazwa; }

    public void dodajTowar(Towar t) { towary.add(t); }

    @Override
    public void wypisz() {
        System.out.println(" - Kategoria: " + nazwa);
        for (Towar t : towary) {
            System.out.println("   * Towar: " + t.getNazwa() + " (Cena: " + t.getCena() + ")");
        }
    }
}
