package main;

import java.util.Calendar;

import magazyn.*;

import dokumenty.Faktura;

//ZEWNETRZNY RABAT
import rabatlosowy.LosowyRabat;
import raporty.WydrukFaktury;

public class Ui {

	public static void main(String[] args) {
		Calendar teraz=Calendar.getInstance();
		
		//Tworzymy towary
		Towar t1=new Towar(10,"buty");
		Towar t2=new Towar(2,"skarpety");
		Towar t5=new BottleOfWine(20,"Riesling");
		Towar t6=new FuelCanister(25,"Diesel");
		
		//I przykladowa fakture
		Faktura f=new Faktura(teraz.getTime(),"Fido");
		f.dodajPozycje(t1,3);
		f.dodajPozycje(t2, 5);
		f.dodajPozycje(t1,2);
		f.dodajPozycje(t1,5);
		f.dodajPozycje(t2, 1);
		f.dodajPozycje(t5,2);
		f.dodajPozycje(t6,1);

        WydrukFaktury print = new WydrukFaktury();
        print.wypiszFakture(f);

		System.out.println("\n------------------------------");
		//TEST ZEWN. rabatu
		LosowyRabat lr=new LosowyRabat();
		System.out.println("Losowy rabat:" + lr.losujRabat());

		System.out.println("\n\n--- DRZEWO KATEGORII (KOMPOZYT) ---");

		Towar t3 = new Towar(2500, "Laptop Dell");
		Towar t4 = new Towar(120, "Myszka bezprzewodowa");

		Kategoria odziez = new Kategoria("Odzież robocza");
		odziez.dodajTowar(t1);
		odziez.dodajTowar(t2);

		Kategoria elektronika = new Kategoria("Sprzęt komputerowy");
		elektronika.dodajTowar(t3);
		elektronika.dodajTowar(t4);

		Podkategoria sklep = new Podkategoria("Główny Asortyment Sklepu");
		Podkategoria dzialBHP = new Podkategoria("Dział BHP");
		Podkategoria dzialIT = new Podkategoria("Dział IT");

		dzialBHP.dodaj(odziez);
		dzialIT.dodaj(elektronika);

		sklep.dodaj(dzialBHP);
		sklep.dodaj(dzialIT);

		sklep.wypisz();
	}

}
