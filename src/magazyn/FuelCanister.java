package magazyn;

import main.Konfiguracja;

public class FuelCanister extends Towar {

    public FuelCanister(double cena, String nazwa) {
        super(cena, nazwa);
    }

    @Override
    public double getCena() {
        Konfiguracja config = Konfiguracja.getInstance();
        double aktualnaAkcyza = config.getKwotaAkcyzy();

        return super.getCena() + aktualnaAkcyza;
    }

}
