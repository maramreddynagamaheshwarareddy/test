package test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class removingduplicates {

	//public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
int arr[] = new int[20];
int arra[]=new int[20];
int n,i,j;
int count=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter the array");
n=scan.nextInt();
System.out.println("enter the "+n+"array elements");
for(i=0;i<n;i++)
{
	arr[i]=scan.nextInt();
}
System.out.println("elements in array");
for(i=0;i<n;i++)
{
	System.out.println(arr[i]+" ");
}
for(i=0;i<n;i++)
{
	for(j=0;j<count;j++)
	{
		if (arr[i] ==arra[j])
		break;
	}
	if(j==count)
	{
		arra[count]=arr[i];
		count++;
	}
	System.out.println("\n no duplicates");
	for(i=0;i<count;i++)
	{
		System.out.println(arra[i]+" ");
	}
}
	}*/
		public static void removeDuplicates(int[] a)
	    {
	        LinkedHashSet<Integer> set
	            = new LinkedHashSet<Integer>();
	  
	        // adding elements to LinkedHashSet
	        for (int i = 0; i < a.length; i++)
	            set.add(a[i]);
	  
	        // Print the elements of LinkedHashSet
	        System.out.print(set);
	    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	        int a[] = {5,2,6,8,6,7,5,2,8};
	      
	        // Function call
	        removeDuplicates(a);
	    }
	}

