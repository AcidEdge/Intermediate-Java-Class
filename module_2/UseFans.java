import java.util.Random;

/*
 * Mark Witt
 * CSD-405
 * Module 2
 * Assignment 1
 * UseFans class
 */
public class UseFans {


//create array of fan objects:
    public static Fan[] createFanArray(int fanArrayLength){
        //list of choices of colors for create method to choose from:
        final String[] colors = {"black", "white", "blue", "green", "red", "orange"};
        //create array of fans with length argument passed in from create method:
        Fan[] fanArray = new Fan[fanArrayLength];
        //new Random object:
        Random rand = new Random();
        fanArray[0] = new Fan();    //sets first fan in array/collection as default fan
        //loop through remaining fanArray and create fan objects with random settings:
        for (int i = 1; i < fanArray.length; i++){
            fanArray[i] = new Fan(rand.nextInt(4), rand.nextInt(20), rand.nextBoolean(), colors[rand.nextInt(6)]);
        }
        return fanArray;
    }

    public static void printFanCollection(Fan[] fanArray){
        //create string variable for on/off output text:
        String onOff;
        //print table label and column headers:
        System.out.println("\n\nCollection of fans and their status: \n*Fan #1 is always default settings.");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Fan #", "On/Off", "Speed", "Radius", "Color");
        //loop through fanArray and print values for each column:
        for(int i=0; i<fanArray.length; i++){
            //set value of on/off text based on current bool on status for fan in fanArray:
            if (fanArray[i].getOn() == false){ 
                onOff = "Off ";
            }
            else{
                onOff = "On ";
            }
            //print out fan status:
            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", i+1, onOff+"("+fanArray[i].getOn()+")", fanArray[i].getSpeed(), fanArray[i].getRadius(), fanArray[i].getColor());
        }
    }

    public static void printRandomFan(Fan[] fanArray){
        //create string variable for on/off output text:
        String onOff;
        //print table label and header:
        System.out.println("\n\nStatus of random fan from fan collection:");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Fan #", "On/Off", "Speed", "Radius", "Color");
        //randomly select fan from fanArray:
        int rand = new Random().nextInt(fanArray.length);
        //set value of on/off text based on current bool on status for fan in fanArray:
        if (fanArray[rand].getOn() == false){ 
            onOff = "Off ";
        }
        else{
            onOff = "On ";
        }
        //print selected fan status:
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n\n", rand+1, onOff+"("+fanArray[rand].getOn()+")", fanArray[rand].getSpeed(), fanArray[rand].getRadius(), fanArray[rand].getColor());
    }



}

