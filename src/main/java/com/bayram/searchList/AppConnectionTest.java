package com.bayram.searchList;

import java.util.List;

public class AppConnectionTest {

	public static void main(String[] args) {
	List<Ogrenci> ��renciler=DBProcesses.ogrenciListele(5);
	System.out.println("\nID\tAD\tSOYAD\tMEMLEKET\t\tB�L�M");
	System.out.println("-------------------------------------------------------------------------");
	for(Ogrenci ��renci:��renciler) {
		System.out.println(��renci);
		
	}

	
		
	

	}

}
