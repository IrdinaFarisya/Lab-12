package exercise5lab12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program creates a set of data using java.io.DataOuputStream.  
 * 
 * The data represents a 6 days reading of daily rainfall from station Simpang Ampat in Alor Gajah district.
 * 
 * @author irdinafarisya
 *
 */
public class RainfallDataCreation {

	public static void main(String[] args) {
		
		
		// 1. Declare output file 
		String outFile = "RainfallData.txt";
		
		// Data declaration
		double rainfall[] = {4.0, 1.0, 0.0, 6.0, 19.0, 1.0};
		
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for (int index = 0; index < rainfall.length; index++) {
				
				// 3. Write data into data stream
				dos.writeDouble(rainfall[index]);
				
				// 4. Flush for each writing
				dos.flush();
			}
			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("Rainfall Data created. Check out " + outFile); 
	}

}
