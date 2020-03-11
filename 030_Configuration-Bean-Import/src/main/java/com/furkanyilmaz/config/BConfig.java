package com.furkanyilmaz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.furkanyilmaz.B;
@Configuration
public class BConfig {
	@Bean(name = "beanB")
	public B yaz() {
		return new B();
	}
	
	//<bean id = "beanB" class="com.furkanyilmaz.B"/>
}
