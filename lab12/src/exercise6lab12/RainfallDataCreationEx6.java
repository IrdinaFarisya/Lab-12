package exercise6lab12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This class creates the input data using java.io.DataOutputStream for two stations in each district in Melaka.
 * The data consists of the station id, station name, name of district, and 6-days reading of daily rainfall.
 * 
 * @author irdinafarisya
 */
public class RainfallDataCreationEx6 {

    public static void main(String[] args) {

        // Declare output file
        String outFile = "RainfallDataEx6.txt";

        try {
            // Create stream to write data
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));

            // District 1: Alor Gajah
            String district1 = "Alor Gajah";

            // Station 1: Melaka Pindah
            int stationId1 = 2322006;
            String stationName1 = "Melaka Pindah";
            double[] rainfall1 = { 2.0, 18.5, 2.5, 0.0, 5.0, 0.5 };

            // Write data for station 1
            dos.writeInt(stationId1);
            dos.writeUTF(stationName1);
            dos.writeUTF(district1);
            for (double value : rainfall1) {
                dos.writeDouble(value);
            }

            // Station 2: Durian Tunggal
            int stationId2 = 2222002;
            String stationName2 = "Durian Tunggal";
            double[] rainfall2 = { 37.0, 6.0, 9.0, 0.0, 5.0, 0.0 };

            // Write data for station 2
            dos.writeInt(stationId2);
            dos.writeUTF(stationName2);
            dos.writeUTF(district1);
            for (double value : rainfall2) {
                dos.writeDouble(value);
            }

            // District 2: Jasin
            String district2 = "Jasin";

            // Station 3: Chohong
            int stationId3 = 2225044;
            String stationName3 = "Chohong";
            double[] rainfall3 = { 39.0, 14.5, 24.5, 0.5, 3.5, 0.0 };

            // Write data for station 3
            dos.writeInt(stationId3);
            dos.writeUTF(stationName3);
            dos.writeUTF(district2);
            for (double value : rainfall3) {
                dos.writeDouble(value);
            }

            // Station 4: Telok Rimba
            int stationId4 =  2125002;
            String stationName4 = "Telok Rimba";
            double[] rainfall4 = { 69.0, 53.0, 4.0, 0.0, 89.0, 0.0 };

            // Write data for station 4
            dos.writeInt(stationId4);
            dos.writeUTF(stationName4);
            dos.writeUTF(district2);
            for (double value : rainfall4) {
                dos.writeDouble(value);
            }

            // District 3: Melaka Tengah
            String district3 = "Melaka Tengah";

            // Station 5: Sg. Duyong
            int stationId5 = 2223023;
            String stationName5 = "Sg. Duyong";
            double[] rainfall5 = { 43.0, 26.0, 26.0, 0.0, 21.5, 0.0 };

            // Write data for station 5
            dos.writeInt(stationId5);
            dos.writeUTF(stationName5);
            dos.writeUTF(district3);
            for (double value : rainfall5) {
                dos.writeDouble(value);
            }

            // Station 6: Batu Hampar
            int stationId6 = 2222033;
            String stationName6 = "Batu Hampar";
            double[] rainfall6 = { 30.0, 11.5, 22.0, 0.0, 21.5, 0.0 };

            // Write data for station 6
            dos.writeInt(stationId6);
            dos.writeUTF(stationName6);
            dos.writeUTF(district3);
            for (double value : rainfall6) {
                dos.writeDouble(value);
            }

            // Close stream
            dos.close();

            // Complete Data Creation
            System.out.println("Rainfall Data Creation completed. Check out " + outFile);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
