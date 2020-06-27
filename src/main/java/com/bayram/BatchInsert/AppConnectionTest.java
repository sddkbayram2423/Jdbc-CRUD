package com.bayram.BatchInsert;

import java.util.ArrayList;
import java.util.List;

public class AppConnectionTest {

	public static void main(String[] args) {
		Ogrenci ogrenci=new Ogrenci(10, "Kayhan", "Hamal", "Samsun", "Fizik");
		Ogrenci ogrenci1=new Ogrenci(11, "Emine", "Kara", "Ýznik", "Ýssiz");
		Ogrenci ogrenci3=new Ogrenci(12, "Eda", "Samah", "Bursa", "Müzik ogretmeni");
		Ogrenci ogrenci4=new Ogrenci(9, "Esra", "Aydogdu", "Antalya", "Sekreter");
		Ogrenci ogrenci5=new Ogrenci(8, "Safiye", "Bayram", "sýrnak", "Evhanýmý");
		
		List<Ogrenci> ogrenciler=new ArrayList<Ogrenci>();
		ogrenciler.add(ogrenci);
		ogrenciler.add(ogrenci1);
		ogrenciler.add(ogrenci3);
		ogrenciler.add(ogrenci4);
		ogrenciler.add(ogrenci5);
		
		DBProcesses.ogrenciListEkle(ogrenciler);

	}

}
