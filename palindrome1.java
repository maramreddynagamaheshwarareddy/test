package test;

import java.util.Scanner;

public class palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a,b;
StringBuffer sb;
Scanner scan= new Scanner(System.in);
System.out.println("enter the input :");
a=scan.nextLine();
sb=new StringBuffer(a);
b=sb.reverse().toString();
if(a.equals(b))
{ System.out.println("given string is palindrom");
	}
else
{
	System.out.println("entered string is not palindrom");
}
	}
}
