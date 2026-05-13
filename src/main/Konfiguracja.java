package main;

import rabaty.AdapterKlasowyLosowegoRabatu;
import rabaty.ObliczCenePoRabacie;
import rabaty.ObliczCenePoRabacieKwotowym;
import rabaty.ObliczCenePoRabacieProcentowym;
import raporty.DrukFaktury;
import raporty.DrukFakturyFormalnej;

public class Konfiguracja {
    private static Konfiguracja instance;

    private Konfiguracja() {}

    public static Konfiguracja getInstance() {
        if(instance==null) {
            instance=new Konfiguracja();
        }
        return instance;
    }

    public double getKwotaRabatu() { return 9.0; }

    public double getProcentRabatu() { return 25.0; }

    public ObliczCenePoRabacie getBiezacyRabat() {
        return new AdapterKlasowyLosowegoRabatu();
        // return new ObliczCenePoRabacieProcentowym();
    }

    public DrukFaktury getSzablonWydruku() {
        return new DrukFakturyFormalnej();
    }

    public double getKwotaAkcyzy() {
        return 5.56;
    }


}
