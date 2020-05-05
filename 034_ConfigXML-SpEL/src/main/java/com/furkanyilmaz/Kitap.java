package com.furkanyilmaz;

public class Kitap {
	private String eserAdi;
	private long eserISNN;
	//--------------------
	public long getEserISNN() {
		return eserISNN;
	}
	public void setEserISNN(long eserISNN) {
		this.eserISNN = eserISNN;
	}
	@Override
	public String toString() {
		return "Kitap [eserAdi=" + eserAdi + ", eserISNN=" + eserISNN + "]";
	}
	//--------------------
	public String getEserAdi() {
		return eserAdi;
	}
	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}
	
}
