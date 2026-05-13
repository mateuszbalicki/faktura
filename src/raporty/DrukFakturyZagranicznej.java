package raporty;

import dokumenty.Faktura;
import dokumenty.Pozycja;

public class DrukFakturyZagranicznej extends DrukFaktury {

    @Override
    public void drukujNaglowek(Faktura faktura) {
        System.out.println("--- Formal Invoice ---");
        System.out.println("Customer: " + faktura.getKontrahent());
        System.out.println("Date: " + faktura.getDataSprzedazy().toString());
        System.out.println("------------------------");
    }
    public void drukujPozycje(Pozycja pozycja) {
        System.out.println(pozycja.toString());
    }

    @Override
    protected void drukujStopke(Faktura faktura) {
        System.out.println("------------------------");
        System.out.println("Liczba pozycji: " + faktura.getLiczbaPozycji());
        System.out.println("Total Amount: " + faktura.getSuma());
    }
}
