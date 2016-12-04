package day.one;

import java.util.ArrayList;

public class MethodPractice {
	public static void main(String []args){
		System.out.println(getNewName("name"));
		System.out.println( getEvenNumberList(20));
		System.out.println("ans# 3 = " + getOddNumberList(30));

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
	

}
