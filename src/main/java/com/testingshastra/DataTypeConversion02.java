package com.testingshastra; //String to primitive datatypes

public class DataTypeConversion02 {

	public static void StringTobyte() {

		String s = "10";
		byte x = Byte.parseByte(s);
		System.out.println("String to Byte: " + x);
	}

	public static void StringToshort() {

		String s = "15";
		short c = Short.parseShort(s);
		System.out.println("String to Short: " + c);
	}

	public static void StringToint() {

		String s = "20";
		int i = Integer.parseInt(s);
		System.out.println("String to Int: " + i);
	}

	public static void StringTolong() {

		String s = "25";
		long l = Long.parseLong(s);
		System.out.println("String to Long: " + l);
	}

	public static void StringToflot() {

		String s = "3.14f";

		float f = Float.parseFloat(s);
		System.out.println("String to Float: " + f);
	}

	public static void StringTodouble() {
		String s = "9.81";

		double d = Double.parseDouble(s);
		System.out.println("String to Double: " + d);
	}

	public static void StringTochar() {

		String s = "A";
		Character ch = s.charAt(0); //important conversion
		System.out.println("String to Char: " + ch);

	}

	public static void StringToboolean() {

		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println("String to Boolean: " + b);
	}

	public static void main(String[] args) {
		DataTypeConversion02.StringTobyte();
		DataTypeConversion02.StringToshort();
		DataTypeConversion02.StringToint();
		DataTypeConversion02.StringTolong();
		DataTypeConversion02.StringToflot();
		DataTypeConversion02.StringTodouble();
		DataTypeConversion02.StringTochar();
		DataTypeConversion02.StringToboolean();

	}
}