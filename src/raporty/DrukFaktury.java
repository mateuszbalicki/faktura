package raporty;

import dokumenty.Faktura;
import dokumenty.Pozycja;

public abstract class DrukFaktury {
    protected abstract void drukujNaglowek(Faktura faktura);
    protected abstract void drukujPozycje(Pozycja pozycja);
    protected abstract void drukujStopke(Faktura faktura);


}
