package com.furkanyilmaz;

import org.springframework.context.ApplicationEvent;

public class CustomOlay extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomOlay(Object source) {
		super(source);
		System.out.println(source.toString());
		
	}

	@Override
	public String toString() {
		return "CustomOlay (Özelleştirilmiş Olay)";
	}
	
}
