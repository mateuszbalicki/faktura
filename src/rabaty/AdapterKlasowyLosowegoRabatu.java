package rabaty;

import rabatlosowy.LosowyRabat;

public class AdapterKlasowyLosowegoRabatu extends LosowyRabat implements ObliczCenePoRabacie {

    @Override
    public double obliczCenePoRabacie(double cena) {

        double kwotaRabatu = cena * losujRabat();
        return cena - kwotaRabatu;
    }
}
