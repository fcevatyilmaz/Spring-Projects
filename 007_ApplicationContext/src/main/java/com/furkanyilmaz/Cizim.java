package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cizim {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml"); 											
		
		Ucgen ucgen = (Ucgen) context.getBean("ucgen");
		ucgen.ciz();
		
		Daire daire = (Daire) context.getBean("daire");
		daire.ciz();
	}

}
