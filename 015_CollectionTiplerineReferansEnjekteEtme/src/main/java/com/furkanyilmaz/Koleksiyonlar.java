package com.furkanyilmaz;

import java.util.*;

public class Koleksiyonlar {
	
	List<?> listeler;
	Set<?> setler;
	Map<?,?> mapler;
	Properties propertiesler;
	
	public List<?> getListeler() {
		return listeler;
	}
	public void setListeler(List<?> listeler) {
		this.listeler = listeler;
	}
	public Set<?> getSetler() {
		return setler;
	}
	public void setSetler(Set<?> setler) {
		this.setler = setler;
	}
	public Map<?, ?> getMapler() {
		return mapler;
	}
	public void setMapler(Map<?, ?> mapler) {
		this.mapler = mapler;
	}
	public Properties getPropertiesler() {
		return propertiesler;
	}
	public void setPropertiesler(Properties propertiesler) {
		this.propertiesler = propertiesler;
	}
	@Override
	public String toString() {
		return "List=" + listeler + 
				"\nSet=" + setler + 
				"\nMap=" + mapler + 
				"\nProperties=" + propertiesler;
	}
	
	
	
}
