package test;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
for(int i=1; i<=n;i++)
{
	if(n%i==0)
	{
		count++;
	}
}
if(count==2)
{
	System.out.println(n+" is a prime number");
}
else
{
	System.out.println(n+" is not a prime number");
}
	}

}
