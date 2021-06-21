package test;

public class secondhighestnumber {
	 public static void main(String args[]){
	      int a, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               a = array[i];
	               array[i] = array[j];
	               array[j] = a;
	            }
	         }
	      }
	      System.out.println("Third second largest number is:: "+array[size-2]);
	   }
	}