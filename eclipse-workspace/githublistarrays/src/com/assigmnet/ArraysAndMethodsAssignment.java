package com.assigmnet;

public class ArraysAndMethodsAssignment {

    public static void main(String[] args) {
    	 double tempC = 25.0;
    	    double tempF = celsiusToFahrenheit(tempC);
    	    System.out.println(tempC + " Celsius is " + tempF + " Fahrenheit.");

        int[] age = {3, 9, 23, 64, 2, 8, 28, 93};

        //a. Programmatically subtract the value of the first element in the array from the value
        //in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
        int difference1 = age[age.length-1] - age[0];
        System.out.println("difference between the first and last" + ":" + difference1);

        //b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
        int[] age2 = {4, 10, 14, 18, 22, 26, 32, 36, 40};
        int differcence2 = age2[age2.length-1] - age2[0];
        System.out.println("difference between the first and last" + ":" + differcence2);

        //c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        int sum = 0;
        for(int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        double averageAge = (double)sum / age.length;
        System.out.println(averageAge);

        //2. Create an array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};  // ← FIXED: Each name in separate quotes
        
        //a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        int totalLetters = 0;
        for(int i = 0; i < names.length; i++) {
            totalLetters += names[i].length();
        }
        double averageLetters=(double)totalLetters/names.length;
        System.out.println("Average letters per name: " + averageLetters);
        //. Use a loop to iterate through the array again and concatenate all the names together, 
        //separated by spaces, and print the result to the console
        
        String allNames = "";
        for(int i = 0; i < names.length; i++) {
            allNames += names[i];
            if (i < names.length-1) {  // ← Remove the semicolon
                allNames += " ";       // ← Add a space, not empty string
            }
        }
        System.out.println(allNames);
        //3. How do you access the last element of any array?
        
        System.out.println( "Last element of ages: " + age[age.length - 1]);
        
        //4. How do you access the first element of any array?
          System.out.println( "first element of age:" +age[0]);
          
       // 5. Create a new array of int called nameLengths. 
       // Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
       int[] nameLengths = new int[names.length];

       for (int i = 0; i < names.length; i++) {
           nameLengths[i] = names[i].length();
           System.out.println(names[i] + " has " + nameLengths[i] + " letters");
       }

       // 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
       // Print the result to the console.
       int nameLengthSum = 0;
       for (int i = 0; i < nameLengths.length; i++) {
           nameLengthSum += nameLengths[i];
       }
       System.out.println("Sum of all name lengths: " + nameLengthSum);
    
    }
       //7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
       //(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”
    // ✅ Method to repeat a word n times
    public static String repeatedWord(String word, int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += word;
            
        }
        return result;
    }

    // 8.Method to return full name
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    
    //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

  public static boolean sumGreater(int[]numbers ) {
	int sum=0;
	 for (int i=0; i<numbers .length;i++) {
		
	 sum+=numbers[i];
	 }
	 return sum>100; 
  }


	 
	 //10. Write a method that takes an array of double and returns the average of all the elements in the array.
	 public static double averageOfElements (double[] numbers) {
	   double sum=0;
		 for(int i=0; i< numbers.length;i++) {
			sum  += numbers[i];
			

 }
 return sum/numbers.length;
	 }
	
 //11. Write a method that takes two arrays of double and returns true if the average of the 
 //elements in the first array is greater than the average of the elements in the second array
	 
 public static boolean greaterThanAverage(double[] num1, double[] num2) {
	    double sum1 = 0;
	    for (int i = 0; i < num1.length; i++) {
	        sum1 += num1[i];
	    }
	    double average1 = sum1 / num1.length;

	    double sum2 = 0;
	    for (int i = 0; i < num2.length; i++) {
	        sum2 += num2[i];
	    }
	    double average2 = sum2 / num2.length;

 
	
 return average1 > average2;
	 }

 //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
 //double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
 
 
 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    return isHotOutside && moneyInPocket > 10.50;
	}

 //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

 //13. Write a method that converts a temperature from Celsius to Fahrenheit. In comments, explain what the method does and why you created it.
//This method converts a temperature value from Celsius to Fahrenheit.
//I created it to help easily convert temperatures for weather-related applications.
public static double celsiusToFahrenheit(double celsius) {
  double fahrenheit = (celsius * 9.0/5.0) + 32;
  return fahrenheit;
}

}

    
    
    

    
    


    
    
    
    
    
    
    

    	
    

