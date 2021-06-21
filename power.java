package test;

import java.util.Scanner;

public class power {
	static boolean isPowerOfTwo(int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value");
		int n1=sc.nextInt();
	    if(n1==0)
	    return false;
	 
	return (int)(Math.ceil((Math.log(n1) / Math.log(2)))) ==
	       (int)(Math.floor(((Math.log(n1) / Math.log(2)))));
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    if(isPowerOfTwo(31))
	    {
	    System.out.println("it is power of 2");
	    }
	    else
	    {
	    System.out.println("it is not power of 2");
	    }
	}
	}
