package com.lagou.edu;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LagouAspect {
	@Pointcut("execution(* com.lagou.*.*(..))")
	public void pointcut() {
	}

	@Before("pointcut()")
	public void before() {
		System.out.println("before method ......");
	}
}