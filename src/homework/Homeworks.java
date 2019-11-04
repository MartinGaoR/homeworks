package homework;

import java.util.Scanner;

public class Homeworks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lesson number:");
		int id = sc.nextInt();
		switch (id) {
		case 1:
			System.out.println("running lesson 1 exercise");
			lesson1.lession1.run();
			break;
		case 2:
			System.out.println("running lesson 2 exercise");
			lesson2.lesson2.run();
			break;
		default:
			System.out.println("invalid lesson number, program exited");
		}
	}
}
