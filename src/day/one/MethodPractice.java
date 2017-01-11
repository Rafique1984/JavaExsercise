package day.one;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {
	public static void main(String[] args) {
		System.out.println("ans# 1 = " + getNewName("name"));
		System.out.println("ans# 2 = " + getEvenNumberList(20));
		System.out.println("ans# 3 = " + getOddNumberList(30));
		System.out.println("ans# 4 = " + getKilometer(20.5));
		System.out.println("ans# 5 = " + getUpper("This is Bangladesh"));
		System.out.println("ans# 6 = " + getLower("love Bangladesh"));
		System.out.println("ans# 7 = " + getIndexList("this is new york"));
		System.out.println("ans# 8 = " + getCharacterList("my love country"));
		System.out.println("ans# 9 = " + getSum(20));
		System.out.println("ans# 10 = " + getCount(45));
		System.out.println("ans# 11 = " + Arrays.toString(getNumberArray(20)));
		System.out.println("ans# 12 = " + getNumberList(15));
		System.out.println("ans# 13 = " + getName(25));
		int[] numarray = { 45, 90, 34, 45 };
		System.out.println("ans# 14 = " + getHighestNumber(numarray));
		int[] nummarray = { 3, 4, 5, 8 };
		System.out.println("ans # 15 = " + getMinNumber(nummarray));
		System.out.println("ans # 16 = " + getResult(20));
		System.out.println("ans # 17 = " + getIntegerFromString("30"));
		System.out.println("ans # 18 = " + getDecision("This is a String"));
		System.out.println("ans # 19 = " + getSumOFAllIndex("beautiful"));
		System.out.println("ans # 20 = " + getLastFiveCharacter("bangladesh"));
		System.out.println("ans# 21 = " + getFirstFiveCharacter("beautyful country"));
		System.out.println("ans# 22 = " + getFifthToTenthCharacter("we love our country"));
		System.out.println("ans# 23 = " + getWordList("this is a String"));
		System.out.println("ans# 24 = " + getFirstWord("we love our country"));
		System.out.println("ans# 25 = " + getSearchResult("This is a String", "is"));
		System.out.println("ans# 26 = " + getWordCount("This is a String", "is"));
		System.out.println("ans# 27 = " + getConsonantLeterCount("Bangladesh is a beautiful country"));
		System.out.println("ans # 28 = " + getVowelCount("This is a String"));
		System.out.println("ans# 29 = " + getUpperCaseCharacterCount("This is a String"));
		System.out.println("ans# 30 = " + getCharacterCount("Proud of Bangladesh"));
		System.out.println("ans # 31 = " + getRepeatedChar("This is a String"));
		System.out.println("ans# 32 = " + getUniqueCharacter("This is our country"));
		System.out.println("ans# 33 = " + getCharacterCount("This is a String"));
		int[] numArray = { 10, 20, 30, 40 };
		System.out.println("ans# 34 = " + getSum(numArray));
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		System.out.println("ans# 35 = " + getSum(numberList));
		System.out.println("ans# 36 = " + ("This is a String"));

	}

	/*
	 * @@ method no 1 ## Write a method that take your name input and return
	 * your name input / parameter :String text. out put / return type : String.
	 * serving bucket / container: variable
	 */
	public static String getNewName(String name) {
		String myName = null;
		myName = name;

		return myName;
	}

	/*
	 * @@ method no 2 ## Write a method that take a number input and return the
	 * list of all even number from 0 to that given number input / parameter :
	 * int number. out put / return type : ArrayList<Integer> serving bucket /
	 * container: List
	 */
	public static ArrayList<Integer> getEvenNumberList(int number) {
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {
				evenNumber.add(i);
			}

		}

		return evenNumber;
	}

	/*
	 * @@ method no 3 ## Write a method that take a number input and return the
	 * list of all odd number from 0 to that given number: input/ parameter :
	 * int number. output/ return type :ArrayList<Integer>. serving bucket /
	 * container :List.
	 */
	public static ArrayList<Integer> getOddNumberList(int number) {
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				oddList.add(i);
			}

		}

		return oddList;
	}

	/*
	 * @@ method no * 4 * Write a method that take input as mile and return as
	 * kilometer ## input/ parameter: double distance. output/ return type :
	 * double. serving bucket / container : variable.
	 */
	public static double getKilometer(double distance) {
		double asKilometer = 0;
		asKilometer = distance * 1.6;

		return asKilometer;
	}
	/*
	 * @@ method no 4 ## write a method that take one String and one word input
	 * and return the count of that given word input/ parameter: double
	 * distance. output/ return type : double. serving bucket / container :
	 * variable.
	 */

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
	/*
	 * @@ method no 5 ## Write a method that take one String input and return
	 * same String in upper case input / parameter : String text. out put /
	 * return type : String. serving bucket / container : variable.
	 */

	public static String getUpper(String text) {
		String upperCase = null;
		upperCase = text.toUpperCase();
		return upperCase;
	}
	/*
	 * @@ method no 6 ##Write a method take one String input and return same
	 * String in lower case input / parameter : String text. out put/ return
	 * type : String. serving bucket/ container : variable.
	 */

	public static String getLower(String text) {
		String lowerCase = null;
		lowerCase = text.toLowerCase();
		return lowerCase;
	}

	/*
	 * @@ method no 7 ## Write a method that take one String input and return a
	 * list of all index input/parameter : String text. out put / return type :
	 * ArrayList <Integer>. serving bucket/ container : List
	 */

	public static ArrayList<Integer> getIndexList(String text) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < text.length(); i++) {
			index.add(i);
		}
		return index;
	}

	// @@ method no * 8 *
	// ## Write a method that take one String input and return a List of all
	// Character ##
	/**
	 * input / parameter: String text. out put / return type : ArrayList
	 * <Character>. serving bucket / container : List.
	 */
	public static ArrayList<Character> getCharacterList(String text) {
		ArrayList<Character> characterLook = new ArrayList<Character>();
		for (int i = 0; i < text.length(); i++) {
			characterLook.add(text.charAt(i));
		}

		return characterLook;
	}
	// @@ method no * 9 *

	// ## Write a method that take one number input and return the sum of 1 to
	// that given number ##
	/**
	 * input/ parameter : int number. out put / return type : int serving bucket
	 * / container :variable.
	 */
	public static int getSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			// System.out.println(i);
			sum = sum + i;
			// System.out.println(sum);
		}

		return sum;
	}

	// @@ method no * 10 *
	// ## Write a method that take one number input and return square of the
	// given number ##
	/**
	 * input / parameter : int number. out put / return type : int. serving
	 * bucket / container : variable.
	 */
	public static int getCount(int number) {
		int newCount = 0;
		newCount = number * number;

		return newCount;
	}

	// @@ method no * 11 *
	// ## Write a method that take one number input and return an Array that
	// contains 0 to that given number##
	/**
	 * input/ parameter : int number. out put / return type : int []. serving
	 * bucket/ container : Array.
	 */
	public static int[] getNumberArray(int number) {
		int[] numArray = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			numArray[i] = i;

		}

		return numArray;

	}

	/*
	 * @@ method no * 12 * ## Write a method that take one number input and
	 * return a number List starting from 0 to that given number ## input /
	 * parameter : int number. out put / return type : ArrayList <Integer>.
	 * serving bucket / container : List.
	 */

	public static ArrayList<Integer> getNumberList(int number) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {

			numberList.add(i);
		}

		return numberList;
	}

	/*
	 * @@ method no * 13* ## Write a method that take one number input and
	 * return fizz if the given number divided by 5 and return buzz if the given
	 * number divided by 5 && 3 otherwise return fizz buzz.## input / parameter
	 * : int number. out put / return type :String. serving bucket / container :
	 * variable.
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

	/*
	 * @@ method no *14* ## Write a method that take one Array input and return
	 * the max number.## input / parameter : int [] numarray out put / return
	 * type : int. serving bucket / container : variable.
	 */
	public static int getHighestNumber(int[] numarray) {
		int max = 0;
		Arrays.sort(numarray);
		max = numarray[numarray.length - 1];

		return max;
	}

	/*
	 * @@ method no *15* ## Write a method that take one Array input and return
	 * the min number## input / parameter : int [] nummarray. out put/return
	 * type : int serving bucket/ container : variable.
	 */

	public static int getMinNumber(int[] nummarray) {
		int minimumNumber = 0;
		Arrays.sort(nummarray);
		minimumNumber = nummarray[0];

		return minimumNumber;
	}

	/*
	 * @@ method no *16* ## Write a method that take a number input and return
	 * the same value as a String## input / parameter; int number out put/
	 * return type :String, serving bucket : variable
	 */

	public static String getResult(int number) {
		String string = null;
		string = String.valueOf(number);

		return string;
	}

	/*
	 * @@ method no *17* ## Write a method that take a String representation of
	 * number input and return the same value as Integer.## input / parameter :
	 * String text. output / return type : int. serving bucket / container :
	 * variable.
	 */

	public static int getIntegerFromString(String text) {
		int integerNumber = 0;
		integerNumber = Integer.valueOf(text);

		return integerNumber;
	}

	/*
	 * @@ method no *18* Write a method that take one String input and return
	 * true if it contains char 'a' otherwise return false ## char 'a' otherwise
	 * return false ## input / parameter : String text. output / return type :
	 * boolean serving bucket / container : variable.
	 */
	public static boolean getDecision(String text) {
		boolean decision = false;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				decision = true;
			}
		}
		return decision;
	}

	/*
	 * @@ method no *19* Write a method that take a one String input and return
	 * the sum of all index.## input / parameter : String text. output / return
	 * type : int. serving bucket / container : variable
	 */
	public static int getSumOFAllIndex(String text) {
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {

			sum = sum + i;
		}

		return sum;
	}
	/*
	 * @@ method no *20* ## Write a method that take a one String input and
	 * return a list of last five characters ## input / parameter : String text.
	 * output / return type : ArrayList <Character> serving bucket / container :
	 * List
	 */

	public static ArrayList<Character> getLastFiveCharacter(String text) {
		ArrayList<Character> characterList = new ArrayList<Character>();
		for (int i = text.length() - 5; i < text.length(); i++) {

			characterList.add(text.charAt(i));
		}
		return characterList;

	}

	/*
	 * @@ method no *21* Write a method that take one String input and return a
	 * list first five Character input : String text return :
	 * ArrayList<Character> serving bucket: List
	 */
	public static ArrayList<Character> getFirstFiveCharacter(String text) {
		ArrayList<Character> firstFive = new ArrayList<Character>();
		for (int i = 0; i <= 4; i++) {
			firstFive.add(text.charAt(i));
		}
		return firstFive;

	}

	/*
	 * @@ method no *22* Write a method that take one String input and fifth to
	 * ten character as a String input : String text return : String serving
	 * bucket : variable
	 */
	public static String getFifthToTenthCharacter(String text) {
		String result = "";
		for (int i = 4; i <= 9; i++) {
			result = result + String.valueOf(text.charAt(i));
		}
		return result;
	}

	/*
	 * @@ method no 23 Write a method that take one String input and return a
	 * list of all words input : String text return : ArrayList<String> serving
	 * bucket : List
	 */
	public static ArrayList<String> getWordList(String text) {
		ArrayList<String> wordList = new ArrayList<String>();
		String[] numArray = text.split(" ");
		for (int i = 0; i < numArray.length; i++) {
			wordList.add(numArray[i]);

		}
		return wordList;
	}

	/*
	 * @@ method no 24 Write a method that one String input and return first
	 * word input/ parameter : String text, out put/return type: String,
	 * Container: variable,
	 */
	public static String getFirstWord(String text) {
		String word = " ";
		String[] wordArray = text.split(" ");
		// System.out.println(Arrays.toString(wordArray));
		word = wordArray[0];

		return word;
	}

	/*
	 * @@ method no 25 ## write a method that take one String and one word input
	 * and return true if that sentence contain given word otherwise return
	 * false. input / parameter :String text;String word out: boolean
	 * container:variable
	 */
	public static boolean getSearchResult(String text, String word) {
		boolean result = false;
		String[] wordArray = text.split(" ");

		for (int i = 0; i < wordArray.length; i++) {
			// System.out.println(wordArray[i].equalsIgnoreCase(word));
			if (wordArray[i].equalsIgnoreCase(word)) {
				result = true;
			}

		}
		return result;
	}
	/*
	 * @@ method no 26 ## write a method that take one String and one word input
	 * and return the count of that given word input : String text, String word
	 * out put : int container: variable
	 */

	public static int getWordCount(String text, String word) {
		int count = 0;
		String[] wordArray = text.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			// System.out.println(wordArray[i].equalsIgnoreCase(word));
			if (wordArray[i].equalsIgnoreCase(word)) {
				count++;
			}
		}

		return count;
	}

	/*
	 * @@ method no 27 ## write a method that take one String input and return
	 * the count of all consonant input / parameter : String text out put /
	 * return type ; int serving bucket / container : variable
	 */
	public static int getConsonantLeterCount(String text) {
		int count = 0;
		String newText = text.toLowerCase();
		String consonant = "bcdfghjklmnpqrstvwxyz";
		for (int i = 0; i < newText.length(); i++) {
			String ch = String.valueOf(newText.charAt(i));
			if (consonant.contains(ch)) {
				count++;
			}
		}

		return count;
	}
	/*
	 * method no 28 Write a method that take one String input return the count
	 * of all vowel input / parameter : String text return type : int serving
	 * bucket / container : variable
	 */

	public static int getVowelCount(String text) {
		int countOne = 0;
		String newText = text.toLowerCase();
		// System.out.println(newText);
		String vowel = "aeiou";
		for (int i = 0; i < newText.length(); i++) {
			String ch = String.valueOf(newText.charAt(i));
			// System.out.println(ch);
			// System.out.println(vowel.contains(ch));
			if (vowel.contains(ch)) {
				countOne++;
			}

		}

		return countOne;
	}
	/*
	 * @@ method no *29* Write a method that take one String input and return
	 * the count of all upper case characters ## input / parameter : String
	 * text. return type / out put : int serving bucket / container : variable
	 */

	public static int getUpperCaseCharacterCount(String text) {
		int count = 0;
		String upperCaseChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < text.length(); i++) {
			String character = String.valueOf(text.charAt(i));
			if (upperCaseChar.contains(character)) {
				count++;
			}
		}

		return count;
	}
	/*
	 * @@ method no *30* write a method that take one String input and return
	 * the count of characters without white Space## input ; String text return
	 * : int serving bucket : variable
	 */

	public static int getCharacterCount(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {

				count++;
			}
		}

		return count;
	}
	/*
	 * @@ method no *31* write a method that take one String input and return
	 * all repeated characters without whitespace ## input/ parameter : String
	 * text, return type : String. serving bucket / container : variable.
	 */

	public static String getRepeatedChar(String text) {
		String repeatedChar = "";
		String newText = text.toLowerCase().replace(" ", "");

		for (int i = 0; i < newText.length(); i++) {
			for (int j = i + 1; j < newText.length(); j++) {
				if (newText.charAt(i) == newText.charAt(j)) {
					if (!repeatedChar.contains(String.valueOf(newText.charAt(i)))) {
						repeatedChar = repeatedChar + newText.charAt(i);

					}
				}

			}

		}

		return repeatedChar;
	}

	/*
	 * @@ method no *32* Write a method that take one String input and return
	 * all unique characters without whitespace input / parameter : String text
	 * out put / return type : String container : variable
	 */
	public static String getUniqueCharacter(String text) {
		String uniqueChar = "";
		String newText = text.toLowerCase().replaceAll(" ", "");
		uniqueChar = newText;
		for (int i = 0; i < newText.length(); i++) {
			for (int j = i + 1; j < newText.length(); j++) {

				if (newText.charAt(i) == newText.charAt(j)) {
					uniqueChar = uniqueChar.replaceAll(String.valueOf(newText.charAt(i)), "");
				}
			}
		}

		return uniqueChar;
	}
	/*
	 * @@ Method no *33* Write a method that take one String and character input
	 * return the count of that given character## input : String text, char a
	 * return type : int serving bucket : variable
	 */

	public static int getCharacterCount(String text, char a) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.toLowerCase().charAt(i) == 'a') {
				count++;
			}
		}

		return count;
	}

	/*
	 * @@ Method no *34* Write a method that take one integer type array input
	 * and return sum of all values ## input : int [] numArray return type : int
	 * serving bucket : variable
	 */
	public static int getSum(int[] numArray) {
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}

		return sum;
	}
	/*
	 * @@ Method no *35* Write a method that take one Integer type List input
	 * and return sum of all values## input / parameter : ArrayList<Integer>
	 * numList return type / out put : int serving bucket / container : variable
	 */

	public static int getSum(ArrayList<Integer> numList) {
		int sum = 0;
		for (int i = 0; i < numList.size(); i++) {

			sum = sum + numList.get(i);
		}

		return sum;
	}
	/*
	 * @@ Method no *36* Write a method that take one String input and return
	 * same String in reverse order ## input :String text return type : String
	 * serving bucket : variable
	 */

	public static String getReversString(String text) {
		String reverseString = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverseString = reverseString + text.charAt(i);

		}

		return reverseString;

	}

}
