package module4;

import java.util.Scanner;

public class Emp {
	private int empNo;
	private String ename;
	private double bal;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter value for emp no, ename, bal");
		empNo = sc.nextInt();
		ename = sc.next();
		bal = sc.nextDouble();
	}

	public void display() {
		System.out.println("emp no is: " + empNo);
		System.out.println("emp name is: " + ename);
		System.out.println("emp bal is: " + bal);
	}

	public void checkEmpNo() {
		if (empNo > 0)
			System.out.println("Valid empNo");
		else
			System.out.println("Invalid empNo");
	}

	public void checkBal() {
		if (bal > 0 && bal < 10000)
			System.out.println("valid Balance");
		else
			System.out.println("Invalid Balance");

	}
}
