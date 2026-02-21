package raporty;

import dokumenty.Faktura;
import dokumenty.Pozycja;

public class DrukFakturyFormalnej extends DrukFaktury {
    public void drukujNaglowek(Faktura faktura) {
        System.out.println("Drukuj naglowek");
    }
    public void drukujPozycje(Pozycja pozycja) {
        pozycja.toString();
    }

    @Override
    protected void drukujStopke(Faktura faktura) {
        System.out.println("Drukuj stopke");
    }
}
