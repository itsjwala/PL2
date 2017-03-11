import java.util.Scanner;
import java.util.Arrays;
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class EXP7{
	static Scanner sc=new Scanner(System.in);

static int getInt(String var)throws MyException{
	int n=0;
       try{
	      n=sc.nextInt();
	   }catch(Exception e){
        throw new MyException("Please enter valid number of subjects");
	   }
        if(n<=0){
         if(var.equals("subjects"))
		 throw new MyException("Number of "+var+" cannot be "+n);
         else
			 throw new MyException(var +" cannot be "+n); 
		}
		else
           return n; 			 
}
public static void main(String args[]){
   
	  int n=0;
	  
	System.out.println("Enter number of subjects:");

	try{ 
	    n=getInt("subjects");
	  }catch(MyException e){
		System.out.println(e.getMessage());  
	  }
	int average=0,a[]=new int[n];
      
	 for(int i=0;i<a.length;i++){
		  System.out.print("Subject "+(i+1)+" marks:");
		    try{
			 a[i]=getInt("marks");
			  average+=a[i];
			}
			catch(MyException e){
				System.out.println(e.getMessage());
			}
	      System.out.println();
	  }
	  if(a.length!=0)
	  System.out.print("Average:"+average/a.length);

	  sc.close();      
    }
}
