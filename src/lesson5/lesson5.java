package lesson5;

import java.util.*;

public class lesson5 {
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
		exercise12();
		exercise13();
		exercise14();
		exercise15();
		exercise16();
		exercise17();
		exercise18();
		exercise19();
		exercise20();
	}
	
	private static void exercise1() {
		System.out.println("Exercise 1");
		exercise1a();
		exercise1b();
		exercise1c();
		exercise1d();
		exercise1e();
		exercise1f();
		exercise1g();
	}
	
	private static void exercise1a() {
		System.out.println("Exercise 1.1");
		int i = 1;
		while (i <= 15) { // 13,14,15 will do
			System.out.println("Line " + i);
			i += 3; 
		}
	}
	private static void exercise1b() {
		System.out.println("Exercise 1.2");
		for (int x = 2; x <= 10; x += 2) {
			System.out.println("Line " + x); 
		}
	}
	
	private static void exercise1c() {
		System.out.println("Exercise 1.3");
		int count = 5; 
		while (count >= 0) {
			if (count == 3) {
				System.out.println(count + " Ready"); }
			else if (count == 0) {
				System.out.println(count + " Take off"); }
			else { 
				System.out.println(count);
			}
			count = count - 1; 
		}
	}
	
	private static void exercise1d() {
		System.out.println("Exercise 1.4");
		for (int x = 5; x <= 25; x += 5) {
			System.out.println(x + " Stars"); 
		}
	}
	
	private static void exercise1e() {
		System.out.println("Exercise 1.5");
		for (int aaa = 50; aaa > 0; aaa -= 10) {
			System.out.println(aaa);
		}
		for (int bbb = 9; bbb >= 0; bbb --) {
			System.out.println(bbb); 
		}
	}
	
	private static void exercise1f() {
		System.out.println("Exercise 1.6");
		int x = 5;
		while (x < 30) { // x <= 25 or any number less than 30
			System.out.println(x + " Stars"); x+=5;
		}
	}
	
	private static void exercise1g() {
		System.out.println("Exercise 1.7");
		int aaa = 50;
		while (aaa > 0) {
			System.out.println(aaa);
			aaa-=10; 
		}
		int bbb=9;
		while (bbb >= 0) {
			System.out.println(bbb);
			bbb--; 
		}
	}
	
	private static void exercise2() {
		System.out.println("exercise 2");
		int sum = 0; // store the accumulated sum, init to 0 
		double average; // average in double
		int lowerbound = 1; // the lower bound to sum
		int upperbound = 100; // the upper bound to sum
		for (int number = lowerbound; number <= upperbound; ++number) {
			//Some codes here to compute the sum
			sum += number;
		}
		//some codes here to computer the average
		average = (double) sum / (double) (upperbound - lowerbound + 1);
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + average);
	}
	
	private static void exercise3() {
		System.out.println("exercise 3");
		// the answer is already given by the question lol
		int sum = 0; // store the accumulated sum, init to 0 
		double average; // average in double
		int lowerbound = 1; // the lower bound to sum
		int upperbound = 100; // the upper bound to sum
		int number = lowerbound;
		while (number <= upperbound) { 
			sum += number;
			number++; 
		}
		average = (double) sum / (double) (upperbound - lowerbound + 1);
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + average);
	}
	
	private static void exercise4() {
		System.out.println("exercise 4");
		int n = 50000;
		double sum = 0.0;
		int index = 1;
		while (index <= n) {
			sum += 1.0/index;
			index++;
		}
		System.out.println("Harmonic(50000)= "+ sum);
	}
	
	private static void exercise5() {
		System.out.println("exercise 5");
		Fibonacci();
		//fibRelativelyEfficient(20);
		// uncomment the following 2 lines if you really want to see the difference 
		// in terms of performance of 3 solutions
		//benchTest();
		//benchTest2();
	}
	
	private static void benchTest() {
		System.out.println("calculate the 40th Fibnonacci number");
		System.out.println("very slow naive solution");
		long naiveStart = System.nanoTime();
		int fibNaive40 = fibNaive(40);
		long naiveEnd = System.nanoTime();
		System.out.println("Execution time in milliseconds : " + 
				(naiveEnd - naiveStart) / 600000);
		System.out.println("Fib(40) is " + fibNaive40);
		
		System.out.println("relatively efficient solution");
		long moderateStart = System.nanoTime();
		int fibModerate40 = fibRelativelyEfficient(40);
		long moderateEnd = System.nanoTime();
		System.out.println("Execution time in milliseconds : " + 
				(moderateEnd - moderateStart) / 600000);
		System.out.println("Fib(40) is " + fibModerate40);
		
		System.out.println("most efficient solution");
		long efficientStart = System.nanoTime();
		int fibEfficient40 = fibMostEfficient(40);
		long efficientEnd = System.nanoTime();
		System.out.println("Execution time in milliseconds : " + 
				(efficientEnd - efficientStart) / 600000);
		System.out.println("Fib(40) is " + fibEfficient40);
	}
	
	private static void benchTest2() {
		// The difference between O(logN) and O(n) implementation is not very much in small number
		// especially when the implementation of O(logN) is not very efficient (we can use GPU/parallel programming to further optimize the 
		System.out.println("calculate the 600000th Fibnonacci number");
		System.out.println("relatively efficient solution");
		long moderateStart2 = System.nanoTime();
		long fibModerate600000 = fibRelativelyEfficient2(600000);
		long moderateEnd2 = System.nanoTime();
		System.out.println("Execution time in milliseconds : " + 
				(moderateEnd2 - moderateStart2) / 600000);
		System.out.println("Fib(600000) is " + fibModerate600000);
		
		System.out.println("most efficient solution");
		long efficientStart2 = System.nanoTime();
		long fibEfficient600000 = fibMostEfficient2(600000);
		long efficientEnd2 = System.nanoTime();
		System.out.println("Execution time in milliseconds : " + 
				(efficientEnd2 - efficientStart2) / 600000);
		System.out.println("Fib(600000) is " + fibEfficient600000);
	}
	
	private static int fibNaive(int n) {
		if (n <= 2) {
			return 1;
		}
		// recursion (p.s it is very slow, O(2^n))
		return fibNaive(n - 1) + fibNaive(n - 2);
	}
	
	private static void Fibonacci() {
		int previous = 1;
		int previousOfPrevious = 0;
		int current = 0;
		int sum = 0;
		System.out.println("The first 20 Fibonacci numbers are:");
		for (long index = 1; index <= 20; index ++) {
			current = previous + previousOfPrevious;
			sum += previous;
			System.out.print(previous + " ");
			previousOfPrevious = previous;
			previous = current;
		}
		System.out.println();
		System.out.println("The average is " + sum/20.0);
	}
	
	private static int fibRelativelyEfficient(int n) {
		// This is the answer of your ex5, most efficient solution is much beyond your course
		int previous = 1;
		int previousOfPrevious = 0;
		int sum = 0;
		System.out.println("The first " + n + " Fibonacci numbers are:");
		for (long index = 1; index <= n; index ++) {
			sum = previous + previousOfPrevious;
			System.out.print(previous + " ");
			previousOfPrevious = previous;
			previous = sum;
		}
		System.out.println();
		// loop implementation (relatively efficient, O(n))
		return previousOfPrevious;
	}
	
	private static int fibMostEfficient(int n) {
		int[] magicMatrix = {1,1,1,0};
		return matrixPower(magicMatrix, n - 1)[0];
	}
	
	private static int[] matrixPower(int[] a, int p) {
		// log n matrix power implementation
		if (p <= 1) {
			// invalid power
			return a;
		}
		if (p % 2 == 0) {
			// even number a^2n = (a^2)^n
			return matrixPower(matrixMultiply(a, a), p/2);
		}
		// odd number a^(2n + 1) = a * a^2n
		return matrixMultiply(a, matrixPower(a, p-1));
	}
	
	private static int[] matrixMultiply(int[] a, int[] b) {
		// assertion both A and B are 2x2 matrix stored in 1D array with length 4
		int[] result = new int[4];
		result[0] = a[0] * b[0] + a[1] * b[2];
		result[1] = a[0] * b[1] + a[1] * b[3];
		result[2] = a[2] * b[0] + a[3] * b[2];
		result[3] = a[2] * b[1] + a[3] * b[3];
		return result;
	}
	
	private static long fibRelativelyEfficient2(long n) {
		// This is the answer of your ex5, most efficient solution is much beyond your course
		long previous = 1;
		long previousOfPrevious = 0;
		long sum = 0;
		for (int index = 1; index <= n; index ++) {
			sum = previous + previousOfPrevious;
			previousOfPrevious = previous;
			previous = sum;
		}
		// loop implementation (relatively efficient, O(n))
		return previousOfPrevious;
	}
	
	private static long fibMostEfficient2(long n) {
		long[] magicMatrix = {1,1,1,0};
		return matrixPower2(magicMatrix, n - 1)[0];
	}
	
	private static long[] matrixPower2(long[] a, long p) {
		// log n matrix power implementation
		if (p <= 1) {
			// invalid power
			return a;
		}
		if (p % 2 == 0) {
			// even number a^2n = (a^2)^n
			return matrixPower2(matrixMultiply2(a, a), p/2);
		}
		// odd number a^(2n + 1) = a * a^2n
		return matrixMultiply2(a, matrixPower2(a, p-1));
	}
	
	private static long[] matrixMultiply2(long[] a, long[] b) {
		// assertion both A and B are 2x2 matrix stored in 1D array with length 4
		long[] result = new long[4];
		result[0] = a[0] * b[0] + a[1] * b[2];
		result[1] = a[0] * b[1] + a[1] * b[3];
		result[2] = a[2] * b[0] + a[3] * b[2];
		result[3] = a[2] * b[1] + a[3] * b[3];
		return result;
	}
	
	private static void exercise6() {
		System.out.println("exercise 6");
		for (int i = 1; i <= 30; i ++) {
			System.out.println("isPrime(" + i + "): "+ isPrime(i));
		}
		
	}
	
	private static boolean isPrime(int input) {
		if (input <= 1) {
			return false;
		}
		int factor = 2;
		while (factor * factor <= input) {
			if (input % factor == 0) {
				return false;
			}
			factor ++;
		}
		return true;
	}
	
	private static void exercise7() {
		System.out.print("exercise 7");
		exercise7a(4);
		exercise7b(4);
		exercise7c(4);
		exercise7d(4);
		exercise7e(4);
		exercise7f(4);
		exercise7g(3);
	}
	
	private static void exercise7a(int input) {
		System.out.println("exercise 7.a");
		for (int i = 0; i < input; i++) {
			for (int j = 0; j< input; j ++) {
				if (j == 0 || j == input -1) {
					System.out.print("*");
				} else if (i == 0 || i == input -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	private static void exercise7b(int height) {
		System.out.println("exercise 7.b");
		for (int i = 0; i < height; i ++) {
			for (int j = 0; j < height; j ++) {
				if (j < height - i - 1) { 
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	private static void exercise7c(int height) {
		System.out.println("exercise 7.c");
		for (int i = 0; i < height; i ++) {
			for (int j = 0; j < height; j ++) {
				if (j < i) { 
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	private static void exercise7d(int height) {
		System.out.println("exercise 7.d");
		for (int i = 0; i < height; i ++) {
			for (int j = height - i - 1; j > 0; j --) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i  + 1; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void exercise7e(int height) {
		System.out.println("exercise 7.e");
		for (int i = 0; i < height; i ++) {
			for (int j = 0; j < i; j ++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * (height - i) - 1; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void exercise7f(int height) {
		System.out.println("exercise 7.f");
		for (int i = 0; i < height; i ++) {
			for (int j = height - i - 1; j > 0; j --) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i  + 1; k ++) {
				if (k == 0 || k == 2 * i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	private static void exercise7g(int height) {
		System.out.println("exercise 7.g");
		for (int i = 0; i < 2 * height - 1; i ++) {
			int numOfSpace = Math.abs(height - 1 - i);
			for (int j = 0; j < numOfSpace; j ++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * (height - 1 - numOfSpace) + 1; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void exercise8() {
		System.out.println("exercise 8");
		exercise8a();
		exercise8b();
		exercise8c();
	}
	
	private static void exercise8a() {
		System.out.println("exercise 8a");
		System.out.print("Enter Number>"); 
		Scanner in = new Scanner(System.in); 
		int x=in.nextInt();
		for(int i=1;i<x+1;i++)
		System.out.println(i);
	}
	
	private static void exercise8b() {
		System.out.println("exercise 8b");
		int a, b;
		a = 0; b = 0;
		Scanner in = new Scanner(System.in); 
		while (a == b) {
			System.out.println("Enter 2 numbers:");
			a = in.nextInt();
			b = in.nextInt();
			if (a == b) {
				continue;
			}
			int max = a > b ? a : b;
			int min = a < b ? a : b;
			for (int i = min; i < max + 1; i ++) {
				System.out.println(i);
			}
		}
	}
	
	private static void exercise8c() {
		System.out.println("exercise 8c");
		int a, b;
		a = 0; b = 0;
		Scanner in = new Scanner(System.in); 
		while (a == b) {
			System.out.println("Enter 2 numbers:");
			a = in.nextInt();
			b = in.nextInt();
			if (a == b) {
				continue;
			}
			int max = a > b ? a : b;
			int min = a < b ? a : b;
			int i = min;
			while (i <= max) {
				System.out.println(i);
				i++;
			}
		}
	}
	
	private static void exercise9() {
		System.out.println("exercise 9");
		exercise9a();
		exercise9b();
	}
	
	private static void exercise9a() {
		System.out.println("exercise 9a");
		System.out.println("Enter a number:");
		Scanner in = new Scanner(System.in);
		int even = 0;
		int index = in.nextInt();
		for (int i = 0; i < index; i ++) {
			System.out.println(even);
			even += 2;
		}
	}
	
	private static void exercise9b() {
		System.out.println("exercise 9b");
		System.out.println("Enter a number:");
		Scanner in = new Scanner(System.in);
		int odd = 1;
		int index = in.nextInt();
		for (int i = 0; i < index; i ++) {
			System.out.println(odd);
			odd += 2;
		}
	}
	
	private static void exercise10() {
		System.out.println("exercise 10");
		exercise10a();
		exercise10b();
	}
	
	private static void exercise10a() {
		System.out.println("exercise 10a");
		for (int i = 0; i < 11; i ++) {
			for (int j = 0; j < 11; j ++) {
				System.out.print( i * j + " ");
			}
			System.out.println();
		}
	}
	
	private static void exercise10b() {
		System.out.println("exercise 10b");
		int i, j;
		i = 0;
		j = 0;
		while (i < 11) {
			while (j < 11) {
				System.out.print(i * j + " ");
				j ++;
			}
			System.out.println();
			i ++;
			j = 0;
		}
	}
	
	private static void exercise11() {
		System.out.println("exercise 11");
		System.out.println("Enter a number:");
		int index;
		Scanner in = new Scanner(System.in);
		index = in.nextInt();
		for (int i = 0; i < index; i ++) {
			System.out.println(3 * i);
		}
	}
	
	private static void exercise12() {
		System.out.println("exercise 12");
		System.out.println("Enter 2 numbers:");
		int a, b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		for (int i = 0; i < a; i ++) {
			System.out.println(i * b);
		}
	}
	
	private static void exercise13() {
		System.out.println("exercise 13");
		System.out.println("Enter 2 numbers:");
		int a, b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		for (int i = 0; i < a; i ++) {
			System.out.println(i + 1 + " times " + b + " = " + (i + 1) * b);
		}
	}
	
	private static void exercise14() {
		System.out.println("exercise 14");
		exercise14a();
		exercise14b();
	}
	
	private static void exercise14a() {
		System.out.println("exercise 14a");
		System.out.println("Enter 10 numbers:");
		int largest = - 9999999;
		Scanner in = new Scanner(System.in);
		int temp;
		for (int i = 0; i < 10; i ++) {
			temp = in.nextInt();
			if (temp > largest) {
				largest = temp;
			}
		}
		System.out.println("The largest is "+ largest);
	}
	
	private static void exercise14b() {
		System.out.println("exercise 14b");
		System.out.println("Enter 10 numbers:");
		int largest = - 9999999;
		Scanner in = new Scanner(System.in);
		int temp;
		int i = 0;
		while (i < 10) {
			temp = in.nextInt();
			if (temp > largest) {
				largest = temp;
			}
			i ++;
		}
		System.out.println("The largest is "+ largest);
	}
	
	private static void exercise15() {
		System.out.println("exercise 15");
		System.out.println("Enter a number:");
		int count = 0;
		int largest = - 9999999;
		Scanner in = new Scanner(System.in);
		count = in.nextInt();
		int temp;
		int i = 0;
		System.out.println("Enter " + count + " numbers:");
		while (i < count) {
			temp = in.nextInt();
			if (temp > largest) {
				largest = temp;
			}
			i ++;
		}
		System.out.println("The largest is "+ largest);
	}
	
	private static void exercise16() {
		System.out.println("exercise 16");
		int largest = - 9999999;
		Scanner in = new Scanner(System.in);
		int temp = -1;
		while (temp != 0) {
			temp = in.nextInt();
			if (temp == 0) {
				System.out.println(largest);
				return;
			}
			if (temp > largest) {
				largest = temp;
			}
		}
	}
	
	private static void exercise17() {
		System.out.println("exercise 17");
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("guess a number between 0 to 99");
		int result = rd.nextInt(100);
		int guess = -1;
		int count = 0;
		while (result != guess) {
			guess = sc.nextInt();
			count ++;
			if (guess < result) {
				System.out.println("too low - guess again:");
				continue;
			}
			if (guess > result) {
				System.out.println("too high - guess again:");
				continue;
			}
			System.out.println("Correct! The number of guesses you made was " + count);
			break;
		}
	}
	
	private static void exercise18() {
		System.out.println("exercise 18");
		System.out.println("Enter a number (0 - 10):");
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int product = 1;
		for (int i = 1; i< num + 1; i ++) {
			product *= i;
		}
		System.out.println("factorial of " + num + " is " + product);
	}
	
	private static void exercise19() {
		System.out.println("exercise 19");
		System.out.println("Guess a number between (0 - 1000):");
		int low, high, mid;
		Scanner sc = new Scanner(System.in);
		low = 0;
		high = 1000;
		int userInput = 0;
		int count = 0;
		do {
			mid = (low + high)/2;
			System.out.println(mid);
			userInput = sc.nextInt();
			count ++;
			if (count > 10) {
				System.out.println("exceed 10 times, computer loses the game");
				break;
			}
			switch(userInput) {
			case 1:
				System.out.println("computer guesses too low");
				low = mid;
				continue;
			case 2:
				System.out.println("computer guesses too high");
				high = mid;
				continue;
			default:
				System.out.println("computer guesses correctly, " + count + " guesses are used.");
				return;
			}
		} while (low < high);
		System.out.println("no number is found between [0, 1000], user guesses beyond this range");
	}
	
	private static void exercise20() {
		System.out.println("exercise 20");
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("guess a number between 0 to 99");
		int result = rd.nextInt(100);
		int guess = -1;
		int lower = 0;
		int upper = 100;
		int count = 0;
		while (result != guess) {
			guess = sc.nextInt();
			count ++;
			if (count > 10) {
				System.out.println("exceed 10 guesses, you have lost");
				break;
			}
			if (guess < result) {
				lower = guess;
				System.out.println("too low " + "[" + lower+ ", " + upper + "] - guess again:");
				continue;
			}
			if (guess > result) {
				upper = guess;
				System.out.println("too high " + "[" + lower+ ", " + upper + "] - guess again:");
				continue;
			}
			System.out.println("Correct! The number of guesses you made was " + count);
			break;
		}
	}
}
