package com.anu.springAop.xl;

import java.time.LocalDate;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class XLReaderAspect {
    
    @Before("execution(* com.anu.springAop.xl.XLReader.*(..))")
    public void printBeforeExecution() {
        System.out.println("Method Executed At : "+LocalDate.now().toString());
    }
}
