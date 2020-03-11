package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Selam selamNesnesi1 = context.getBean("beanSelam",Selam.class);	
		selamNesnesi1.setMesaj("Beşitaş");
		selamNesnesi1.goster();
		
		Selam selamNesnesi2 = context.getBean("beanSelam",Selam.class);	
		selamNesnesi2.setMesaj("Galatasaray");
		selamNesnesi2.goster();
		
		selamNesnesi1.goster();
		
		selamNesnesi2.setMesaj("Fenerbahçe");
		selamNesnesi1.goster();
		selamNesnesi2.goster();
		
		Selam selamNesnesi3 = context.getBean("beanSelam",Selam.class);	
		selamNesnesi3.goster();
		selamNesnesi3.setMesaj("TrabzonSpor");
		selamNesnesi1.goster();
		selamNesnesi2.goster();
		selamNesnesi3.goster();
		
	}

}
