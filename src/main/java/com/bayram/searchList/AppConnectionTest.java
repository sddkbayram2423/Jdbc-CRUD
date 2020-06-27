package com.bayram.searchList;

import java.util.List;

public class AppConnectionTest {

	public static void main(String[] args) {
	List<Ogrenci> öðrenciler=DBProcesses.ogrenciListele(5);
	System.out.println("\nID\tAD\tSOYAD\tMEMLEKET\t\tBÖLÜM");
	System.out.println("-------------------------------------------------------------------------");
	for(Ogrenci öðrenci:öðrenciler) {
		System.out.println(öðrenci);
		
	}

	
		
	

	}

}
