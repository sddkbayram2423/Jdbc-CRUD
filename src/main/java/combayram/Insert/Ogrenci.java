package combayram.Insert;

public class Ogrenci {
	
	private int id;
	private	String ad;
	private	String soyad;
	private String memleket;
	private String bol�m�;
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Ogrenci(int id, String ad, String soyad, String memleket, String bol�m�) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.memleket = memleket;
		this.bol�m� = bol�m�;
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

	public String getBol�m�() {
		return bol�m�;
	}

	public void setBol�m�(String bol�m�) {
		this.bol�m� = bol�m�;
	}



	@Override
	public String toString() {
		return "ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", memleket=" + memleket + ", bol�m�=" + bol�m�
				+ "]";
	}
	
	
}
