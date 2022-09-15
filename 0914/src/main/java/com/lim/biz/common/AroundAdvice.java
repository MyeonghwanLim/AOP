package com.lim.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

// around에서 사용되어야하는 advice는 반드시 pjt라는 input을 가져야한다.
// ex) .필터 서블릿 클래스

public class AroundAdvice {
	public Object printLogAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[BEFORE]");
		Object returnObj= pjp.proceed(); // 수행해야할 포인트컷
		//pjp.proceed()에 의행 비즈니스메서드가 수행됨
		System.out.println("[AFTER]");
		return returnObj;
	}
}

