/*
 * Mark Witt
 * CSD-405
 * Module 1
 * Assignment 1
 * Fan class
 */

//create fan class
public class Fan{
    //set Fan class variables:
    static final int STOPPED = 0;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed;
    private boolean on;
    private int radius;
    private String color;

    //setter methods to set each value:
    public void setSpeed(int speed){  //setter for speed
        this.speed = speed;
    }
    public void setRadius(int radius){  //setter for radius
        this.radius = radius;
    }
    public void setOn(boolean on){  //setter for on
        this.on = on;
    }
    public void setColor(String color){  //setter for color
        this.color = color;
    }

    //getter methods to get each value:
    public int getSpeed(){  //returns speed
        return speed;
    }
    public int getRadius(){  //returns radius
        return radius;
    }
    public boolean getOn(){  //returns on/off status (true/false)
        return on;
    }
    public String getColor(){  //returns color
        return color;
    }
    //constructor that sets default values:
    Fan(){
        setSpeed(STOPPED);
        setRadius(6);
        setColor("white");
        setOn(false);
    }

    //constructor that sets values from arguments:
    Fan(int speed, int radius, boolean on, String color){
        this.speed=speed;
        this.radius=radius;
        this.on=on;
        this.color=color;
    }

    //creates custom toString() method that returns Fan object status.
    //if Fan.on is false, returns off
    @Override
    public String toString(){
        if(on==false){ //string for status if fans is turned off(on==false)
            return "status is: \n" + getOn() + "(off)\nspeed is " + getSpeed() +"\nradius is " + getRadius() + "\ncolor is " + getColor()+"\n";
        }
        else{   //string for status if fan is turned on(on==true)
            return "status is: \n" + getOn() + "(on),\nspeed is " + getSpeed() +",\nradius is " + getRadius() + ",\ncolor is " + getColor(); 
        }
    }
}