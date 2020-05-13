package com.furkanyilmaz.services.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AopGorevleri implements MethodBeforeAdvice,AfterReturningAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		if (method.getName().equals("personelBilgiVer")) {
			System.out.println("\n\n**** BEFORE **** personelBilgiVer Metodu");
		}
		if (method.getName().equals("adiSoyadiKontrolEt")) {
			System.out.println("\n\n**** BEFORE **** adiSoyadiKontrolEt Metodu");
		}
		
		
		
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		if (method.getName().equals("adiSoyadiKontrolEt")) {
			System.out.println("**** AFTER RETURNING **** adiSoyadiKontrolEt Metodu\n\n");
		}
		if (method.getName().equals("selamlama")) {
			System.out.println("**** AFTER RETURNING **** selamlama Metodu\n\n");
		}
		
	}

}
