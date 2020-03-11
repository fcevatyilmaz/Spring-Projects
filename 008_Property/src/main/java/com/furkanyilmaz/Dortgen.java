package com.furkanyilmaz;

public class Dortgen {
	private String dortgenCesit;
	
	public String getDortgenCesit() {
		return dortgenCesit;
	}
	public void setDortgenCesit(String dortgenCesit) {
		this.dortgenCesit = dortgenCesit;
	}
	public void ciz() {
		System.out.println(getDortgenCesit()+" Dörtgen çiz.");
	}
}
