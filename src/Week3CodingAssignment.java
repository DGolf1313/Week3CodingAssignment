
public class Week3CodingAssignment {

	public static void main(String[] args) {
		//1. Create an array of int called ages that contains the following values: 3,9,23,64,2,8,28,93
		  //a. Programmatically subtract the value of the first element in the array from the value in 
		    //the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		  //b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for 
		    //arrays of different lengths). 
		  //c. Use a loop to iterate through the array and calculate the average age. Print the result 
		    //to the console.
		
		int[] ages = {3, 100, 9, 23, 64, 2, 8, 28, 93};
		
		System.out.println((ages[ages.length-1])- ages[0]);
		
		double sum = 0.0;
		for (int age : ages) {
			sum += age;
		}
		System.out.println(sum/ages.length);
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, 
		//   “Tim”, “Sally”, “Buck”, “Bob”. 
		  //a. Use a loop to iterate through the array and calculate the average number of letters per 
		    //name. Print the result to the console. 
		  //b. Use a loop to iterate through the array again and concatenate all the names together, 
		    //separated by spaces, and print the result to the console. 
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}System.out.println(sumOfLetters/names.length);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		
		int sumOfNameLengths = 0;
		for (int number : nameLengths) {
			sumOfNameLengths += number;
		}System.out.println(sumOfNameLengths);
		
		String practiceRepeatingMethod	 = "Hello";
		int h = 3;
		System.out.println(wordRepeating(practiceRepeatingMethod, h));
		
		String firstName = "Billy";
		String lastName = "Smith";
		
		System.out.println(fullName(firstName, lastName));
		
		System.out.println(isGreaterThanOneHundred(ages));
		
		double[] doubles = {45.45, 56.56, 234.43};
		System.out.println(returnAverage(doubles));
		
		double [] doublesTwo = {234.23, 3345.54};
		System.out.println(findHighestDoubleAverage(doubles, doublesTwo));
		
		boolean isHotOutside = true;
		double moneyInPocket = 13.13;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		int temp = 18;
		boolean iAmExercising = false;
		System.out.println(wearSandalsOrSneakers(iAmExercising, temp));
	}
	
	public static String wordRepeating(String word, int n) {
	String result = "";
		while (n > 0){
		result += word ;
		n--;
	}
	return result;
	}
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	
	public static boolean isGreaterThanOneHundred(int[] numberList) {
		int total = 0;
	for (int number : numberList) {	
		total += number;
		if (total > 100) {
	 return true;
		}
	}
	return false;
	}
	
	public static double returnAverage(double [] doubleList) {
		double sum = 0.0;
		for (double number : doubleList) {
			sum += number;
		}
		return (sum/doubleList.length);
	}
	
	public static double findHighestDoubleAverage(double[] listOne, double [] listTwo) {
		double sumOne = 0.0;
		double sumTwo = 0.0;
		double totalOne = 0.0;
		double totalTwo	= 0.0;
		for (double number : listOne) {
			sumOne += number;
			totalOne = sumOne/listOne.length;
		}
		for (double number : listTwo) {
			sumTwo += number;
			totalTwo = sumTwo/listTwo.length;
		}if (totalOne > totalTwo) {
			return totalOne;
		}else return totalTwo;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(moneyInPocket > 10.50 && isHotOutside ==true) {
			return true;
		}
		return false;
	}
	public static String wearSandalsOrSneakers(boolean iAmExcercising, int temp ) {
		String result = "";
		if(iAmExcercising ==false && temp > 65) {
			return result = "This is a great time to wear sandals!";
		} 
		else if (iAmExcercising == true) {
			return result = "You are excercising, please wear Sneakers";
		} 
		return result = "The temp is too cold for sandals, sneakers would be more comfortable";
			
	}
}
