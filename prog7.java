package priya;
import java.util.Scanner;
public class prog7 {
	    
	    public static void main(String[] args) {
	       int num,i,sum=0,rem,newnum,n,temp;
	       Scanner input= new Scanner(System.in);
	       System.out.println("Enter the number");
	       num=input.nextInt();
	       int count = 0;
	       newnum=num;
	      while(num != 0)
	      {
	          num /= 10;
	          ++count;
	      }
	       int a[]=new int[count];
	       i=0;
	       while(newnum!=0) {
	           rem=newnum%10;
	           a[i]=rem;
	           newnum=newnum/10;
	           i++;
	       }
	    for (int k = 0; k< count; k++) 
	    {
	      for (int j = k + 1; j < count; j++)
	      {
	          if (a[k] < a[j])
	          {
	              temp = a[k];
	              a[k] = a[j];
	            
	              a[j] = temp;
	          }
	      }
	    }
	    System.out.println("Sorted in non decreasing order");
	    for (i=0;i<count;i++) {
	       System.out.print(a[i]);
	       }
	    for(int l=0;l<count;l++) {
	       if(a[l]%2==0)
	       {
	           sum=sum+a[l];
	       }
	    }
	    if(sum>15) {
	       System.out.println("True");
	    }
	    else {
	       System.out.println("False");
	    }
	    }
	    }

