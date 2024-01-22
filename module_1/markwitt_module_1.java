/*
 * Mark Witt
 * CSD-405
 * Module 1
 * Assignment 1
 */

public class markwitt_module_1{
    public static void main(String [] args){
    //create 2 Fan objects:

        //create fan using defauly constructor:
        Fan myFan1 = new Fan();

        //create fan, passing arguments of speed, radius, on/of, color. this one is using Fan.constant to set speed:
        Fan myFan2 = new Fan(Fan.FAST, 10, true, "green"); 

        //print out status of both fans (default Fan first, then fan with custom settings):
        System.out.println("myFan default " + myFan1);
        System.out.println("myFan2 " + myFan2);
    }
}

