package assignments;

import java.io.*;
import java.util.Scanner;

public class Question37 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "batchmates.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            System.out.print("Enter number of batch mates: ");
            int n = Integer.parseInt(sc.nextLine());

            System.out.println("Enter names of batch mates:");
            for (int i = 1; i <= n; i++) {
                System.out.print("Name " + i + ": ");
                String name = sc.nextLine();
                writer.write(name + "\n");
            }

            writer.close();
            System.out.println("\n Batch mates' names have been written to " + fileName);

            System.out.println("\n Contents of " + fileName + ":");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(" Error occurred while handling the file: " + e.getMessage());
        }
    }
}


