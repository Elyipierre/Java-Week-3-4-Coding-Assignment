	package arraysAndMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Week3CodingProject {

	public static void main(String[] args) {
		//1.Create an array of int called ages that contains the 
		//following values: 3, 9, 23, 64, 2, 8, 28, 93.
		List<Integer> ages = new ArrayList<Integer>();
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		 	
	    for(int i = 0; i < ages.size(); i++) {
	    	System.out.println("Age Array List: " + ages.get(i));
		}
	    //1a) Programmatically subtract the value of the first element
	  		//in the array from the value in the last element of the array 
	  		//(i.e. do not use ages[7] in your code). Print the result to the console. 
	    System.out.println(ages.get(0) - ages.get(ages.size()-1));
	    
	    //1b) Add a new age to your array and repeat the step above to ensure it is 
	    //dynamic (works for arrays of different lengths).
	    ages.add(34);
		for(int age : ages) {
			System.out.println(age);	
		}
		//1c) Use a loop to iterate through the array and calculate the average age. 
		//Print the result to the console.
		double sum = ages.get(0) + ages.get(1) + ages.get(2) + ages.get(3) + ages.get(4) + ages.get(5) + ages.get(6) + ages.get(7) + ages.get(8) - 2;
		System.out.println("The average is : " + sum / ages.size());
		
		System.out.println("The sum is " + sum);
		String [] names = new String[]{"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
	    //2a. Use a loop to iterate through the array and calculate the average number 
		//of letters per name. Print the result to the console.
		int letterPerName=0;
        double aveNumPerName;
          for (int i = 0; i< names.length;i++){
              letterPerName = letterPerName+names[i].length();
          }
        System.out.println("Total number of letters: " + letterPerName);
        aveNumPerName = (double) letterPerName / names.length;
        System.out.println("Average Number of letters: " + aveNumPerName);
		
		//2a) Use a loop to iterate through the array and calculate the average number
		//of letters per name. Print the result to the console.
        int numOfLettersPerName=0;
        double aveNumOfLetters;
          for (int i = 0; i< names.length;i++){
              numOfLettersPerName = numOfLettersPerName+names[i].length();
          }
        System.out.println(numOfLettersPerName);
        aveNumOfLetters = (double) numOfLettersPerName / names.length;
        System.out.println(aveNumOfLetters);
      
        // b) Use a loop to iterate through the array again and concatenate all the names together,
        //        separated by spaces, and print the result to the console.
        for (int i = 0; i<names.length;i++) {
            System.out.print(names[i] + " ");    
        }
        //  3) How do you access the last element of any array?
        //  Answer : ArrayName.length-1

        //  4) How do you access the first element of any array?
        //Answer : Arrayname[0];

       //5) Create a new array of int called nameLengths.
       // Write a loop to iterate over the previously created names array
       // and add the length of each name to the nameLengths array.
       int []nameLengths = new int [names.length];
       for (int i = 0; i<nameLengths.length ; i++){
            nameLengths[i]=names[i].length();
       }
       //6) Write a loop to iterate over the nameLengths array and
       //calculate the sum of all the elements in the array. Print the result to the console.

      int nameLenghtSum = 0;
      for(int i = 0; i<nameLengths.length; i++){
    	  nameLenghtSum += nameLengths[i];
          }
      System.out.println("\n" + "The sum of all letters: " + nameLenghtSum);
      
      //7) Write a method that that takes a String, word, and an int, n, as arguments and returns the word
      //  concatenated to itself n number of times.
      //  When i use the word hello, i will concatenate the word 3 times. 
      //A method on the bottom has also been created to print statement
      String tripleHello = concatenatedWord("Hello",3);
      System.out.println(tripleHello);
    
      // 8) Write a method that takes two Strings, firstName and lastName, and returns a full name
      //(the full name should be the first and the last name as a String separated by a space).
      System.out.println(fullName("Elyi","Pierre"));
      
      // 9)	Write a method that takes an array of int and returns true
      //if the sum of all the ints in the array is greater than 100.
      int []array = new int []{36,2,34, 101};
      System.out.println(sumOfInt(array));
      
      //10) Write a method that takes an array of double and returns the average of all the elements 
      //in the array.
      double []array1 = new double[]{25.2,18.5,14.3};
      System.out.println(averageofTheElement(array1));
        
      // 11) Write a method that takes two arrays of double and returns true
      // if the average of the elements in the first array is greater than the 
      //average of the elements in the second array.
      double []arrayOne = new double[]{3.7, 8.3, 7.1}; //average = 6.36
      double []arrayTwo = new double[]{7.4, 4.1, 9.2}; //average = 6.9
      System.out.println(averageOfArrays(arrayOne,arrayTwo));  
       
      //12)	Write a method called willBuyDrink that takes a boolean isHotOutside, 
      //and a double moneyInPocket, and returns true if it is hot outside and 
      //if moneyInPocket is greater than 15.67.
      System.out.println(willBuyDrink(true,12.50));
      
      // 13) Create a method of your own that solves a problem.
      //In comments, write what the method does and why you created it.
      double[] grades = new double[5];
  	  grades[0] =88.7;
  	  grades[1] =92.5;
  	  grades[2] =100;
  	  grades[3] =67.3;
  	  grades[4] =78.9;
  	  System.out.println("Grade point average is " + calculatedAverage(grades));
	}
	public static String concatenatedWord(String str, int num) {
		String result = "";	
		for(int i = 0; i < num; i++ ) {
			result += str;
		}
		return result;	
	}
	public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
	public static boolean sumOfInt (int [] array){
        int sum = 0;
        for (int i =0; i< array.length;i++){
            sum += array[i];
        }
        if (sum>100){
            return true;
        }
        return false;
    }
	public static boolean averageOfArrays(double [] arrayOne, double []arrayTwo){
        double sum1 = 0.0;
        double sum2 = 0.0;
        double avg1, avg2;

        for (int i =0 ; i<arrayOne.length;i++){
            sum1 += arrayOne[i];
        }
        for(int i = 0; i<arrayTwo.length; i++){
            sum2+=arrayTwo[i];
        }
        avg1 = sum1/ arrayOne.length;
        avg2 = sum2/ arrayTwo.length;

        if (avg1>avg2){
            return true;
        }
        return false;
    }
	 public static double averageofTheElement(double [] array){
		 double sum = 0.0;
         double avg;
         for (int i = 0; i< array.length; i++){
             sum += array[i];
             }
         avg =  sum/ array.length;
         return avg;
    }
	 public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket){
		 if((isHotOutside==true && moneyInPocket>10.50)){
			 return true;
	    }
	    return false;
	}
    public static void evenOrOdd(int numb){
        if (numb % 2== 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    //This method Takes an array of double and returns the average of 
    //all elements in the array. In this case, I am able to calculate a grade point 
    //average of a student
    public static double calculatedAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
    }

}
