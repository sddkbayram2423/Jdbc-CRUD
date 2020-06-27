package com.bayram.delete;

public class Ogrenci {
	
	private int id;
	private	String ad;
	private	String soyad;
	private String memleket;
	private String bölümü;
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Ogrenci(int id, String ad, String soyad, String memleket, String bölümü) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.memleket = memleket;
		this.bölümü = bölümü;
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

	public String getBölümü() {
		return bölümü;
	}

	public void setBölümü(String bölümü) {
		this.bölümü = bölümü;
	}



	@Override
	public String toString() {
		return "Öðrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", memleket=" + memleket + ", bölümü=" + bölümü
				+ "]";
	}
	
	
}
