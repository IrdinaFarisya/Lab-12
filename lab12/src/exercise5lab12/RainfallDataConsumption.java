package exercise5lab12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * This program consumes data that was created in RainfallDataCreation
 * using java.io.DataInputStream
 * 
 * The program calculates the average rainfall and display it on the console.
 * 
 * @author irdinafarisya
 *
 */
public class RainfallDataConsumption {

	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "RainfallData.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double rainfall = 0.0;
			double totalRainfall = 0.0;
			int days = 6;
			
			// 3. Process data until end-of-file
			while(dis.available() > 0) {
				
				// Read data
				rainfall = dis.readDouble();
				
				// Calculate total rainfall
				totalRainfall += rainfall;
			}
			
			// 4. Close stream
			dis.close();
			
			// Calculate average rainfall
			double averageRainfall = totalRainfall / days;
			String formattedAverage = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage rainfal for " + days 
					+ " days in Simpang Ampat Station, Alor Gajah: " + formattedAverage + "%");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
		

	}

}
