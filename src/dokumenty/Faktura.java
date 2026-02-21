package dokumenty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;

import magazyn.Towar;
import main.Konfiguracja;
import rabaty.ObliczCenePoRabacie;
import rabaty.ObliczCenePoRabacieKwotowym;
import rabaty.ObliczCenePoRabacieProcentowym;


public class Faktura {
	Date dataSprzedazy;
	String kontrahent;
	ArrayList<Pozycja> pozycje;
	double suma;
    ObliczCenePoRabacie kalkulatorRabatu;
	public Faktura(Date dataSprzedazy,String kontrahent)
	{
		this.dataSprzedazy=dataSprzedazy;
		this.kontrahent=kontrahent;
		pozycje=new ArrayList<Pozycja>();
		suma=0;
        Konfiguracja k = Konfiguracja.getInstance();
        k.getBiezacyRabat();
        kalkulatorRabatu = k.getBiezacyRabat();
	}
	public void dodajPozycje(Towar towar, double ilosc) {
		Pozycja nowaPozycja = new Pozycja(towar, ilosc);
		double cenaPoRabacie = kalkulatorRabatu.obliczCenePoRabacie(towar.getCena());
		nowaPozycja.setCena(cenaPoRabacie);
		pozycje.add(nowaPozycja);
		this.przeliczSume();
	}
	public double getSuma()
	{
		return suma;
	}
	public Date getDataSprzedazy()
	{
		return dataSprzedazy;
	}

	//jak sie zmieni cos na fakturze to trzeba wywolac te metode
	private void przeliczSume()
	{
		Iterator<Pozycja> iteratorPozycji=pozycje.iterator();
		Pozycja pozycja;
		suma=0;
		while(iteratorPozycji.hasNext())
		{
			pozycja = iteratorPozycji.next();
			suma+=pozycja.getWartosc();
		}
	}
	public Iterator<Pozycja> getIteratorPozycji()
	{
		return pozycje.iterator();
	}
	public String getKontrahent()
	{
		return this.kontrahent;
	}
	
	
}
