package rabaty;

import main.Konfiguracja;

public class ObliczCenePoRabacieKwotowym implements ObliczCenePoRabacie{

    @Override
    public double obliczCenePoRabacie(double cena) {
        Konfiguracja k = Konfiguracja.getInstance();
        double kwota = k.getKwotaRabatu();
        return cena -= kwota;
    }
}
