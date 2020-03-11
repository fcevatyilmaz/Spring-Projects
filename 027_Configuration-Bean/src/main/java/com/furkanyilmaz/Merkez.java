package com.furkanyilmaz;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Merkez {
	
	public static void main(String[] args) {
		
		//ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		appCtx.register(SpringBeansConfig.class);
		
		appCtx.refresh();
		
		Ogrenci ogrenci = appCtx.getBean("ogrenci",Ogrenci.class);
		System.out.println(ogrenci.getSehir().getSehirAdi());
		System.out.println(ogrenci.getSehir().getPlakaNo());
		
		((ConfigurableApplicationContext)appCtx).close();
		
		
		
	
		
		
	}

}
