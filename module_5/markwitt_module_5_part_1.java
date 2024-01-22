/*
 * Mark Witt
 * CSD-405
 * Module 5
 * Program/part 1
 * 
 *
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


 public class markwitt_module_5_part_1{

     public static void main(String[] args){
        //setup ArrayList
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Luke Skywalker");
        myList.add("Leia Organa");
        myList.add("Obi-Wan Kenobi");
        myList.add("Yoda");
        myList.add("Han Solo");
        myList.add("Chewbacca");
        myList.add("Darth Vader");
        myList.add("Anakin Skywalker");
        myList.add("Padme Amidala");
        myList.add("Emperor Palpatine");


        //display ArrayList
        System.out.println("\nmyList contains:");
        for (int i = 0; i < myList.size(); i++){        //loop through ArrayList
            System.out.println("\t" + (i+1) + ". " + myList.get(i));        //display ArrayList value at i location
        }
        System.out.println();
        System.out.print("Please select an element to display again:\nChoice: "); //instructions to user
        makeselection(myList);
        }


    static void makeselection(ArrayList myList){
        //create scanner object
        while(true){    //keeps input loop running if there is an error
            // try/catch
            try{
                Scanner input = new Scanner(System.in);
                Integer choice = input.nextInt(); //get next int from scanner
                if (choice.intValue() > myList.size()){    //if input is a number greater than the size of the ArrayList:
                    System.out.print("\nError. Out of Bounds. Please enter a valid selection.\nChoice: ");
                }
                else {  //if input is a number less than ArrayList size, print out the choice, then break from the loop
                    System.out.println("\nYour Choice is:\n\t" + myList.get((choice.intValue()-1)));
                    break; 
                }
            }
            catch (InputMismatchException e){   //catch input exception, if input is not a valid int:
                System.out.print("\nError. Out of Bounds. Please enter a valid selection.\nChoice: ");
                //break;
            }
            }
        }
}