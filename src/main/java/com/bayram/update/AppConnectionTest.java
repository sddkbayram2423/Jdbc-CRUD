package com.bayram.update;



public class AppConnectionTest {

	public static void main(String[] args) {
		Ogrenci ogrenci=new Ogrenci(10, "Hasan", "Bayram", "��rnak", "Kamu Yonetimi");
		DBProcesses.ogrenciGuncelle(ogrenci);

	
		
	

	}

}
