package com.furkanyilmaz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kitapBean")
public class Kitap {
	
	@Value("Savaş ve Barış")
	private String eserAdi;
	
	@Value("1234567890")
	private long eserISBN;
	
	//--------------------
	public long getEserISBN() {
		return eserISBN;
	}
	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}
	@Override
	public String toString() {
		return "Kitap [eserAdi=" + eserAdi + ", eserISBN=" + eserISBN + "]";
	}
	//--------------------
	public String getEserAdi() {
		return eserAdi;
	}
	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}
	public String kitapBilgisiYaz(String yazarAdi,String yazarSoyadi,String eserAdi,Long eserISBN) {
		System.out.println();
		this.eserAdi=eserAdi;
		this.eserISBN=eserISBN;
		
		return "\n\t YAZAR : " + yazarAdi + " " + yazarSoyadi + " "+
			   "\n\t KİTAP : " + getEserAdi() +
			   "\n\t ISBN  : " + getEserISBN();
	}
	
}
