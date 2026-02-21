package rabaty;

import rabatlosowy.LosowyRabat;

public class AdapterObiektowyLosowegoRabatu implements ObliczCenePoRabacie {
    private static final LosowyRabat rabat = new LosowyRabat();

    @Override
    public double obliczCenePoRabacie(double cena) {
        return cena * (1 - rabat.losujRabat());
    }
}
