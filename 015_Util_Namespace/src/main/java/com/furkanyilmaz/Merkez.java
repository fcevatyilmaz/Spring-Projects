package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Personel personel = context.getBean("BeanPersonel", Personel.class);
		
		Personel personel2 = context.getBean("BeanPersonel2", Personel.class);
		
		Sehir sehir = context.getBean("BeanSehir",Sehir.class);
		
		System.out.println(personel);
		System.out.println(personel2);
		System.out.println(sehir);
		

	}

}
