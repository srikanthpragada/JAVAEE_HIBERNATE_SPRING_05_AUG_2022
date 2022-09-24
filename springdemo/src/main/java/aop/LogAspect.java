package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

@Component
@Aspect
@Order(1)
public class LogAspect {

	public LogAspect() {
		System.out.println("LogAspect()");
	}
	
	//@Before(value = "execution (* aop.Order.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("Before Advice  --> " + jp.getSignature());
	}
	
	
	@Pointcut("execution (* aop.Order.*(..))")
	public void orderMethods() {
	}

	// After Finally
	//@After("orderMethods()")   
	public void afterAdviceMethod(JoinPoint jp) {
		System.out.println("After Advice --> " + jp.getSignature());
	}
 
	
	// After Returning
	//@AfterReturning(value = "execution (* aop.Order.*(..))")
	public void afterReturningAdviceMethod(JoinPoint jp) {
		System.out.println("After Returning Advice --> " + jp.getSignature());
	}

	// After Throwing
	//@AfterThrowing(value = "execution (* aop.Order.*(..))", throwing = "ex")
	public void afterThrowingAdviceMethod(JoinPoint jp, Exception ex) {
		System.out.println("After Throwing Advice --> " + jp.getSignature());
		System.out.println("Exception is : " + ex.getMessage());
	}


	@Around(value = "execution (* aop.Order.*(..))")
	public void aroundAdviceMethod(ProceedingJoinPoint pjp) {
		System.out.println("Before calling : " + pjp.getSignature());
		try {
			Object obj = pjp.proceed(pjp.getArgs()) ; // Call method in Target
			System.out.println("Returned : " + obj);
		} catch (Throwable ex) {
            System.out.println("Exception : " + ex.getMessage());
		}
		System.out.println("After completing : " + pjp.getSignature());
	}

}
