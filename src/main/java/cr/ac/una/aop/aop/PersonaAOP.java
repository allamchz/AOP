package cr.ac.una.aop.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allamchaves
 */
@Aspect
public class PersonaAOP {
    
    @Before("execution(* cr.ac.una.aop.servicio.PersonaService.getPersonaById(..))")
    public void logBeforeV1(JoinPoint joinPoint)
    {
        System.out.println("PersonaAOP.logBeforeV1() : " + joinPoint.getSignature().getName());
    }
     
    @Before("execution(* cr.ac.una.aop.servicio.PersonaService.*(..))")
    public void logBeforeV2(JoinPoint joinPoint)
    {
        System.out.println("PersonaAOP.logBeforeV2() : " + joinPoint.getSignature().getName());
    }
     
    @After("execution(* cr.ac.una.aop.servicio.PersonaService.getPersonaById(..))")
    public void logAfterV1(JoinPoint joinPoint)
    {
        System.out.println("PersonaAOP.logAfterV1() : " + joinPoint.getSignature().getName());
    }
     
    @After("execution(* cr.ac.una.aop.servicio.PersonaService.*(..))")
    public void logAfterV2(JoinPoint joinPoint)
    {
        System.out.println("PersonaAOP.logAfterV2() : " + joinPoint.getSignature().getName());
    }
    
}
