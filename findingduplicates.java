package test;

public class findingduplicates {
	  public static void main(String[] args) {  
	   String string1 = "finding the  duplicates in the given string";  
       int count;  
         
       //Converts given string into character array  
        char String[]=string1.toCharArray();
       for(int i = 0; i <String.length; i++) {  
           count = 1;  
           for(int j = i+1; j <String.length; j++) {  
               if(String[i] == String[j] && String[i] != ' ') {  
                   count++;  
                   //Set string[j] to 0 to avoid printing visited character  
                   String[j] = '0';  
               }  
           }  
           //A character is considered as duplicate if count is greater than 1  
           if(count > 1 && String[i] != '0')  
               System.out.println(String[i]);  
       }  
   }   
}

