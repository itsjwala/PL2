//EXP6.java
import myPackage.myMath;
import java.util.Scanner;
class EXP6{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
 	System.out.println("Enter degree:");
		double degree=sc.nextDouble();
			double x=degree*3.142/180;
		
  	System.out.println("Enter number of terms:");	
	int n=sc.nextInt();	

	long fact[]=new long[50];
    	fact[0]=1;
		for(int i=1;i<50;i++)
			  fact[i]=i*fact[i-1];
		
	 double ans=0;
	 
	   for(int i=1,sign=1;i<=n;i++,sign=-1*sign)
	       ans+=sign*myMath.power(x,2*(i-1))/fact[2*(i-1)];
	       
		System.out.println("COS("+degree+")="+ans);
		sc.close();
	}

}
/*******
myPackage.myMath:

package myPackage;
public class myMath{

    public static double power(double x,double y){
       double ans=1;
       while(y-->0)
		  ans*=x;
 
       return ans;   
	}	
}
**************/