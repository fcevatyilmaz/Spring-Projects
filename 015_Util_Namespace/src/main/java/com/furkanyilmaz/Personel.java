package com.furkanyilmaz;

import java.util.*;

public class Personel {
	
	List<?> listler;
	Set<?> setler;
	
	public Set<?> getSetler() {
		return setler;
	}

	public void setSetler(Set<?> setler) {
		this.setler = setler;
	}

	public List<?> getListler() {
		return listler;
	}

	public void setListler(List<?> listler) {
		this.listler = listler;
	}

	@Override
	public String toString() {
		return "Personel [listler=" + listler
				+ ", setler=" + setler + "]";
	}

	
	
	
}
