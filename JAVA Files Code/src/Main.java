import java.io.File; //import file class
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        // To Create File
        File myObj = new File("My First File.txt");
        if(myObj.createNewFile()){
            System.out.println("File created: " + myObj.getName());
        }
        else {
            System.out.println("File already exists.");
        }

        // To Write to a File
        FileWriter myWriter = new FileWriter("My First File.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Done");

        // To Read the Content of the File using scanner
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()){
         String data = myReader.nextLine();
         System.out.println(data);
        }
        myReader.close();


        // Get File Information
       if(myObj.exists()){
           System.out.println("File name: " + myObj.getName());
           System.out.println("Absolute path: " + myObj.getAbsolutePath());
           System.out.println("Writeable: " + myObj.canWrite());
           System.out.println("Readable: " + myObj.canRead());
           System.out.println("Last modified: " + myObj.lastModified());
           System.out.println("File Size in Bytes: " + myObj.length());
       }
       else {
           System.out.println("File does not exist.");
       }


       // To Delete a File
       /* if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        } */
    }
}