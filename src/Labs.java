//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package src;

public class Labs {

	public static void main(String[] args) {
			


		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6


      int[] ages = {1, 5, 2, 8, 13, 6};
			
		
		// 2. Print out the first element in the array
			System.out.println(ages[0]);
		
		// 3. Print out the last element in the array without using the number 5
			System.out.println(ages[ages.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
			// System.out.println(ages[6]); //Throws exception
		
		// 5. Print out the element in the array at position -1, what happens?
			// System.out.println(ages[-1]); //Throws exception
			
		// 6. Write a traditional for loop that prints out each element in the array
			for (int i = 0; i < ages.length; i++) {
					System.out.println(ages[i]);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array
			for (int i : ages) {
				System.out.println(i);
			}
		
		// 8. Create a new variable called sum, write a loop that adds each element in the array to the sum
			int sum = 0;

			for (int i : ages) {
				sum += i;
			}

			System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it

			int average = sum / ages.length;
			System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array only if the number is odd

		for (int i : ages) {
			if (i % 2 != 0) {
				System.out.println(i);				
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String[] names = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the /*  */sum of all the letters in the new array

		int sum2 = 0;

		for (String name : names) {
			sum2 += name.length();
			System.out.println(sum2);
		}


		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. This method returns nothing.
				greet("Amanda");
				greet("Dan");
		
		// 14. Write and test a method that takes a String name and returns a greeting.  Do not print in the method.
			System.out.println(greeting("Kaiden"));
			System.out.println(greeting("Kensie"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods?
		//		b. What do you find? 
		//		c. How are they different?
			// 13 is void doesnt return anything it just does something. where 14 just returns something
		
		// 15. Write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
		System.out.println(stringVsNumber("Hello", 3));
		
		// 16. Write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		System.out.println(containString(names, "Sam"));
		
		// 17. Write and test a method that takes an array of int and returns the smallest number in the array
		System.out.println(smallestNumber(ages)); 
		
		// 18. Write and test a method that takes an array of double and returns the average
		double[] doubles = {37.4, 28.9, 98.2, 67.4};
		System.out.println(avg(doubles));

		// 19. Write and test a method that takes an array of Strings and returns an array of int where each element matches the length of the string at that position
		int[] nameLengths = test(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
				
		// 20. Write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an even amount of letters is greater than the sum of those with an odd amount of letters.
		System.out.println(sumOfLetters(names));
	
		// 21. Write and test a method that takes a string and returns true if the string is a palindrome
		System.out.println(pallindrome("mom"));
		
		
	}
	

	
	// Method 13:
	public static void greet(String name) {
		System.out.println("Hello " + name);
	}

	// Method 14:
	public static String greeting(String name) {
		return "Hey " + name;
	}
	
	// Method 15:
	public static boolean stringVsNumber(String string, int number) {
		if (string.length() > number ) {
			return true;
		}
		return false;
	}
	
	// Method 16:
		public static boolean containString(String[] array, String string) {
			for (String str : array) {
				if (str.equals(string)) {
				return true;
			}
		}
			return false;
		}
	
	// Method 17:
		public static int smallestNumber(int[] ages) {
			int smallest = ages[0];
			for (int age : ages) {
				if (age < smallest) {
					smallest = age;
				}
			}
			return smallest;
		}
	
	// Method 18:
		public static double avg(double[] array) {
			double sum = 0;
			for (double age : array) {
				sum += age;
			}
			return sum / array.length;
		}
	
	// Method 19:
		public static int[] test(String[] strings) {
			int[] results = new int[strings.length];
			for (int i = 0; i < strings.length; i++) {
				results[i] = strings[i].length();
			}
			return results;
		}
	
	// Method 20:
		public static boolean sumOfLetters(String[] array) {
			int evenLetters = 0;
			int oddLetters = 0;

			for (String string : array) {
				if (string.length() % 2 == 0) {
					evenLetters += string.length();
				} else {
					oddLetters += string.length();
				}
			}
			return evenLetters > oddLetters;
		}
	
	// Method 21:
		public static boolean pallindrome(String string) {
			for (int i = 0; i < string.length() / 2; i++) {
				if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
					return false;
				}
			}
			return true;
		}

}