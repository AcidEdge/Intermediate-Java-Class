/*
 * Mark witt
 * CSD-405
 * Module 5 
 * Part/Program 2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class markwitt_module_5_part_2 {
    public static void main(String[] args){
        //check if file exists. if it does, calls add_data(). if not, create file, then call add_data()
        try {
            File myfile = new File("data.file");
            if (myfile.createNewFile()){
                System.out.println("File Created: " + myfile.getName());
                add_data(myfile);
            }
            else {
                System.out.println("File already exists.");
                add_data(myfile);
            }
        }
        catch(IOException e){
            System.out.println("An error occured while reading/creating file.");
            e.printStackTrace();
        }
    }
    
    //add data to file
    public static void add_data(File myfile){
        try{
        FileWriter myWriter = new FileWriter(myfile, true);
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            myWriter.write(rand.nextInt(100) + " ");
        }
        myWriter.close();
        System.out.println("Write to file success!");
        display_file(myfile);
        }
        catch (IOException e){
            System.out.println("An error occured while writing to file.");
            e.printStackTrace();
        }
    }

    public static void display_file(File myFile){
        try {
            System.out.println(myFile.getName() + " Contains:");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextInt()){
                Integer data = myReader.nextInt();
                System.out.println(data);
            }
            myReader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occured while reading the file.");
            e.printStackTrace();
        }
    }
}

