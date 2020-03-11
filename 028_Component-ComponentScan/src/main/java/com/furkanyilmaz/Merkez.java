package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.furkanyilmaz.matematik.HesapMakinesi;

@SuppressWarnings("resource")
public class Merkez {
	
	public static void main(String[] args) {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		HesapMakinesi hesapMakinesi = appCtx.getBean("hesapMakinesiBeanComponent",HesapMakinesi.class);
		
		hesapMakinesi.sonuclarıGetir(7, 4);
		
		//AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		//appCtx.register(SpringBeansConfig.class);
	
		
		
		
	
		
		
	}

}
