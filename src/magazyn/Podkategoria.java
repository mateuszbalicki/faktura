package magazyn;

import java.util.ArrayList;

public class Podkategoria implements KomponentKategorii {
    private String nazwa;
    private ArrayList<KomponentKategorii> dzieci = new ArrayList<>();

    public Podkategoria(String nazwa) { this.nazwa = nazwa; }

    public void dodaj(KomponentKategorii k) {
        dzieci.add(k);
    }

    @Override
    public void wypisz() {
        System.out.println("[Podkategoria] " + nazwa);
        for (KomponentKategorii k : dzieci) {
            k.wypisz();
        }
    }
}
