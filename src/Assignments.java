package src;

public class Assignments {

  public static void main(String[] args) {
  
//1: Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};


    for (int i = 0; i < ages.length; i++) {
      System.out.println(ages[i]);
    }

 // A: Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 

    ages[ages.length-1] = ages[ages.length-1] - ages[0];
    System.out.println(ages[ages.length-1]);

// B: Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).

    int[] newAges = new int[ages.length + 1];;
    System.arraycopy(ages, 0, newAges, 0, ages.length);
    newAges[newAges.length - 1] = 7;
    System.out.println(newAges[newAges.length-1]);

    newAges[newAges.length-1] = newAges[newAges.length-1] - newAges[0];
    System.out.println(newAges[newAges.length-1]);

// C: Use a loop to iterate through the array and calculate the average age. Print the result to the console.

    int sum = 0;
    int avg = 0;

    for (int i = 0; i < newAges.length; i++) {
      sum += newAges[i];
    }
    avg = sum / newAges.length;
    System.out.println(avg);

// 2: Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

// A: Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

    // int nameSum = 0;
    // int nameAvg = 0;

    // for (int i = 0; i < names.length; i++) {
      
    // }


// B: Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

String allNames = "";

for (String name : names) {
  allNames += name + " ";
}
  System.out.println(allNames);


//3: How do you access the last element of any array?

    System.out.println(names[names.length-1]);

//4: How do you access the first element of any array?

    System.out.println(names[0]);

//5: Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

  // int[] nameLengths = new int[names.length];

  // for (int i = 0; i < names.length; i++) {
    
  // }

//6: Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

    // for (int i = 0; i < names.length; i++) {
      
    // }

  }
}
/* 

7: Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
8: Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
9: Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
10: Write a method that takes an array of double and returns the average of all the elements in the array.
11: Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
12: Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
13: Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 */