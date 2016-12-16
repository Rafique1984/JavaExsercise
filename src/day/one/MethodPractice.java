package day.one;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {
	public static void main(String[] args) {
		System.out.println(getNewName("name"));
		System.out.println(getEvenNumberList(20));
		System.out.println("ans# 3 = " + getOddNumberList(30));
		System.out.println(getLower("love Bangladesh"));
		System.out.println(getUpper("This is Bangladesh"));
		System.out.println(getIndexList("this is new york"));
		System.out.println("ans# 11 = " + Arrays.toString(getNumberArray(20)));
		System.out.println(getFirstFiveCharacter("beautyful country"));
		System.out.println("ans# 12 = " + getNumberList(15));
		System.out.println("ans# 13 = " + getName(25));

	}

	// Write a method that take your name input and return your name
	public static String getNewName(String name) {
		String myName = null;
		myName = name;

		return myName;
	}

	// Write a method that take a number input and return the list of all even
	// number from 0 to that given number

	public static ArrayList<Integer> getEvenNumberList(int number) {
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {
				evenNumber.add(i);
			}

		}

		return evenNumber;
	}

	// Write a method that that take a number input and return the list of all
	// odd number from 0 to that given number
	public static ArrayList<Integer> getOddNumberList(int number) {
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				oddList.add(i);
			}

		}

		return oddList;
	}
	// write a method that take one String and one word input and return the
	// count of that given word

	public static int getCountWord(String text, String word) {
		int countWord = 0;
		String[] wordArray = text.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].equalsIgnoreCase(word))
				;
			countWord++;
		}

		return countWord;

	}

	// Write a method take one String input and return same String in lower case

	public static String getLower(String text) {
		String lowerCase = null;
		lowerCase = text.toLowerCase();
		return lowerCase;
	}

	// Write a method that take one String input and return same String in upper
	// case

	public static String getUpper(String text) {
		String upperCase = null;
		upperCase = text.toUpperCase();
		return upperCase;
	}
	// Write a method that take one String input and return a list of all index

	public static ArrayList<Integer> getIndexList(String text) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < text.length(); i++) {
			index.add(i);
		}
		return index;
	}

	// Write a method that take one number input and return an Array that
	// contains 0 to that given number##

	public static int[] getNumberArray(int number) {
		int[] numArray = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			numArray[i] = i;

		}
		return numArray;
	}

	// @@ Write a method that take one String input and return a list first five
	// Characters
	/**
	 * input / parameter : String text return type / out put : ArrayList
	 * <Character> serving bucket / container : List
	 */
	public static ArrayList<Character> getFirstFiveCharacter(String text) {
		ArrayList<Character> characterList = new ArrayList<Character>();

		for (int i = 0; i < 5; i++) {
			characterList.add(text.charAt(i));

		}

		return characterList;
	}

	// @@ method no * 12 *
	// ## Write a method that take one number input and return a number List
	// starting from 0 to that given number ##
	/**
	 * input / parameter : int number. out put / return type : ArrayList
	 * <Integer>. serving bucket / container : List.
	 */

	public static ArrayList<Integer> getNumberList(int number) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {

			numberList.add(i);
		}

		return numberList;
	}
	// @@ method no * 13*
	// ## Write a method that take one number input and return fizz if the given
	// number divided by 5 and return buzz if the given
	// number divided by 5 && 3 otherwise return fizz buzz.##
	/**
	 * input / parameter : int number. out put / return type :String. serving
	 * bucket / container : variable.
	 */

	public static String getName(int number) {
		String finalResult = null;
		
		if (number % 5 == 0 && number % 3 == 0) {
			finalResult = "buzz";
			
		} else if (number % 5 == 0) {
			finalResult = "fizz";

		} else {
			finalResult = "fizzBuzz";
		}

		return finalResult;
	}

}
