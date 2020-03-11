package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml"); 
		
		//Tip Dönüşümü
		//Calisan calisan1 = (Calisan) context.getBean("beanCalisan");
		
		//Parametrede Sınıf Adı
		Calisan calisan2 =  context.getBean("beanCalisan2",Calisan.class);
		
		//Doğrudan Sınıf Adı
		//Calisan calisan3 =  context.getBean(Calisan.class);
		
		
		System.out.println("ADI 	 :" + calisan2.getAdi());
		System.out.println("SOYADI	 :" + calisan2.getSoyadi());
		System.out.println("YAŞI 	 :" + calisan2.getYas());
		System.out.println("MAHALLE  :" + calisan2.getAdres().getMahalle());
		System.out.println("SEMT 	 :" + calisan2.getAdres().getSemt());
		System.out.println("ŞEHİR 	 :" + calisan2.getAdres().getSehir());


	}

}
