package com.furkanyilmaz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({AConfig.class,BConfig.class})
public class SpringBeansConfig {


}