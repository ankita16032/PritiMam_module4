package module4;

import java.util.Scanner;

public class User {

	private String name;
	private int age;
	private double sal;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter name age and sal");
		name = sc.next();
		age = sc.nextInt();
		sal = sc.nextDouble();
	}

	public void checkAge() {
		if (age > 18)
			System.out.println("you are eligible to vote..");
		else if (age > 18 && age <= 100)
			System.out.println("valid Age..");
		else
			System.out.println("Invalid Age");
	}

	public void checkSal() {
		if (sal > 0 && sal < 100000)
			System.out.println("valid sal...");
		else
			System.out.println("Invalid sal");
	}

	public void display() {
		System.out.println("Name is: " + name);
		System.out.println("age is: " + age);
		System.out.println("salary is: " + sal);
	}

}
