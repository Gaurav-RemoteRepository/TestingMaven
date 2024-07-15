package com.testingshastra; //numbers to string

public class DataTypeConversion {
	public static void byteToString() {

		byte x = 10;
		String s = String.valueOf(x);
		System.out.println("Byte to String: " + s);
	}

	public static void shortToString() {

		short c = 15;
		String s = String.valueOf(c);
		System.out.println("Short to String: " + s);
	}

	public static void intToString() {

		int i = 20;
		String s = String.valueOf(i);
		System.out.println("Int to String: " + s);
	}

	public static void longToString() {

		long l = 25;
		String s = String.valueOf(l);
		System.out.println("Long to String: " + s);
	}

	public static void flotToString() {

		float f = 3.14f;

		String s = String.valueOf(f);
		System.out.println("Float to String: " + s);
	}

	public static void doubleToString() {

		double d = 9.81;

		String s = String.valueOf(d);
		System.out.println("Double to String: " + s);
	}

	public static void charToString() {

		char ch = 'A';
		String s = String.valueOf(ch);
		System.out.println("Char to String: " + s);

	}

	public static void booleanToString() {

		boolean b = true;
		String s = String.valueOf(b);
		System.out.println("Boolean to String: " + s);
	}

	public static void main(String[] args) {
		DataTypeConversion.byteToString();
		DataTypeConversion.shortToString();
		DataTypeConversion.intToString();
		DataTypeConversion.longToString();
		DataTypeConversion.flotToString();
		DataTypeConversion.doubleToString();
		DataTypeConversion.charToString();
		DataTypeConversion.booleanToString();

	}
}