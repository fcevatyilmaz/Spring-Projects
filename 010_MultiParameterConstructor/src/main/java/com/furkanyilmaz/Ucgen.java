package com.furkanyilmaz;

public class Ucgen {
	private String ucgenCesit;
	private int yukseklik;
	private double taban;
	
	public Ucgen(String ucgenCesit) {
		this.ucgenCesit = ucgenCesit;
	}
	
	public Ucgen(String ucgenCesit, int yukseklik) {
		this.ucgenCesit = ucgenCesit;
		this.yukseklik = yukseklik;
	}
	
	public Ucgen(String ucgenCesit, int yukseklik, double taban) {
		this.ucgenCesit = ucgenCesit;
		this.yukseklik = yukseklik;
		this.taban = taban;
	}
	
	public void ciz() {
		System.out.println("TABAN: " + getTaban() + 
						   " YÜKSEKLİK: " + getYukseklik() + 
						   " ÇEŞİT: " + getUcgenCesit());
	}


	public String getUcgenCesit() {
		return ucgenCesit;
	}

	public void setUcgenCesit(String ucgenCesit) {
		this.ucgenCesit = ucgenCesit;
	}

	

	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}

	public double getTaban() {
		return taban;
	}

	public void setTaban(double taban) {
		this.taban = taban;
	}
}
