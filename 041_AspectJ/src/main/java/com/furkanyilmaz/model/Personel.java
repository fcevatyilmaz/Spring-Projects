package com.furkanyilmaz.model;

public class Personel {

	private String adi;
	private String soyadi;
	private int tecrube;

	public void adiSoyadiKontrolEt() {
		System.out.println("----------adiSoyadiKontrolEt()-------------");
		if(getAdi().length() < 2 || getSoyadi().length() < 2) {
			throw new IllegalArgumentException();
		}
	}

	public void selamlama(String mesaj) {
		System.out.println("----------selamlama(mesaj)-------------");
		System.out.println("GELEN MESAJ : " + mesaj);

	}

	public void personelBilgiVer() {
		System.out.println("----------personelBilgiVer()-------------");
		System.out.println("BİLGİ: " + getAdi() + " " + getSoyadi() + " " + getTecrube() + " YIL");

	}
	
	
	

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getTecrube() {
		return tecrube;
	}

	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}

}
