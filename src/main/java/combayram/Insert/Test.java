package combayram.Insert;

public class Test {

	public static void main(String[] args) {
		Ogrenci ogrenci=new Ogrenci(3, "Kayhan", "Hamal", "Samsun", "Fizik");
		Ogrenci ogrenci1=new Ogrenci(4, "Esra", "G�l", "Konya", "�ssiz");
		DBProcesses.ogrenciEkle(ogrenci);
		DBProcesses.ogrenciEkle(ogrenci1);
	}

}
