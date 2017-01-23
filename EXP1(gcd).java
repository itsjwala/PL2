import java.io.*;
import java.util.*;
public class EXP1{
 public static int gcd(int a,int b)
     {     
        return (b==0)?a:gcd(b,a%b);  
     }
public static int gcdLoop(int a,int b)
{
     while(a!=0&&b!=0)
	 {   if(a>b)
	        a%=b;
		else	
	      b%=a;
      } 
	  return a+b;
}	 
 public static void main(String args[]) throws Exception
 {
   
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
	  System.out.println("Enter 2 numbers:");
	   int a=Integer.parseInt(br.readLine());
	   int b=Integer.parseInt(br.readLine());
      System.out.println("GCD="+gcd(a,b));     	 
		br.close();
	 
   } 
}
