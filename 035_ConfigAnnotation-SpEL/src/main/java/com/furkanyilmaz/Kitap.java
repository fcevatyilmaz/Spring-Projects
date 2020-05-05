package com.furkanyilmaz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kitapBean")
public class Kitap {
	@Value("Savaş ve Barış")
	private String eserAdi;
	
	@Value(value="1234567890")
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
