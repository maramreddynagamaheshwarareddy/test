package test;

import java.util.Scanner;

public class oddnumberinarray {
	   public static void main(String[] args)  
	    { 
	        Scanner sr = new Scanner(System.in);
	        System.out.print("enter the array size");
	        int n = sr.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = sr.nextInt();
	        }
	        int val = arr[0];
	        for(int i=1;i<n;i++)
	        {
	          //XOR of each element so that we can find the number occurring odd number of times
	          val = val^arr[i];
	        }
	        System.out.println(val);
	    }
}
