package com.furkanyilmaz.matematik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hesapMakinesiBeanComponent")
public class HesapMakinesi {
	
	@Autowired
	private Islem islem; //enjekte et. 

	public Islem getIslem() {
		return islem;
	}

	public void setIslem(Islem islem) {
		this.islem = islem;
	}
	
	public void sonuclarıGetir(int sayi1,int sayi2) {
		System.out.println("TOPLA : " + islem.topla(sayi1,sayi2));
		System.out.println("ÇIKAR : " + islem.cikar(sayi1,sayi2));
		System.out.println("BÖL : " + islem.bol(sayi1,sayi2));
		System.out.println("ÇARP : " + islem.carp(sayi1,sayi2));
	}

}
