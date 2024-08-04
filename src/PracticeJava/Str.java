package PracticeJava;

public class Str {
   public static void main(String[] args) {
	
  String str="Abhishek mali";
  
  char[]ab=str.toCharArray();
	  for(int i=str.length()-1;i>=0;i--)
	  {
		  
		  System.out.print(str.charAt(i));
	  }
	   

   //by using StringBuffer
   
//   StringBuffer av=new StringBuffer(str);
//

//   System.out.println(av.reverse());
//  
   
   }
	}

