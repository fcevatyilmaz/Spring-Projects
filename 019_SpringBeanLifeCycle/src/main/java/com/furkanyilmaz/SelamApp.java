package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Selam selamNesnesi1 = context.getBean("beanSelam",Selam.class);
		selamNesnesi1.setMesaj("Ahmet Mutlu");
		selamNesnesi1.goster();
		
		Selam selamNesnesi2 = context.getBean("beanSelam",Selam.class);	
		selamNesnesi2.setMesaj("Furkan Yılmaz");
		selamNesnesi2.goster();

		
		((AbstractApplicationContext)context).registerShutdownHook();
		
	}

}
