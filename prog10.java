package priya;
import java.util.Scanner;
public class prog10 {
	public static void main(String args[]) {
	  String str;
	   int x,y,n,i;
	   System.out.println("Enter a number:");
	   Scanner input=new Scanner(System.in);
	   n=input.nextInt();
	   System.out.println("Enter a string:");
	   Scanner inp=new Scanner(System.in);
	   str=inp.next();
	   x=str.length();
	   y=x-n;
	   for(i=0;i<x;i++)
	   {
	       System.out.print(str.charAt(i));
	      
	   }
	   for(i=y;i<x;i++) {
	       int j=y;
	       while(j<x) {
	           System.out.print(str.charAt(j));
	           j++;
	       }
	   }
	}   
}
