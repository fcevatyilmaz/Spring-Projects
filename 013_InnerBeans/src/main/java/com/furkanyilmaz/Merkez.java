package com.furkanyilmaz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml"); 
	
		//Parametrede Sınıf Adı
							//new
		Musteri musteri =  context.getBean("beanMusteri",Musteri.class);
		
		musteri.hesabiOde();


	}

}
