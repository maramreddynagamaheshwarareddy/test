package test;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "this is reverse of string ";
		  String revString = "";

		  for (int i = str.length() - 1; i >= 0; --i) {
		   revString += str.charAt(i);
		  }

		  System.out.println(revString);
	}

}
