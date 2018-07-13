package priya;
import java.util.Scanner;
public class prog2 {
	public static void main(String args[]) {
		int n,temp;
		Scanner s=new Scanner(System.in);
			n=s.nextInt();

		if(n%2==0)
		{
		if(n>=20 && n<=30) 
			System.out.println("jerry");
		}			
		if(n%2!=0)
		{
		if(n>=20 && n<=30) 
			System.out.println("tom");	
		}
	}
}