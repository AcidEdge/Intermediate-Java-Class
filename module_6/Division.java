/*
 * Mark Witt
 * CSD - 405
 * Module 6 assignment
 * Division class
 */
public abstract class Division {
    String name;
    int account_number;
   
    //constructor requiring both fields
    Division(String name, int account_number){
        this.name = name;
        this.account_number = account_number;
    }

    //abstract display method
    abstract void display();
}

