package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml"); 
	
		//Parametrede Sınıf Adı
							//new
		Koleksiyonlar ogrenci =  context.getBean("beanOgrenci",Koleksiyonlar.class);
		
		System.out.println("List elemanları : " + ogrenci.getOgrenciList());
		System.out.println("Set elemanları : " + ogrenci.getOgrenciSet());
		System.out.println("Map elemanları : " + ogrenci.getOgrenciMap());
		System.out.println("Properties elemanları : " + ogrenci.getOgrenciProperties());


	}

}
