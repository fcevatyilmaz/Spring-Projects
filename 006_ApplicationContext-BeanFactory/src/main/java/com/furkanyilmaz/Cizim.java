package com.furkanyilmaz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cizim {
	public static void main(String[] args) {
		
//		Resource resource = new FileSystemResource("SpringBeansConfig.xml");
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		
//		ClassPathResource classPathResource = new ClassPathResource("SpringBeansConfig.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		
		//Ucgen ucgen = new Ucgen();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml"); 
		BeanFactory beanFactory = context;
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] 
																						//{"SpringBeansConfig.xml",
//																						"Config2.xml",
//																						"Config3.xml"
//																						});
			//Birden fazla xml varsa bu şekilde kullanılır.																					
		
		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
	}

}
