package com.bayram.update;

public class Ogrenci {
	
	private int id;
	private	String ad;
	private	String soyad;
	private String memleket;
	private String bolumu;
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Ogrenci(int id, String ad, String soyad, String memleket, String bolumu) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.memleket = memleket;
		this.bolumu = bolumu;
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

	public String getBolumu() {
		return bolumu;
	}

	public void setBolumu(String bolumu) {
		this.bolumu = bolumu;
	}



	@Override
	public String toString() {
		return "oðrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", memleket=" + memleket + ", bolumu=" + bolumu
				+ "]";
	}
	
	
}
