package Task11;
import java.util.Scanner;

public class Arithmeticq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating scanner class to get input 
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the first number ");
        int a = scanner.nextInt();

        System.out.print("enter the second number ");
        int b = scanner.nextInt();

        try  
        { //Performing division
            int result = a / b;
            System.out.println("result: " + result);
        } 
        catch (ArithmeticException e) 
        { 
        	
               	 // Handle exception when number is zero	        	
            System.out.println("division by zero is not allowed");

        }
	}
}
