package test;

public class patterns1 {
	public static void main(String[] args)
	{
		int n=4;
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<a;k++)
			{
				System.out.print(a-i);
			}
			a+=2;
			System.out.println();
		}
		
	}

}
