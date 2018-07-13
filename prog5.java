package priya;
	import java.util.*;
	public class prog5  {
			   int n,sum=0;
	   	   public void get() {
	  Scanner in = new Scanner(System.in);   
	  System.out.println("Enter a number");
	  n=in.nextInt();
	  int a[]= new int[n];
	  for (int i=0;i<n;i++) {
	      try{
	          a[i]=in.nextInt();
	          sum=sum+a[i];
	         Integer.parseInt(String.valueOf(a[i]));
	         System.out.println("Valid");
	      }catch (InputMismatchException e) {
	          System.out.println("Invalid");
	      }     
	  }
	 	   }
	   public void print() {
	       System.out.println("Sum is"+ sum);
	       	       }	   
	   	   public static void main(String a[]) {
	       prog5 f=new prog5();
	       f.get();
	       f.print();     
	   }

	}


