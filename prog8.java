package priya;
import java.util.*;
public class prog8 {
	public static void main(String args[]) {
        int num,target=19;
        do {
            System.out.println("Enter a number(between 1 and 50):");
        Scanner ip=new Scanner(System.in);
        num=ip.nextInt();
        if(num>=1&&num<=50)
        {
            if(num>target)
            {
                System.out.println("your number is greater than target");
            }
            else if(num<target)
            {
                System.out.println("your number is less than target");

            }
        }
        else {
           System.out.println("Please enter number between 1 and 50");

        }
        }while(num!=target);
        }
}
