package com.furkanyilmaz.services.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AopGorevleri{
	@Before("execution(* com.furkanyilmaz.model.Personel.selamlama(..))")
	public void ilkGorev(JoinPoint joinPoint) throws Throwable {
		
		System.out.println("\n\n**** BEFORE (ASPECTJ) **** " + joinPoint.getSignature().getName());

	}
	
	@After("execution(* com.furkanyilmaz.model.Personel.selamlama(..))")
	public void sonGorev1(JoinPoint joinPoint) throws Throwable {
		
		System.out.println("**** AFTER (ASPECTJ) **** \n\n" + joinPoint.getSignature().getName());

	}
	
	@AfterReturning("execution(* com.furkanyilmaz.model.Personel.selamlama(..))")
	public void ilkGorev2(JoinPoint joinPoint) throws Throwable {
		
		System.out.println("\n\n**** GERİ DÖNÜŞ DEĞERİNDEN SONRA (ASPECTJ) **** " + joinPoint.getSignature().getName());

	}
	//@Around("execution(* com.furkanyilmaz.model.Personel.*(..))") //Bütün metotlar için işletilir
	@Around("execution(* com.furkanyilmaz.model.Personel.adiSoyadiKontrolEt(..))")
	public void sarGorev(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("\n**** KUŞAT SARMALA ÖNCESİ (ASPECTJ) **** ");
		
		joinPoint.proceed();//üstte adı geçen metodu çağırıyor.
		
		System.out.println("**** KUŞAT SARMALA SONRASI (ASPECTJ) **** \n");

	}

	

}
