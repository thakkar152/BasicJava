package com.udemy.exceptionhandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		String str = null;
		str.length();
	}

}
