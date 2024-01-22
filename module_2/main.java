/*
 * Mark Witt
 * CSD-405
 * Module 
 * Assignment 1
 */

public class main{
    public static void main(String[] args) {
        
        //create variable for number of fans in collection:
        int numOfFans = 6;
        
        //declare fan array and create it:
        Fan[] fanArray = UseFans.createFanArray(numOfFans);
        UseFans.printFanCollection(fanArray);
        UseFans.printRandomFan(fanArray);
        
}
}
