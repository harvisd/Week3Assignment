package week3;

import java.util.Arrays;

public class CodingAssignment {

	public static void main(String[] args) {
		// Step 1
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 22};
        int firstElement = ages[0];
        int lastElement = ages[ages.length - 1];
        int updatedAge = lastElement - firstElement;
        System.out.println(updatedAge);
        int length = ages.length;
        int sum = 0;
        for(int i = 0; i < ages.length; i++) {
                      sum += ages[i];
        } int average = sum / length;
        System.out.println(average);
        
        //Step 2
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        double arrayCount = 0;
        for(String str : names) {
                      arrayCount += str.length();
                     
        }  System.out.println(arrayCount / names.length);
        
        for (String str : names) {
        	System.out.println(str + " ");
        	}
        
        //Step 3
        System.out.println("The last element in the array is " + names[names.length - 1]);
        
        //Step 4
        System.out.println("The first element in the array is " + names[0]);
        
        //Step 5 
        int[] nameLengths = new int[names.length];
        for(int i = 0 ; i < names.length; i++) {
        	nameLengths[i] = names[i].length();
        }     
        System.out.println(Arrays.toString(nameLengths));
        
        //Step 6 
        int arraySum = 0;
        for(int x : nameLengths) {
        	arraySum += x;
        	
       } System.out.println(arraySum);
       
       //Testing Step 9
       int[] nums = {3, 9, 23};
       System.out.println(sumOfInts(nums));
       
       //Testing Step 10 
       double[] numbers = {10.5, 10.5, 100.0};
       System.out.println(averageOfElements(numbers));
       
       //Testing Step 11
       double[] n = {150.5, 7.3, 65.5, 83.7};
       double[] o = {22.8, 32.5, 50.6, 350.6};
       
       System.out.println(greaterOfTwoArrays(n, o));
       
       //Testing Step 12
       boolean isHotOutside = true;
       double moneyInPocket = 15.75;
       
       System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
       
       //Testing Step 13
       double startingBalance = 960.46;
       Double[] currentCharges = {460.50, 50.06, 25.78, 15.75, 222.00};
       System.out.println(returnCheckingBalance(startingBalance, currentCharges));

     }
	//Step 7
	public static String concatenatedNum(String word, int n) {
		int concatenate = n;
		return word.repeat(concatenate);
	}
	//Step 8 
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	//Step 9
	public static boolean sumOfInts(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			
		} return sum >= 100;
	}
	//Step 10
	public static double averageOfElements(double[] nums) {
		double count = 0;
		int num = 0;
		for(int i = 0; i < nums.length; i++) {
			count = count + nums[i];
			num++;
		} return count / num;
	}
	//Step 11
	public static boolean greaterOfTwoArrays(double[] array1, double[] array2) {
		double count1 = 0;
		double count2 = 0;
		for(int i = 0; i < array1.length; i++) {
			count1 += array1[i];
		} 	for(int j = 0; j < array2.length; j++) {
			count2 += array2[j];
		} return count1 / array1.length > count2 /array2.length;
	}
	//Step 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside == true && moneyInPocket > 10.50;
	}

	//Step 13 - create my own method. 
	//This is a method to subtract all my current charges from my checking account's starting
	//balance
	public static double returnCheckingBalance(Double startingBalance, Double[] currentCharges) {
		double newBalance = 0;
		double totalCharges = 0;
		for(int i = 0; i < currentCharges.length; i++) {
			totalCharges += currentCharges[i];
			newBalance = startingBalance - totalCharges;
		}
		return newBalance;
	}
	
	}



	


