package com.furkanyilmaz;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		//ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
				
		appCtx.start(); //Ayağa kaldırılıyor.
		
		Sozler sozler = appCtx.getBean("sozlerBean",Sozler.class);
		sozler.ekranaYaz();
		
		appCtx.refresh(); //
		
		CustomOlayYayinlayicisi customOlayYayinlayicisi 
		= appCtx.getBean("CustomOlayYayinlayicisiBean",CustomOlayYayinlayicisi.class);
		
		customOlayYayinlayicisi.kontrolYap(1996);
		
		appCtx.stop();
		
		appCtx.close();
		
		
	}

}
