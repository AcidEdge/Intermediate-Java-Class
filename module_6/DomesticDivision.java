/*
 * Mark Witt
 * CSD - 405
 * Module 6 assignment
 * DomesticDivision class
 */
public class DomesticDivision extends Division{
    String state;

    //constructor
    DomesticDivision(String name, int account_number, String state){
        super(name, account_number);
        this.state = state;
    }

    //display method, overrides abstract display method from division class
    @Override
    void display() {
        System.out.println("Domestic Division: " + name);
        System.out.println("State: " + state);
        System.out.println("Account Number: " + account_number);
        System.out.println();
        
    }
    
}
