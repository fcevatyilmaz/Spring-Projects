package com.furkanyilmaz;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.furkanyilmaz.config.SpringBeansConfig;

public class Merkez {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		appCtx.register(SpringBeansConfig.class);
		
		appCtx.refresh();
		
		
		A aNesnesi = appCtx.getBean("beanA",A.class);
		aNesnesi.yaz("A nesnesinin yaz metodu.");
		
		B bNesnesi = appCtx.getBean("beanB",B.class);
		bNesnesi.yaz("B nesnesinin yaz metodu.");	
		
		((ConfigurableApplicationContext)appCtx).close();
		
		
		
	
		
		
	}

}
