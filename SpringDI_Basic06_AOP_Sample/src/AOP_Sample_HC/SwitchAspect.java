package AOP_Sample_HC;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SwitchAspect {

	@Around("execution(public * AOP_Sample_HC.*Switch.*(..))")
	public boolean switchLog(ProceedingJoinPoint joinPoint) throws Throwable {
		boolean result = (boolean) joinPoint.proceed();
		if (result) {
			System.out.println("스위치 ON");
		} else {
			System.out.println("스위치 OFF");
		}
		return result;
	}

}
