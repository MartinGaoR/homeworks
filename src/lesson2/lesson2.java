package lesson2;

import java.util.Scanner;

public class lesson2 {

	public static void run() {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
		exercise7();
	}
	
	private static void exercise1() {
		/*
		 * 1. What would be the appropriate type for variables that represent each of the following:
		 * a) The number of students in your class.
		 * b) The average number of students per class in your college.
		 * c) Whether a person has a degree.
		 * */
		System.out.println("Exercise 1");
		// 学生个数明显就是一个整数
		System.out.println("The number of students in your class should be an INTEGER (int)");
		// 学生个数的平均数可以是一个非整数，也就是可以用float或者double去表达都okay
		System.out.println("The average number of students per class in your college should be a float or a double");
		// 一个人是否有一个学位这个参数只能用boolean去表达，因为只有true和false两种可能
		System.out.println(" Whether a person has a degree is a boolean");
		System.out.println();
	}
	
	private static void exercise2() {
		/*
		 * 2. Which of the following is the correct representation of the equation (a + b)(a – b) in Java?
		 * a) a + b * a – b;
		 * b) (a + b) * (a – b);
		 * c) (a + b)(a – b);
		 * d) a + ba – b;
		 * */
		System.out.println("Exercise 2");
		System.out.println("B");
		// 解释： java里面是不支持括号之间默认乘号这样的写法的，所以c d都是错的
		// 然后java中乘法的优先度是大于加减法的，所以a 也是错的。
		System.out.println();
	}
	
	private static void exercise3() {
		/*
		 * 3. Spot the mistakes
		 * a. int height = 1.72;
		 * b. double if = 812348;
		 * c. boolean valid = False;
		 * d. String myAge = 30;
		 * e. String myname = John Tan;
		 * f. char letter = "G";
		 * g. string msg = "how are you”;
		 * h. int age = 81.0;
		 * i. double my&weight = 78.2;
		 * */
		System.out.println("Exercise 3");
		System.out.println("a. int height = 1.72, int变量（variable）不能用非整数去初始化");
		System.out.println("b. double if = 812348; if是保留词（reserved words），所以不能被用做变量名字");
		System.out.println("c. boolean vaild = False； false才是正确的保留词常数，大写的F将不被认可，True 同理。 （p.s boolean的变量最好用is，has，does开头， 如 isValid)");
		System.out.println("d. String myAge = 30; 字符串（string）和整数的类型不吻合，正确的是 String myAge = \"30\"");
		System.out.println("e. String myName = John Tan; 字符串表达方式不对，需要以双引号包围, 如\"John Tan\"");
		System.out.println("f。char letter = \"G\"; 字符（char）需要以单引号包围‘G'");
		System.out.println("g. string msg = \"how are you\"; 是String 而不是string，大小写有区分");
		System.out.println("h. int age = 81.0; 理由同a， 81.0也不是一个整数");
		System.out.println("i. double my&weight = 78.2; 变量（variable）命名规则有错，不能包含除_外的特殊符号");
		System.out.println();
	}
	
	private static void exercise4() {
		/*
		 * 4. What is the output? 
		 * int num1 = 4;
		 * int num2 = 6;
		 * System.out.println("The sum is ”+num1 + num2); 
		 * System.out.println("The sum is ”+(num1 + num2));
		 * */
		System.out.println("Exercise 4");
		int num1 = 4;
		int num2 = 6;
		// The sum is 46
		System.out.println("The sum is " + num1 + num2);
		// The sum is 10
		System.out.println("The sum is " + (num1 + num2));
		System.out.println("在java中， 如果出现string + 非string（如数字）的情况下， 非数字将会以字符串的形式被叠加到字符串后面");
		System.out.println("也就是说，按照java 加法的优先级，第一句println的操作等同于以下程序");
		System.out.println("String s = \"The sum is \";\ns = s + num1;\ns = s + num2;\nSystem.out.println(s);");
		String s = "The sum is ";
		s = s + num1;
		s = s + num2;
		System.out.println(s);
		System.out.println();
	}
	
	private static void exercise5() {
		/*
		 * 5. Write Java codes to get input the name, height (in m) and weight (in kg) of a person from the keyboard. Calculate and display the Body Mass Index (BMI) of that person.
		 * BMI = weight/height^2
		 */
		System.out.println("Exercise 5");
		System.out.print("Enter name: ");
		String name = "";
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.print("Enter height (in m): ");
		double height = sc.nextDouble();
		System.out.print("Enter weight (in kg): ");
		double weight = sc.nextDouble();
		
		System.out.println();
		System.out.println("Body Mass Index Report for " + name);
		System.out.printf("Height: %.2fm\n", height);
		System.out.printf("Weight: %.1fkg\n", weight);
		System.out.printf("BMI Index : %.15f\n", weight/height/height);
		System.out.println();
	}
	
	private static void exercise6() {
		/*
		 * Design and develop the Sports Training Calculator computer program
		 * */
		System.out.println("Exercise 6");
		final int MAX_POSSIBLE_HEART_RATE = 220;
		int age, heartRateRest;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		age = sc.nextInt();
		System.out.print("Enter your rest heart rate:");
		heartRateRest = sc.nextInt();
		int heartRateMax = MAX_POSSIBLE_HEART_RATE - age;
		double ratio = Double.valueOf(heartRateMax) / Double.valueOf(heartRateRest);
		double result = 15 * ratio;
		System.out.println();
		System.out.printf("The calculated VO2Max is %.4f mL/(kg·min). (in 4 decimal places)\n", result);
		System.out.println();
	}
	
	private static void exercise7() {
		/*
		 * 7. Write Java codes to input two integers from the keyboard. 
		 * Assign the two integers to two variables “a” and “b”. 
		 * Swap the value of a and b. Print the value of a and b
		 * */
		System.out.println("Exercise 7");
		int a, b, temp1, temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		a = sc.nextInt();
		System.out.println("Enter b:");
		b = sc.nextInt();
		temp1 = a;
		temp2 = b;
		System.out.println("initally a is " + a + " and b is " + b);
		
		// Method 1 - swap the value in a and b using a third valuable c
		int c = a;
		a = b;
		b = c;
		System.out.println("after method 1 swap, a is " + a + " and b is " + b);
		// reset the value
		a = temp1;
		b = temp2;
		// Method 2 - swap the value in a and b without using any extra valuable
		a = a ^ b ^ ( b = a );
		// so it will be equal to
		// assign the value of a to b and mark this value to temp1
		// and use this value to bit-wise XOR to b 
		// this means 2 cases:
		// for all the bits both a and b have, they will be turned off since 1 XOR 1 = 0
		// for all the bits that either a or b have, they will be turned on since 0 XOR 1 = 1 and 1 XOR 0 = 1
		// then mark the result of previous step to temp2
		// and use the value of temp2 to bit-wise XOR to a
		// this means 3 cases:
		// for all the bits both b and a have, they will be turned on, since they were turned off previously and 1 XOR 0 = 1
		// for all the bits only a has and b doesn't, they will be turned off, since they were turned off previously and 1 XOR 1 = 0
		// all all the bits only b has but a doesn't, they will be turned on, since they were turned on previously and 0 XOR 1 = 1
		// this will ultimately give the result of original b value and assign it back to a
		System.out.println("after method 2 swap, a is " + a + " and b is " + b);
		System.out.println();
	}
}
