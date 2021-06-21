package test;

import java.util.Scanner;

public class squareroot1 {

    public static double squareRoot(int number) {
	double temp;

	double sr = number / 2;

	do {
		temp = sr;
		sr = (temp + (number / temp)) / 2;
	} while ((temp - sr) != 0);

	return sr;
    }
    public static void main(String[] args)  
    { 
	System.out.print("Enter any number:");
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt(); 

	System.out.println("Square root of "+ num+ " is: "+squareRoot(num));
    } 
}
