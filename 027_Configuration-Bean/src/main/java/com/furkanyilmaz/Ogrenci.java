package com.furkanyilmaz;

public class Ogrenci {
	
	private String adi,soyadi;
	private Sehir sehir;
	
	//------------------------
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//------------------------
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	//------------------------
	public Sehir getSehir() {
		return sehir;
	}
	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}
}
