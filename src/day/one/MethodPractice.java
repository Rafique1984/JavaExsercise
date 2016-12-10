package day.one;

import java.util.ArrayList;

public class MethodPractice {
	public static void main(String []args){
		System.out.println(getNewName("name"));
		System.out.println( getEvenNumberList(20));
		System.out.println("ans# 3 = " + getOddNumberList(30));
		System.out.println("ans 6 "+ getLower("love Bangladesh"));
	

	}
		// Write a method that take your name input and return your name
		public static String getNewName(String name){
			String myName = null;
			myName = name;
			
			
			return myName;
		}
		// Write a method that take a number input and return the list of all even number from 0 to that given number
		
		public static ArrayList<Integer> getEvenNumberList(int number){
			ArrayList<Integer> evenNumber = new ArrayList<Integer>();
			for(int i=0; i<=number; i++){
				
				if(i% 2 == 0){
					evenNumber.add(i);
				}
				
			}
			
			
			return evenNumber;
		}
		//Write a method that that take a number input and return the list of all odd number from 0 to that given number
		public static ArrayList<Integer> getOddNumberList(int number) {
			ArrayList<Integer> oddList = new ArrayList<Integer>();
			for (int i = 0; i <= number; i++) {
				if (i % 2 == 1) {
					oddList.add(i);
				}

			}

			return oddList;
		}		
		// write a method that take one String and one word input and return the count of that given word
		
		 
        public static int getCountWord(String text, String word){
		int countWord = 0;
		String[]wordArray = text.split(" ");
		for(int i=0; i<wordArray.length;i++){
			if(wordArray[i].equalsIgnoreCase(word));
			countWord++;
		}
		
		return countWord;
		
	}
       
        // Write a method take one String input and return same String in lower case
        public static String getLower(String text){
    		String lowerCase = null;
    		lowerCase = text.toLowerCase();
    		return lowerCase;
    	}

}
