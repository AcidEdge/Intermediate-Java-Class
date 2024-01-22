/*
 * Mark Witt
 * CSD - 405
 * Module 6 assignment
 * UseDivision class
 * create 2 instances of each division type (4 total objects)
 */
public class UseDivision {
    public static void main(String[] args){
        
        //create instances of each division type
        InternationalDivision london = new InternationalDivision("London", 556314, "England", "English");
        InternationalDivision tokyo = new InternationalDivision("Tokyo", 4678643, "Japan", "Japanese");
        DomesticDivision la = new DomesticDivision("LA", 1545, "CA");
        DomesticDivision ny = new DomesticDivision("New York", 789430, "NY");

        //use each objects display method to output the object info/variables
        london.display();
        tokyo.display();
        la.display();
        ny.display();
    }
    
}
