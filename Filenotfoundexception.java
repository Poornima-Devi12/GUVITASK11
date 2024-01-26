package Task11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Filenotfoundexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
	            //file path
	            String filePath = "C:\\Users\\Prabu\\OneDrive\\Desktop\\Poornima Devi JAT15WD\\tasksguvi\\src\\Task11\\poornima.txt";
	            
	            // Create an object
	            File file = new File(filePath);
	            
	            // if the file exists
	            if (!file.exists()) {
	                // throw a FileNotFoundException
	                throw new FileNotFoundException("file not found");
	            }
	            
	            // Read data from the file
	            Scanner scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	                String data = scanner.nextLine();
	                System.out.println(data);
	            }
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            // error message to the user
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}
