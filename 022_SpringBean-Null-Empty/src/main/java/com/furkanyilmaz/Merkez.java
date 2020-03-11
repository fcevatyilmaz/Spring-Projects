package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Personel personel = appCtx.getBean("BeanPersonel",Personel.class);
		
		System.out.println(personel);
		
	}

}
