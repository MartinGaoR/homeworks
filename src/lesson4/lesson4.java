package lesson4;

public class lesson4 {
	public static void run() {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
	}
	
	private static void exercise1() {
		System.out.println("Exercise 1");
		String s, t, h, a; String n, e;
		int i;
		h = "Hello";
		s = " How are you?"; 
		a = "abc";
		System.out.println("h.length() is " + h.length());
		System.out.println("h.substring(1) is " + h.substring(1));
		System.out.println("h.toUpperCase() is " + h.toUpperCase());
		System.out.println("h.toUpperCase().toLowerCase() is " + h.toUpperCase().toLowerCase());
		System.out.println("h.indexOf(\"H\") is " + h.indexOf("H"));
		System.out.println("h.startsWith(\"ell\") is " + h.startsWith("ell"));
		System.out.println("\"Tomorrow\".indexOf(\"o\") is " + "Tomorrow".indexOf("o"));
		System.out.println("\"Tomorrow\".indexOf(\"o\", 3) is " + "Tomorrow".indexOf("o", 3));
		System.out.println("\"Tomorrow\".lastIndexOf('o') is " + "Tomorrow".lastIndexOf('o'));
		System.out.println("\"Tomorrow\".substring(2,4) is " + "Tomorrow".substring(2,4));
		System.out.println("a.length() + a is " + (a.length() + a));
		System.out.println("\"a = \\\"\" + a + \"\\\"\" is "+ ("a = \"" + a + "\""));
		System.out.println("(a.length() + a).startsWith(\"a\")  is " + (a.length() + a).startsWith("a"));
		System.out.println("a.length() + a.startsWith(\"a\") is " + a.length() + a.startsWith("a"));
		System.out.println("“>>>” + a.length() + a.startsWith(“a”) is " + ">>>" + a.length() + a.startsWith("a"));
		System.out.println("a.substring(1,3).equals(\"bc\") is " + a.substring(1,3).equals("bc"));
		System.out.println("a.substring(1,3) == \"bc\" is " + a.substring(1,3) == "bc");
		System.out.println("\"a\".compareTo(\"a\") is " + "a".compareTo("a"));
		System.out.println("\"a\".compareTo(\"A\") is " + "a".compareTo("A"));
		System.out.println("s.trim().charAt(2) is " + s.trim().charAt(2));
		System.out.println("\"*\"+s.trim()+\"*\" is " + "*"+s.trim()+"*");
		System.out.println();
	}
	
	private static void exercise2() {
		System.out.println("Exercise 2");
		int i = 7;
		int j = -9; 
		double x = 72.3; 
		double y = 0.34; 
		String n = "3.2";
		System.out.println("|" + i + "| is " + Math.abs(i));
		System.out.println("|" + j + "| is " + Math.abs(j)); 
		System.out.println("|" + x + "| is " + Math.abs(x)); 
		System.out.println("|" + y + "| is " + Math.abs(y)); 
		System.out.println("System.out.println(\"|\" + n + \"| is \" + Math.abs(n)); is not a valid statement because n is not an integer");
		System.out.println("The ceiling of " + i + " is " + Math.ceil(i)); 
		System.out.println("The ceiling of " + j + " is " + Math.ceil(j)); 
		System.out.println("The ceiling of " + x + " is " + Math.ceil(x)); 
		System.out.println("The ceiling of " + y + " is " + Math.ceil(y));
		System.out.println("The floor of " + i + " is " + Math.floor(i)); 
		System.out.println("The floor of " + j + " is " + Math.floor(j)); 
		System.out.println("The floor of " + x + " is " + Math.floor(x)); 
		System.out.println("The floor of " + y + " is " + Math.floor(y)); 
		System.out.println("The floor of -0.1 is " + Math.floor(-0.1));
		System.out.println("min(" + i + "," + j + ") is " + Math.min(i,j)); 
		System.out.println("min(" + x + "," + y + ") is " + Math.min(x,y)); 
		System.out.println("min(" + i + "," + x + ") is " + Math.min(i,x)); 
		System.out.println("min(" + y + "," + j + ") is " + Math.min(y,j));
		System.out.println("max(" + i + "," + j + ") is " + Math.max(i,j)); 
		System.out.println("max(" + x + "," + y + ") is " + Math.max(x,y)); 
		System.out.println("max(" + i + "," + x + ") is " + Math.max(i,x)); 
		System.out.println("max(" + y + "," + j + ") is " + Math.max(y,j)); 
		System.out.println("System.out.println(\"max(\" + y + \",\" + j + \") is \" + Math.max(y,j,x)); is not a valid statement because Math.max does not accept 3 parameters");
		System.out.println("Pi is " + Math.PI); System.out.println("e is " + Math.E);
	
		double angle = 45.0 * Math.PI/180.0; 
		System.out.println("cos(" + angle + ") is " + Math.cos(angle)); 
		System.out.println("sin(" + angle + ") is " + Math.sin(angle));
		System.out.println("exp(1.0) is " + Math.exp(1.0)); 
		System.out.println("exp(10.0) is " + Math.exp(10.0)); 
		System.out.println("exp(0.0) is " + Math.exp(0.0)); 
		System.out.println("log(1.0) is " + Math.log(1.0)); 
		System.out.println("log(10.0) is " + Math.log(10.0)); 
		System.out.println("log(Math.E) is " + Math.log(Math.E));
		System.out.println("pow(2.0, 2.0) is " + Math.pow(2.0,2.0)); 
		System.out.println("pow(10.0, 3.5) is " + Math.pow(10.0,3.5)); 
		System.out.println("pow(8, -1) is " + Math.pow(8,-1)); 
		System.out.println("Square root of 4 is " + Math.sqrt(4)); 
		System.out.println("Square root of -1 is " + Math.sqrt(-1));
		System.out.println("A random number: " + Math.random()); 
		System.out.println("A random number: " + Math.random()*10); 
		System.out.println("System.out.println(\"A random number: \" + Math.random(3)); is not a valid statement because Math.random() does not accept any parameters");
		System.out.println();
	}
	
	private static void exercise3() {
		System.out.println("Exercise 3");
		System.out.println("Math.abs(\"hello\") is not a correct statement");
		System.out.println("Math.abs(\"hello\".length()) is " + Math.abs("hello".length()));
		System.out.println("Math.abs(\"hello\".length())+5 is " + (Math.abs("hello".length())+5));
		System.out.println("\"fruit\".charAt( Math.abs(\"hello\".length())-3) is " + "fruit".charAt( Math.abs("hello".length())-3));
		System.out.println("\"boy\".compareTo(6) is not a correct statement");
		System.out.println("\"boy\".compareTo(\"girl\") is " + "boy".compareTo("girl"));
		System.out.println("\"boy\".compareTo(\"6\") is " + "boy".compareTo("6"));
		System.out.println("\"boy\".compareTo(\"6\")+17 is "+ ("boy".compareTo("6")+17));
		System.out.println("\"boy\".replace(’b’,\"soup\".charAt(0)) is not a correct statement");
		System.out.println("(\"boy\".replace(’b’,\"soup\".charAt(0))).length() is not a correct statement");
		System.out.println();
	}
	
	private static void exercise4() {
		System.out.println("Exercise 4");
		System.out.println("the value of \"3.2\" is " + Double.valueOf("3.2"));
	}
}
