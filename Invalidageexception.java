package Task11;
import java.util.Scanner;
import java.util.*;

public class Invalidageexception {
	

	@SuppressWarnings("resource")
	    public static void main(String[]args){

	      Scanner age = new Scanner (System.in);
	      System.out.println("Enter your age");
	      int a = age.nextInt();
	      System.out.println("Enter you name");
	      String b = age.next();

	  try{  
	     if(a >125 && a<0){         
	        throw new Invalidageexception ();
	     }          
	    }
	    catch(Invalidageexception ex){
	    System.out.println("You entered an invalid number" + a);        
	    }
	    finally{
	        System.out.println("Your age is " + a);
	        System.out.println("Your name is " + b);
	    } 
	}
 public class Invalidageexception extends Exception {

	         public AgeExcpt(){     
	         super("The Age you've entered is not valid");       
}
