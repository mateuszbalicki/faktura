package raporty;

import dokumenty.Faktura;
import main.Konfiguracja;

public class WydrukFaktury {

    public static void wypiszFakture(Faktura faktura) {
        DrukFaktury szablon = Konfiguracja.getInstance().getSzablonWydruku();
        szablon.drukuj(faktura);
    }
}
