package com.kh.java.exercise;

import java.util.Scanner;

public class Exercise_Basic2 {
	/*입력받은 문자가 대문자인지 소문자인지 확인하는 프로그램을 작성하여라.
	 * 문자 하나 입력 :a
	 * 영어 대문자 확인 :flase
	 */
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.print("문자하나입력 :" );
	char one = sc.next().charAt(0);
	boolean result = (one >= 'A') && (one <= 'Z');
	System.out.println("영어 대문자 학인 : " + result);
	}

}
