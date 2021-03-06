package com.furkanyilmaz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Cizim {
	public static void main(String[] args) {
		
//		Resource resource = new FileSystemResource("SpringBeansConfig.xml");
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		
		ClassPathResource classPathResource = new ClassPathResource("SpringBeansConfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		
		//Ucgen ucgen = new Ucgen();
		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
	}

}
