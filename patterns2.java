package test;

public class patterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
			int n=3;
			int a=1;
			for(int i=1;i<=n;i++)
			{
				for(int j=n-1;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=a;k>=1;k--)
				{
					System.out.print(Math.abs(k-i)+1);
				}
				a+=2;
				System.out.println();
	}
	}
}
