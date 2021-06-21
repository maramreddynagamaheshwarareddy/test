package test;
import java.util.Scanner;
public class palindrom2 {

	public static void main(String[] args) {
	
		    Scanner sc = new Scanner(System.in);
		     System.out.print("Enter the number ");
		     int num= sc.nextInt();
		     int sum = 0;
		     int r;
			 int temp = num;    
		     while(num>0)
			   {    
		        r = num % 10;   
		        sum = (sum*10)+r;    
		        num = num/10;    
		       }    
		      if(temp==sum)    
		        System.out.println(temp +" is a Palindrome number.");    
		      else    
		        System.out.println(temp +" is not a palindrome");    
		     }  
		

	}