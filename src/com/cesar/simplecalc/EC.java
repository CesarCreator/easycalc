package com.cesar.simplecalc;

public class EC {
	public static void print(String input) {
		System.out.println(input);
	}
	
	public static void addwd(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("The result is (Doubles' Mode > ADD): " + result);
	}
	
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("The result is (Normals' Mode > ADD): " + result);
	}
	
	public static void multiwd(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("The result is (Doubles' Mode > MULTI): " + result);
	}
	
	public static void multi(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("The result is (Normals' Mode > MULTI): " + result);
	}
	
	public static void divwd(double num1, double num2) {
		double result = num1 / num2;
		System.out.println("The result is (Doubles' Mode > DIV): " + result);
	}
	
	public static void div(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("The result is (Normals' Mode > DIV): " + result);
	}
	
	public static void minwd(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("The result is (Doubles' Mode > MIN): " + result);
	}
	
	public static void min(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("The result is (Normals' Mode > MIN): " + result);
	}
}
