import java.util.Scanner;
class Student{
	String name;  int roll;
	void putName(String name){
	    this.name=name;
	}
	String getName(){
		return name;
	}
	void putRoll(int roll){
	  this.roll=roll;
	}
	int getRoll(){
	   return roll;
	}
	
}
class Test extends Student{
	double m1,m2,m3;
	void setMarks(double a,double b,double c){
	  m1=a; m2=b; m3=c;
	}
	double get1(){
		return m1;
	}
	double get2(){
		return m2;
	}
	double get3(){
		return m3;
	}
}
interface Sports{
	double bonus=5.0;
	void putBonus();
}
class Result extends Test implements Sports{
      	 double total;
	
	public void putBonus(){
	   total+=bonus;
	}
	void display(){
		total=(m1+m2+m3);
	  System.out.println("\nNAME:"+getName()+" ROLL-NUMBER:"+getRoll());
       System.out.println("PHYSICS:"+get1()+" CHEMISTRY:"+get2()+" MATH:"+get3()); 	  
        System.out.println("Total:"+total);
		   putBonus();
  	    System.out.println("Total with bonus:"+total+"\n");
	}
}
class EXP5{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of student:");
	  int n=sc.nextInt();
	  System.out.println(n);
      Result r[]=new Result[n];
	 
	  for(int i=0;i<r.length;i++){
        r[i]=new Result();	
	   System.out.println("Enter name:");
	   r[i].putName(sc.next());  
	   System.out.println("Enter roll-number:");
	     r[i].putRoll(sc.nextInt());
		 
		 System.out.println("Physics Marks:");
		 double m1=sc.nextDouble();
          System.out.println("Chemistry Marks:");
		 double m2=sc.nextDouble();
            System.out.println("Math Marks:");       
		 double m3=sc.nextDouble();
			r[i].setMarks(m1,m2,m3);  
	  }
	  for(int i=0;i<r.length;i++){
       r[i].display();
	  }
	  sc.close();
 }
}
