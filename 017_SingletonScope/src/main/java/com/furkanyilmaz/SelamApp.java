package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Selam selamNesnesi1 = context.getBean("beanSelam",Selam.class);	
		Selam selamNesnesi2 = context.getBean("beanSelam",Selam.class);	
		Selam selamNesnesi3 = context.getBean("beanSelam",Selam.class);	
		Selam selamNesnesi4 = context.getBean("beanSelam",Selam.class);	
		Selam selamNesnesi5 = context.getBean("beanSelam",Selam.class);	

		
		System.out.println(selamNesnesi1);
		System.out.println(selamNesnesi2);
		System.out.println(selamNesnesi3);
		System.out.println(selamNesnesi4);
		System.out.println(selamNesnesi5);

	}

}
