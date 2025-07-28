package assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question43 
{
	private static final String FILE_NAME = "batchmates.txt"; 

    public static void main(String[] args) {
        System.out.println("file name: " + FILE_NAME);

                try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line; 
            int lineNumber = 1; 

            System.out.println("\n--- Contents of " + FILE_NAME + " ---");

            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }

            System.out.println("------------------------------------");
            System.out.println("Successfully read all contents from " + FILE_NAME + ".");

        } catch (IOException e) {
            
            System.err.println("\nAn error occurred while reading the file:");
            System.err.println("Error Message: " + e.getMessage());
            System.err.println("Printing stack trace for more details:");
            e.printStackTrace(); 
        } finally {
            
            System.out.println("\nFile reading attempt finished.");
        }

}
}

/*
file name: batchmates.txt

--- Contents of batchmates.txt ---
Line 1: Satya
Line 2: sai
Line 3: venky
Line 4: srujan
------------------------------------
Successfully read all contents from batchmates.txt.

File reading attempt finished.
*/