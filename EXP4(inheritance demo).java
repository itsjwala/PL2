import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
abstract class Shape{
   double x,y;
   void getData() throws IOException{
	   
    	Scanner sc=new Scanner(System.in);
	   System.out.println("Enter length and Breadth");
		x=sc.nextDouble();
	    y=sc.nextDouble();
		  
   }
  abstract double area();
	double getX(){
	return x;
	}
    double getY(){
	  return y;
	}			
}
class Triangle extends Shape{
	Triangle(){}
	Triangle(double length,double height){
		x=length; y=height;
	}
	double area(){ 
	  return 0.5*x*y;
	}		
	
}
class Rectangle extends Shape{
 	Rectangle(){}
	Rectangle(double length,double breadth){
		x=length; y=breadth;
	}
    double area(){ 
	 return x*y;
	}	
}
class EXP4{
	 
      public static void main(String args[])throws Exception{  
	
		 Shape s=new Triangle();
		 s.getData();
		System.out.println("Area ="+s.area());
		
		 s=new Rectangle();
		 s.getData();
		System.out.println("Area ="+s.area());
	
	 }
}
