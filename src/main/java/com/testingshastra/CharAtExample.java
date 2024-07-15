package com.testingshastra;

public class CharAtExample {

	    public static void main(String[] args) {
	        String s = "Hello";

	        // Retrieving character at the 1st position (index 0)
	        char ch1 = s.charAt(0);
	        System.out.println("Character at 1st position: " + ch1);

	        // Retrieving character at the 2nd position (index 1)
	        char ch2 = s.charAt(1);
	        System.out.println("Character at 2nd position: " + ch2);

	        // Retrieving character at the 3rd position (index 2)
	        char ch3 = s.charAt(2);
	        System.out.println("Character at 3rd position: " + ch3);

	        // Retrieving character at the 4th position (index 3)
	        char ch4 = s.charAt(3);
	        System.out.println("Character at 4th position: " + ch4);

	        // Retrieving character at the 5th position (index 4)
	        char ch5 = s.charAt(4);
	        System.out.println("Character at 5th position: " + ch5);

	        // Attempting to retrieve character at the 6th position (index 5)
	        try {
	            char ch6 = s.charAt(5); // This will throw StringIndexOutOfBoundsException
	            System.out.println("Character at 6th position: " + ch6); // This line won't execute
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Index 5 is out of bounds for string \"" + s + "\"");
	        }
	    }
	}

