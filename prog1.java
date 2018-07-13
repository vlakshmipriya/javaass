package priya;
import java.util.Scanner;

class prog1{  
	 public static void main(String args[]){ 
		 Scanner s=new Scanner(System.in);
	  int r,sum=0,csum=0,temp,n,temp1;    
	 System.out.println("Enter value of n:");
	 n=s.nextInt();
	  temp=n; 
	  temp1=n;
	  while(n>0){    
	   r=n%10;    
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    {
	   System.out.println("palindrome number ");  
	  while(temp1>0)
	   {
		 int m=temp1%10;
		   if(m%2==0)
		   {
			   csum=csum+m;
		   }
		  temp1=temp1/10; 
	   }
	  if(csum>25)
	  {
		  System.out.println("sum of even nos is greater than 25");
	  }
	  if(csum<25)
	  {
		  System.out.println("sum of even nos is lesser than 25");
		  
	  }
	  }
	  else    {
	   System.out.println("not palindrome");    }
	}  
	}  

