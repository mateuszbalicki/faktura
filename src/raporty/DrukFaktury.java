package raporty;

import dokumenty.Faktura;
import dokumenty.Pozycja;

import java.util.Iterator;

public abstract class DrukFaktury {
    protected abstract void drukujNaglowek(Faktura faktura);
    protected abstract void drukujPozycje(Pozycja pozycja);
    protected abstract void drukujStopke(Faktura faktura);

    public final void drukuj(Faktura faktura) {
        drukujNaglowek(faktura);

        Iterator<Pozycja> iterator = faktura.getIteratorPozycji();
        while(iterator.hasNext()) {
            drukujPozycje(iterator.next());
        }

        drukujStopke(faktura);
    }
}
