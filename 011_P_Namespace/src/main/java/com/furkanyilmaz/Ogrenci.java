package com.furkanyilmaz;

public class Ogrenci {
	private String adi,soyadi;
	private int numarasi;
	
	
	Okul universitesi;
	
	
	public Okul getUniversitesi() {
		return universitesi;
	}
	public void setUniversitesi(Okul universitesi) {
		this.universitesi = universitesi;
	}
	public int getNumarasi() {
		return numarasi;
	}
	public void setNumarasi(int numarasi) {
		this.numarasi = numarasi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	

}
