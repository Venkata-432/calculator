package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		
		double z=x+y;
		
	  System.out.println("The resultant value of z= "+z);
	}
}
