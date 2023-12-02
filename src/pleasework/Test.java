package pleasework;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Test {
	    public static void main(String args[]) {
	    	try {
	        String path = "calibrationWords -this does not work - i put an actual path here but i have yet to learn how to read process envs on java";
	        File myObj = new File(path);
	        Scanner myReader = new Scanner(myObj);
	        
	        int finalSum = 0;
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          finalSum += convert(data);
	          System.out.println(finalSum);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    }
	    static int convert(String word) {
	    	int sum = 0;
	    	int firstNumber = 0;
	        int lastNumber = 0;
	    	for(int j=0; j<word.length(); j++){
	              String element = String.valueOf(word.charAt(j));
	              try{
	                  int number = Integer.parseInt(element);
	                  if(firstNumber == 0){
	                      firstNumber = number;
	                  }
	                  lastNumber = number;
	              }catch(NumberFormatException e){
	                  continue;
	              }
	      }
	       sum += Integer.parseInt(String.valueOf(firstNumber) + String.valueOf(lastNumber));
	       System.out.println("sum: " + sum);
	       return sum; 
	    	
	    }
}
