import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Character;

class StringManipulation
{
     static int frequencyCount(String s, char a){
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == a) count++;
        }
        return count;
    }

     static String replaceCharacter(StringBuffer sb){
        char a[]=sb.toString().toCharArray();
          char previous=' ';
        for(int i=0;i<a.length;i++){
           if(Character.isWhitespace(previous)&&Character.isLetter(a[i])){
              a[i]=Character.toUpperCase(a[i]);
           }
           previous=a[i];
        }
		  return new String(a);

    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s;
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	   System.out.println("Enter the string: ");
		s = br.readLine();
		System.out.println("Enter the Character");
	    char c = br.readLine().charAt(0);
		int freq =  frequencyCount(s,c);
		System.out.println("The frequency of "+ c + " in "+ s +" is "+freq+".");


		//Replace Character example

		System.out.println("Enter a string:");
	   s=br.readLine().trim();

	   s = replaceCharacter(new StringBuffer(s));
		System.out.println("The new String is "+ s +".");
	  br.close();
	}
}
