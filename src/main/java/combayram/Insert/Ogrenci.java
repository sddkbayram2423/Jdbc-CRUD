package combayram.Insert;

public class Ogrenci {
	
	private int id;
	private	String ad;
	private	String soyad;
	private String memleket;
	private String bolümü;
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Ogrenci(int id, String ad, String soyad, String memleket, String bolümü) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.memleket = memleket;
		this.bolümü = bolümü;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getMemleket() {
		return memleket;
	}

	public void setMemleket(String memleket) {
		this.memleket = memleket;
	}

	public String getBolümü() {
		return bolümü;
	}

	public void setBolümü(String bolümü) {
		this.bolümü = bolümü;
	}



	@Override
	public String toString() {
		return "ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", memleket=" + memleket + ", bolümü=" + bolümü
				+ "]";
	}
	
	
}
