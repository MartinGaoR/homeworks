package lesson6;

import java.util.Scanner;

public class lesson6 {
	public static void run() {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
	}
	
	private static void exercise1() {
		System.out.println("exercise 1");
		String heading1 = "Exam_Name";
		String heading2 = "Exam_Grade";
		String divider = "---------------------------------";
		
		String course1 = "Java";
		String course2 = "PHP";
		String course3 = "VB NET";
		String grade1 = "A";
		String grade2 = "B";
		String grade3 = "A";
		System.out.println();
		System.out.printf("%-15s %15s %n", heading1, heading2);
		System.out.println(divider);
		
		System.out.printf("%-15s %10s %n", course1, grade1);
		System.out.printf("%-15s %10s %n", course2, grade2);
		System.out.printf("%-15s %10s %n", course3, grade3);
		System.out.println(divider);
		System.out.println();
	}
	
	private static void exercise2() {
		System.out.println("exercise 2");
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int count = 0;
		for (int i = 0; i < input.length(); i ++) {
			if (input.charAt(i) == 'a') {
				count ++;
			}
		}
		System.out.println("number of a in the input is " + count);
	}
	
	private static void exercise3() {
		System.out.println("exercise 3");
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] counts = new int[26];
		for (int i = 0; i < 26; i ++) {
			counts[i] = 0;
		}
		for (int i = 0; i < input.length(); i ++) {
			counts[input.charAt(i) - 'a'] ++;
		}
		System.out.println("number of a in the input is " + counts['a' - 'a']);
		System.out.println("number of e in the input is " + counts['e' - 'a']);
		System.out.println("number of i in the input is " + counts['i' - 'a']);
		System.out.println("number of o in the input is " + counts['o' - 'a']);
		System.out.println("number of u in the input is " + counts['u' - 'a']);
	}
	
	private static void exercise4() {
		System.out.println("exercise 4");
		System.out.println("How Many Numbers for each table?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Up to which times table?");
		int m = sc.nextInt();
		for (int i = 1; i < m + 1; i ++) {
			for (int j = 1; j < n + 1; j ++) {
				System.out.println(j + " times " + i + " = " + i * j);
			}
		}
	}
	
	private static void exercise5() {
		System.out.println("exercise 5");
		System.out.println("Input m:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Input n:");
		int n = sc.nextInt();
		int product = 0;
		for (int i = 0; i < n; i++) {
			product += m;
		}
		System.out.println("product is " + product);
	}
	
	private static void exercise6() {
		System.out.println("exercise 6");
		System.out.println("Input m:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Input n:");
		int n = sc.nextInt();
		int power = 1;
		for (int j = 1; j < n + 1; j++) {
			int product = 0;
			for (int i = 0; i < m; i++) {
				product += power;
			}
			power = product;
		}
		System.out.println("power is " + power);
	}
}
