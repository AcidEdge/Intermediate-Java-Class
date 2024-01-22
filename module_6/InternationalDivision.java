/*
 * Mark Witt
 * CSD - 405
 * Module 6 assignment
 * InternationalDivision class
 */
public class InternationalDivision extends Division {

    String country;
    String language;

    //constructor
    InternationalDivision(String name, int account_number, String country, String language) {
        super(name, account_number);
        this.country = country;
        this.language = language;
        
    }

    //display method, overrides abstract display method from division class
    @Override
    void display() {
        System.out.println("International Division: " + name);
        System.out.println("Country: " + country);
        System.err.println("Language: " + language);
        System.out.println("Account Number: " + account_number);
        System.out.println();
        
    }
    
}
