package lesson3;

import java.util.Scanner;

class exerciseInput {
	boolean status;
	int ivalue;
	double dvalue;
	
	exerciseInput(boolean s, int i, double d) {
		status = s;
		ivalue = i;
		dvalue = d;
	}
	
	// this is overriding the general toString() method which converts an object to a string
	public String toString() {
		return "The input is { status: " + this.status + "; ivalue: " + this.ivalue + "; dvalue: " + this.dvalue + " }";
	}
}

class exerciseBooleanInput {
	boolean p,q;
	
	exerciseBooleanInput(boolean p, boolean q) {
		this.p = p;
		this.q = q;
	}
	
	public String toString() {
		return "The input is { p: " + this.p + " ; q: " + this.q + " }";
	}
}

public class lesson3 {
	public static void run() {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
		exercise7();
		exercise8();
		exercise9();
		exercise10();
		exercise11();
	}
	
	private static void exercise1() {
		System.out.println("Exercise 1");
		//1. Study the following code and determine the output based on the given sets of values.
		exerciseInput[] inputs = {
				new exerciseInput(true, 8, 12),
				new exerciseInput(true, 13, 8),
				new exerciseInput(false, 7, 11),
				new exerciseInput(false, 12, 7),
		};
		
		for (exerciseInput i : inputs ) {
			System.out.println(i);
			runExerciseOneCode(i.status, i.ivalue, i.dvalue);
			System.out.println();
		}
		System.out.println();
	}
	
	private static void exercise2() {
		System.out.println("Exercise 2");
		//2. Study the following code and determine the output based on the given sets of values
		exerciseInput[] inputs = {
				new exerciseInput(true, 8, 12),
				new exerciseInput(true, 13, 8),
				new exerciseInput(false, 7, 11),
				new exerciseInput(false, 12, 7),
		};
		for (exerciseInput i : inputs ) {
			System.out.println(i);
			runExerciseTwoCode(i.status, i.ivalue, i.dvalue);
			System.out.println();
		}
		System.out.println();
	}
	
	private static void exercise3() {
		System.out.println("Exercise 3");
		//3. Study the following code and determine the output based on the given sets of values
		exerciseInput[] inputs = {
				new exerciseInput(true, 8, 12),
				new exerciseInput(true, 13, 8),
				new exerciseInput(false, 7, 11),
				new exerciseInput(false, 12, 7),
		};
		for (exerciseInput i : inputs ) {
			System.out.println(i);
			runExerciseThreeCode(i.status, i.ivalue, i.dvalue);
			System.out.println();
		}
		System.out.println();
	}
	
	private static void exercise4() {
		System.out.println("Exercise 4");
		//4. Study what is wrong with the logic of the following code?
		int a = 0; // value of a doesn't matter
		if (a > 8 && a < 6) {
			// not possible to have a value both greater than 8 and less than 6
			System.out.println("not possible");
		} else {
			System.out.println("it will always go to here");
		}
		System.out.println();
	}
	
	private static void exercise5() {
		System.out.println("Exercise 5");
		// 5.Determine if the condition is True or False
		// Assume that a=5, b=10, status=false;
		int a = 5;
		int b = 10;
		boolean status = false;
		System.out.println("value of a<5 && b<10 || status is " + (a<5 && b<10 || status));
		System.out.println("value of a>=5 || status && b<= 10 is " + (a>=5 || status && b<= 10));
		System.out.println("value of a>5 && status && b< 10 is " + (a>5 && status && b< 10));
		System.out.println("value of a>=5 || status && b< 10 is " + (a>=5 || status && b< 10));
		System.out.println("value of (a==5 || status) && b< 10 is " + ((a==5 || status) && b< 10));
		System.out.println("value of (a<5 && b<10) && status is " + ((a<5 && b<10) && status));
		System.out.println("value of (a<5 && b<=10) && !status is " + ((a<5 && b<=10) && !status));
		System.out.println("value of a>=5 ||! status && b<10 is " + (a>=5 ||! status && b<10));
		System.out.println("value of a==5 && !status || b>= 10 is " + (a==5 && !status || b>= 10));
		System.out.println();
	}
	
	private static void exercise6() {
		System.out.println("Exercise 6");
		//6.Write codes to ask the user to input his weight and height. 
		//Display the category of the user using the following table. 
		//(BMI = weight(kg)/height(m)2)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight in kGs:");
		double weight = sc.nextDouble();
		System.out.print("Enter the height in meters:");
		double height = sc.nextDouble();
		double bmi = getBMI(weight, height);
		if (bmi >= 30) {
			System.out.println("Obese\n");
			return;
		}
		if (bmi >= 25.0) {
			System.out.println("Overweight\n");
			return;
		}
		if (bmi >= 20.0) {
			System.out.println("Ideal\n");
			return;
		}
		System.out.println("UnderWeight\n");
	}
	
	private static void exercise7() {
		System.out.println("Exercise 7");
		//7.Truth Table for Implication
		//Write a program to work out and prints out the truth table for implication. Use the fact that
		//p implies q = (!p) or q.
		
		exerciseBooleanInput[] inputs = {
				new exerciseBooleanInput(true, true),
				new exerciseBooleanInput(true, false),
				new exerciseBooleanInput(false, true),
				new exerciseBooleanInput(false, false),
		};
		
		for (exerciseBooleanInput i : inputs) {
			System.out.println(i + " and p implys q is " + imply(i.p, i.q) + " and (!p) or q is " + ((!i.p)||i.q));
		}
		System.out.println();
	}
	
	private static void exercise8() {
		//8.Sorting Two Numbers (Using if else and condition statement)
		//Write a program that asks the user to enter two numbers and then prints them out in:
		//a. ascending order
		//b. descending order
		System.out.println("Exercise 8");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number a:");
		int a = sc.nextInt();
		System.out.print("Enter number b:");
		int b = sc.nextInt();
		System.out.println("solution a in ascending order:");
		sortTwoNumberA(a,b,true);
		System.out.println("solution a in descending order:");
		sortTwoNumberA(a,b,false);
		System.out.println("solution b in ascending order:");
		sortTwoNumberB(a,b,true);
		System.out.println("solution b in descending order:");
		sortTwoNumberB(a,b,false);
		System.out.println();
	}
	
	private static void exercise9() {
		//9.Sorting Three Numbers (Using if else and condition statement)
		//Write a program that asks the user to enter three numbers and then prints them out in
		//a. ascending order.
		//b. descending order.
		System.out.println("Exercise 9");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number a:");
		int a = sc.nextInt();
		System.out.print("Enter number b:");
		int b = sc.nextInt();
		System.out.print("Enter number c:");
		int c = sc.nextInt();
		// ascending order
		sortThreeNumber(a, b, c, true);
		// descending order 
		sortThreeNumber(a, b, c, false);
		System.out.println();
	}
	
	private static void exercise10() {
		//10. Validating One Input
		//Write a program that asks the user to enter an exam mark. This mark must be between zero
		//and 100. If they do, then print out the number. If they don’t, print “Invalid input!”.
		System.out.println("Exercise 10");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the exam mark:");
		int mark = sc.nextInt();
		validate(mark);
		System.out.println();
	}
	
	private static void exercise11() {
		//11. Validating Two Inputs
		//Write a program that asks the user to enter an exam mark. This mark must be between zero and 100. If the user does not do this, say “Invalid exam marks” and exit the program. If the user does this correctly, then ask for a coursework mark which must also be between zero and 100. If this is also correct then write out the average of the two marks; otherwise,
		//say ”Invalid coursework marks”.
		System.out.println("Exercise 11");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the exam mark:");
		int mark = sc.nextInt();
		System.out.print("Enter the coursework mark:");
		int coursework = sc.nextInt();
		validateTwoInputs(mark, coursework);
		System.out.println();
	}
	
	private static void runExerciseOneCode(boolean status, int ivalue, double dvalue) {
		// this is the piece of code of question 1 in exercise 3
		if (ivalue > 10) {
			System.out.println("A");
			if (status) {
				System.out.println("Status On");
			} else {
				System.out.println("Status Off");
			}
		} else if (dvalue < 10) {
			System.out.println("B");
		}
	}
	
	private static void runExerciseTwoCode(boolean status, int ivalue, double dvalue) {
		if (status) {
			System.out.println("Status On");
			if (ivalue > 10 && dvalue < 10 ) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		} else {
			System.out.println("Status Off");
		}
	}
	
	private static void runExerciseThreeCode(boolean status, int ivalue, double dvalue) {
		if (status) {
			System.out.println("Status On");
			if (ivalue > 10 || dvalue < 10 ) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		} else {
			System.out.println("Status Off");
		}
	}
	
	private static double getBMI(double weightInKGs, double heightInMeters) {
		return weightInKGs / heightInMeters / heightInMeters;
	}
	
	private static boolean imply(boolean p, boolean q) {
		// this is to explain how implication works
		if (p && q) {
			// if p is true and q is true,
			// for example if i get 100 marks in the exam and you will give me 100 dollars
			// then for the both event "i get 100 marks in the exam" and the event "you give me 100 dollars"
			// are true, this means the event "i get 100 marks in the exam" implies "you give me 100 dollars"
			return true;
		}
		if (!p && !q) {
			// if p is not true and q is not true,
			// reuse the example of "i get 100 marks in the exam" and "you will give me 100 dollars"
			// if i did not get 100 marks in the exam, so that you don't give me 100 dollars
			// this also satisfies the event "i get 100 marks in the exam" implies "you give me 100 dollars"
			return true;
		}
		if (!p && q) {
			// if p is not true and q is true
			// reuse the example of "i get 100 marks in the exam" and "you will give me 100 dollars"
			// in this case, even though i did not get 100 marks in the exam, but you still
			// hold the promise of giving me 100 dollars, so the implication cannot not be false (will explain how it is false in the end)
			return true;
		}
		// if p is true but q is not true
		// in this case, i get 100 marks in the exam, but you failed to hold the promise of giving me 100 dollars
		// so which means the statement "if i get 100 marks in the exam, then you will give me 100 dollars" (p implies q) is false
		return false;
	}
	
	private static void sortTwoNumberA(int a, int b, boolean isAscending) {
		// using if-else statement
		if (isAscending) {
			if (a < b) {
				System.out.println("Sorting " + a + " and " + b + " in ascending order is " + a + " " + b);
				return;
			}
			System.out.println("Sorting " + a + " and " + b + " in ascending order is " + b + " " + a);
			return;
		}
		if (a > b) {
			System.out.println("Sorting " + a + " and " + b + " in descending order is " + a + " " + b);
			return;
		}
		System.out.println("Sorting " + a + " and " + b + " in descending order is " + b + " " + a);
		return;
	}
	
	private static void sortTwoNumberB(int a, int b, boolean isAscending) {
		// using condition statement
		String result = "Sorting " + a + " and " + b + " in ";
		result += (isAscending?"ascending":"descending");
		result += " order is ";
		result += (isAscending && a > b? b + " " + a:isAscending||a > b ?a + " "+ b:b + " "+ a);
		System.out.println(result);
	}
	
	private static void sortThreeNumber(int a, int b, int c, boolean isAscending) {
		int first, second, third;
		if (isAscending) {
			if (a < b) {
				if (a < c) {
					first = a;
					second = b < c ? b : c;
					third = b < c ? c : b;
				} else {
					first = c;
					second = a;
					third = b;
				}
			} else {
				if (b < c) {
					first = b;
					second = a < c ? a : c;
					third = a < c ? c: a;
				} else {
					first = c;
					second = b;
					third = a;
				}
			}
		} else {
			if (a > b) {
				if (a > c) {
					first = a;
					second = b > c ? b : c;
					third = b > c ? c : b;
				} else {
					first = c;
					second = a;
					third = b;
				}
			} else {
				if (b > c) {
					first = b;
					second = a > c ? a : c;
					third = a > c ? c: a;
				} else {
					first = c;
					second = b;
					third = a;
				}
			}
		}
		String result = "Sorting " + a + " and " + b + " and " + c + " in ";
		result += (isAscending?"ascending":"descending");
		result += " order is ";
		result += first + " " + second + " " + third;
		System.out.println(result);
	}
	
	private static void validate(int input) {
		if (input < 0 || input > 100) {
			System.out.println("Invalid input!");
			return;
		}
		System.out.println(input);
	}
	
	private static void validateTwoInputs(int mark, int coursework) {
		if (mark < 0 || mark > 100) {
			System.out.println("Invalid exam marks");
			return;
		}
		if (coursework < 0 || coursework > 100) {
			System.out.println("Invalid coursework marks");
			return;
		}
		double average = (Double.valueOf(mark) + Double.valueOf(coursework))/ 2.0;
		System.out.println(average);
	}
}

