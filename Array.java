package Task11;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try 
	        {
	            int[] numbers = {1, 2, 3, 4};
	            int index = 5;
	            int number = numbers[index];
	            System.out.println("Number: " + number);
	        } 
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	        	System.out.println("");
	            System.out.println("Array Index Out Of Bounds Exception || " + e.getMessage());	       	
	        }
	        try 
	        {
	            String text = "Helloo";
	            char character = text.charAt(10);
	            System.out.println("Character: " + character);
	        } 
	        catch (StringIndexOutOfBoundsException e)	        
	        {
	        	System.out.println("");
	        	System.out.println("String Index Out Of Bounds Exception || " + e.getMessage());
	        }

	}

}
