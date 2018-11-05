/**
 * 
 */

/**
 * @author Xabier
 *
 */
import java.util.Scanner;
import java.io.*;

public class Ex_1_21_CopyPaste {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Create a File with the path of the file you want to copy
		File toCopy = new File(args[0]);
		//Create a File with with the path of the file you want to write
		File toPaste = new File(args[1]);
		//Create a a scanner that is going to read the original file
		Scanner sc = new Scanner(toCopy);
		// The string to store the information of the file toCopy
		String text = " ";
		text = sc.nextLine();
		sc.close();
		//Do this...
		try {
			//Create a FileWriter with the path of the file we want to write in
			FileWriter fw = new FileWriter(toPaste);
			//Write the scanned text in the file
			fw.write(text);
			//Close the writer
			fw.close();
			
		//...and if any exception appears...	
		} catch (Exception e) {
			// ...print a message with the error
			System.err.println("Error: " + e.getMessage());
		}

	}
}



