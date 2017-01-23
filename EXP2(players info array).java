import java.util.*;
class EXP2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of players:");
		int n=sc.nextInt();
		int player[][]=new int[n][];
    	for(int i=0;i<player.length;i++)
		 {
	      	System.out.println("Enter number of matches played by player "+(i+1)+":");
			int m=sc.nextInt();
			player[i]=new int[m]; 
			 for(int j=0;j<player[i].length;j++)
			 {  System.out.println("Enter runs for player "+(i+1)+" match "+(j+1));
		          player[i][j]=sc.nextInt();
			 }  
			 
		 }
		 for(int i=0;i<player.length;i++)
		 {  int sum=0;
	       System.out.println("Number of matches played by player "+(i+1)+"="+player[i].length);
	        System.out.println("Scores:");
	         for(int j=0;j<player[i].length;j++)
			 {  System.out.print(player[i][j]+" ");
			   sum+=player[i][j];
			 }		 
			 
		  System.out.println("average="+sum/player[i].length);
		 }	
		sc.close();
	}
	
	
	
	
}
