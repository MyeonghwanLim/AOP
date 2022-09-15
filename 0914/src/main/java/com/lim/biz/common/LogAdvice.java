package com.lim.biz.common;

public class LogAdvice {
	public void printlog() {
		System.out.println(">>> 공통로직 <<<  핵심로직 수행전에 호출됨");
	}
	public void printlog2() {
		System.out.println("데이터를 탐색합니다...");
	}
	public void printlog3() {
		System.out.println("데이터가 성공적으로 등록되었습니다.");
	}
}
