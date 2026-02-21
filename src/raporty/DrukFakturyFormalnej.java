package raporty;

import dokumenty.Faktura;
import dokumenty.Pozycja;

public class DrukFakturyFormalnej extends DrukFaktury {
    @Override
    public void drukujNaglowek(Faktura faktura) {
        System.out.println("--- FAKTURA FORMALNA ---");
        System.out.println("Kontrahent: " + faktura.getKontrahent());
        System.out.println("Data: " + faktura.getDataSprzedazy().toString());
        System.out.println("------------------------");
    }
    public void drukujPozycje(Pozycja pozycja) {
        System.out.println(pozycja.toString());
    }

    @Override
    protected void drukujStopke(Faktura faktura) {
        System.out.println("------------------------");
        System.out.println("Suma do zapłaty: " + faktura.getSuma());
    }
}
