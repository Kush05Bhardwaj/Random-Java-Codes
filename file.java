// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// public class file
// {
//     public static void main(String[] args)
//     {

//         try {
//             File Obj = new File("myfile.txt");
            
//           	// Creating File
//           	if (Obj.createNewFile()) {
//                 System.out.println("File created: " + Obj.getName());
//             }
//             else {
//                 System.out.println("File already exists.");
//             }
//         }
      
//       	// Exception Thrown
//         catch (IOException e) {
//             System.out.println("An error has occurred.");
//             e.printStackTrace();
//         }

//         // Writing Text File       
//         try {

//             FileWriter Writer = new FileWriter("myfile.txt");

//             // Writing File
//             Writer.write("Hlo, I m God...");
//             Writer.close();
            
//             System.out.println("Successfully written.");
//         }

//         // Exception Thrown
//         catch (IOException e) {
//             System.out.println("An error has occurred.");
//             e.printStackTrace();
//         }

//         // Reading File
//         try {
//             File Obj = new File("myfile.txt");
//             Scanner Reader = new Scanner(Obj);
          
//             // Traversing File Data
//           	while (Reader.hasNextLine()) {
//                 String data = Reader.nextLine();
//                 System.out.println(data);
//             }
          
//             Reader.close();
//         }
        
//         // Exception Cases
//         catch (FileNotFoundException e) {
//             System.out.println("An error has occurred.");
//             e.printStackTrace();
//         }

//         File Obj = new File("myfile.txt");
        
        // // Deleting File
        // if (Obj.delete()) {
        //     System.out.println("The deleted file is : " + Obj.getName());
        // }
        // else {
        //     System.out.println(
        //         "Failed in deleting the file.");
        // }
//     }
// }

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file {

    public static void main(String[] args) {

        
        String sourceFilePath = "myfile.txt"; // Replace with your source file path
        String destinationFilePath = "destination.txt"; // Replace with your destination file path

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {

            byte[] buffer = new byte[1024]; // Buffer to read data in chunks
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully from " + sourceFilePath + " to " + destinationFilePath);

        } catch (IOException e) {
            System.err.println("Error during file operation: " + e.getMessage());
        }
    }
}