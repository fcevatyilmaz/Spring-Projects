package com.furkanyilmaz.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.furkanyilmaz.model.Personel;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Personel personel1 = appCtx.getBean("beanPersonel1",Personel.class);
		//Personel personel2 = appCtx.getBean("beanPersonel2",Personel.class);
		
		personel1.adiSoyadiKontrolEt();
		personel1.selamlama(" SELAM ");
		//personel1.personelBilgiVer();
		
		appCtx.close();

	}

}
