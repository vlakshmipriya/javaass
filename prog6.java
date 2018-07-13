package priya;
import java.util.Scanner;
	public class prog6 {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	            char a;
	            System.out.println("Enter a character:");
	                    Scanner i=new Scanner(System.in);
	                    a = i.next().charAt(0);
	                    if(a>='a'&&a<='z') {
	                        System.out.println(a+" is a small letter");
	                    }
	                    else if(a>='A'&&a<='z') {
	                        System.out.println(a+" is a capital letter");

	                    }
	                    else if(Character.isDigit(a)) {
	                        System.out.println(a+" is a number");

	                    }
	                    else {
	                        System.out.println(a+" is a special symbol");
	                        
	                        

	                    }
	                        
	                    }
	    }

