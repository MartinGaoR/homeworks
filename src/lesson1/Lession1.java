package lesson1;

import java.util.*;

public class lession1 {
	
	public static void run() {
		// answer for exercise 1
		exercise1();
		// answer for exercise 2
		exercise2();
		// answer for exercise 3
		exercise3();
		// answer for exercise 4
		exercise4();
		// answer for exercise 5
		exercise5();
		// answer for exercise 6
		exercise6();
		// answer for exercise 7
		exercise7();
		// answer for exercise 8
		exercise8();
		// answer for exercise 9
		exercise9();
		// answer for exercise 10
		exercise10();
		// answer for exercise 11
		exercise11();
	}
	
	private static void exercise1() {
		//1. Analyse the codes and workout the output.
		System.out.println("Exercise 1");
		// 1.1 answer
		exerciseOneDotOne();
		// 1.2 answer
		exerciseOneDotTwo();
		// 1.3 answer
		exerciseOneDotThree();
		// 1.4 answer
		exerciseOneDotFour();
		// 1.5 answer
		exerciseOneDotFive();
		// 1.6 answer
		exerciseOneDotSix();
		// 1.7 answer
		exerciseOneDotSeven();
		// 1.8 answer
		exerciseOneDotEight();
		System.out.println();
	}
	
	private static void exercise2() {
		// 2. Print your Name Three Times
		// Write a Program that prints your name 3 times; once per line.
		System.out.println("Exercise 2");
		Scanner sc = new Scanner(System.in);
		// reading the input
		String name = sc.next();
		// solution 1: naive solution
		exerciseTwoSolution1(name);
		// solution 2: using a loop
		exerciseTwoSolution2(name);
		System.out.println();
	}
	
	private static void exercise3() {
		//3. Currency conversion
		//Look up, on the Internet for the exchange rate between SG Dollars and US Dollars. Write a program that works out how many much S$250 is in US$?
		//Write a program that works out how many much US$250 is in S$?
		System.out.println("Exercise 3");
		System.out.println("For 250 SGD, there are " + exerciseThreeSGDToUSD(250) + " dollars in USD");
		
		System.out.println("For 250 USD, there are " + exerciseThreeUSDToSGD(250) + " dollars in SGD");
		System.out.println();
	}
	
	private static void exercise4() {
		// 4. Seconds in a Year
		//Write a program to work out the number of seconds in 365 days.
		System.out.println("Exercise 4");
		final long SECONDS_PER_MINUTE = 60;
		final long MINUTES_PER_HOUR = 60;
		final long HOURS_PER_DAY = 24;
		final long DAYS_PER_YEAR = 365;
		long secsPerYear = 1 * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
		System.out.println("there are " + secsPerYear + " seconds in 1 year.");
		System.out.println();
	}
	
	private static void exercise5() {
		//5. Months in a Millennium
		//Write a program to work out the number of months in a millennium (1000.0 years).
		System.out.println("Exercise 5");
		final double MONTHS_PER_YEAR = 12;
		System.out.println("there are " + 1000.0 * MONTHS_PER_YEAR + " months in a millennium.");
		System.out.println();
	}
	
	private static void exercise6() {
		//6. Bits in a Megabyte
		//Write a program to work out the number of bits in a megabyte.
		System.out.println("Exercise 6");
		// assume it is 1 mb
		long mb = 1;
		System.out.println("there are " + exerciseSixBitsPerMB(mb) + " bits in 1 MB");
		System.out.println();
	}
	
	private static void exercise7() {
		//7. Bits in a Gigabyte
		//Write a program to work out the number of bits in a gigabyte.
		System.out.println("Exercise 7");
		long gb = 1;
		System.out.println("there are " + exerciseSevenBitsPerGB(gb) + " bits in 1 GB");
		System.out.println();
	}
	
	private static void exercise8() {
		//8. Mass Body Index is defined as weight/(height * height). 
		//Write a Java program to calculate your BMI.
		System.out.println("Exercise 8");
		Scanner sc = new Scanner(System.in);
		// reading the input
		double weightInKG = sc.nextDouble();
		double heightInM = sc.nextDouble();
		
		System.out.println("The BMI of " + weightInKG + "KGs and " + heightInM + "Ms is " + exerciseEightBMI(weightInKG, heightInM));
		System.out.println();
	}
	
	private static void exercise9() {
		//9. Inch to cm
		//Write a Java program that asks the user to convert one inch to cm.
		System.out.println("Exercise 9");
		// 1 inch
		double inches = 1;
		System.out.println("there are " + exerciseNineInchToCM(inches) + " cm in 1 inch");
		System.out.println();
	}
	
	private static void exercise10() {
		//10. Cm to Inches
		//Write a Java program that asks the user to convert ten cm to inches.
		System.out.println("Exercise 10");
		// 10 cm
		double cms = 10;
		System.out.println("there are " + exerciseTenCMToInch(cms) + " inches in 10 cm");
		System.out.println();
	}
	
	private static void exercise11() {
		//11. Average of three integers
		//Write a program that declares three integer numbers and then prints out their average. Note that the average of three ints is not necessarily an int.
		System.out.println("Exercise 11");
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the first integer");
		int firstNumber = sc.nextInt();
		System.out.println("please input the second integer");
		int secondNumber = sc.nextInt();
		System.out.println("please input the third integer");
		int thirdNumber = sc.nextInt();
		System.out.println("The average of these 3 integers is "+ exerciseElevenAverage(firstNumber, secondNumber, thirdNumber));
	}
	
	private static void exerciseOneDotOne() {
		//exercise 1.1
		int x = 1;
		x = x+1; 
		// should output integer 2
		System.out.println(x);
	}
	
	private static void exerciseOneDotTwo() {
		//exercise 1.2
		int x = 1;
		x = 2*x;
		x = 2*x;
		// should output integer 4
		System.out.println(x);
	}
	
	private static void exerciseOneDotThree() {
		//exercise 1.3
		int x = 1;
		int y = 3;
		int z;
		z = 2*x +3*y; 
		// should output integer 14 (z = 2 + 9 = 11, y = 3)
		System.out.println(z+y);
	}
	
	private static void exerciseOneDotFour() {
		//exercise 1.4
		 String x = "hello ";
		 x=x+x;
		 // should output a string "hello[space]hello[space]"
		 System.out.println(x);
	}
	
	private static void exerciseOneDotFive() {
		//exercise 1.5
		String x = "hello ";
		int y = 5; 
		// should output a string "hello 5" (addition between strings and numbers in java will be concatenation)
		System.out.println(x+y);
	}
	
	private static void exerciseOneDotSix() {
		//exercise 1.6
	    int x= 11,y=5;
	    int z= x/y; 
	    // should output integer 2, integer division will be rounded down to the closest integer
	    System.out.println(z);
	}
	
	private static void exerciseOneDotSeven() {
		//exercise 1.7
		int x= 11;
		double y=5.0;
		double z= x/y; 
		// should output double 2.2
		System.out.println(z);
	}
	
	private static void exerciseOneDotEight() {
		//exercise 1.8
		int x= 11; 
		try {
			System.out.println(x/0);
		} catch (Exception e) {
			System.out.println("should output an division by zero exception " + e);
		}
	}
	
	private static void exerciseTwoSolution1(String name) {
		System.out.println("naive solution: 3 print statements");
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
	}
	
	private static void exerciseTwoSolution2(String name) {
		System.out.println("naive solution: using a loop");
		for (int i = 0; i < 3; i ++) {
			System.out.println(name);
		}
	}
	
	private static double exerciseThreeSGDToUSD(double sgd) {
		// 1 SGD = 0.73 USD, final means constant in Java
		final double USD_PER_SGD = 0.73;
		return sgd * USD_PER_SGD;
	}
	
	private static double exerciseThreeUSDToSGD(double usd) {
		// 1 USD = 1.36 SGD final means constant in Java
		final double SGD_PER_USD = 1.36;
		return usd * SGD_PER_USD;
	}
	
	private static long exerciseSixBitsPerMB(long mb) {
		final long BITS_PER_BYTE = 8;
		final long BYTES_PER_KB = 1024;
		final long KBS_PER_MB = 1024;
		return mb * BITS_PER_BYTE * BYTES_PER_KB * KBS_PER_MB;
	}
	
	private static long exerciseSevenBitsPerGB(long gb) {
		final long MBS_PER_GB = 1024;
		return exerciseSixBitsPerMB(gb) * MBS_PER_GB;
	}
	
	private static double exerciseEightBMI(double weight, double height) {
		return weight / (height * height);
	}
	
	private static double exerciseTenCMToInch(double cm) {
		final double INCHES_PER_CM = 0.393701;
		return cm * INCHES_PER_CM;
	}
	
	private static double exerciseNineInchToCM(double inch) {
		final double CMS_PER_INCH = 2.54;
		return inch * CMS_PER_INCH;
	}
	
	private static double exerciseElevenAverage(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}
}
