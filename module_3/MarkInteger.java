/*
 * Mark Witt
 * CSD-405
 * Module 3
 * Assignment 1
 * 
 * MarkInteger Class
 */

class MarkInteger{

    public int mark;

    //setter method:
    public void setMark(int mark){
        this.mark = mark;
    }

    //getter method:
    public int getMark(){
        return mark;
    }

    //contructor:
    MarkInteger(int mark){
        setMark(mark);
    }


    //non-static methods:
    boolean isEven(){
        if ((mark & 1) == 0){
            return true;
        }
        if ((mark & 1) != 0){
            return false;
        }
        return false;
    }

    boolean isOdd(){
        if ((mark & 1) == 0){
            return false;
        }
        if ((mark & 1) != 0){
            return true;
        }
        return false;
    }
    

    boolean isPrime(){
        if(mark<=1) {
            return false;
        }
       for(int i=2;i<=mark/2;i++) {
           if((mark%i)==0) 
               return  false;
       }
       return true;
    }

    //static methods:
    static boolean isEven(int mark){
        if ((mark & 1) == 0){
            return true;
        }
        if ((mark & 1) != 0){
            return false;
        }
        return false;
    }

    static boolean isOdd(int mark){
        if ((mark & 1) == 0){
            return false;
        }
        if ((mark & 1) != 0){
            return true;
        }
        return false;
    }

    static boolean isPrime(int mark){
        if(mark<=1) {
            return false;
        }
       for(int i=2;i<=mark/2;i++) {
           if((mark%i)==0) 
               return  false;
       }
       return true;
    }

    static boolean isEven(Integer mark){
        if ((mark & 1) == 0){
            return true;
        }
        if ((mark & 1) != 0){
            return false;
        }
        return false;
    }

    static boolean isOdd(Integer mark){
        if ((mark & 1) == 0){
            return false;
        }
        if ((mark & 1) != 0){
            return true;
        }
        return false;
    }

    static boolean isPrime(Integer mark){
        if(mark<=1) {
            return false;
        }
       for(int i=2;i<=mark/2;i++) {
           if((mark%i)==0) 
               return  false;
       }
       return true;
    }

    //equals methods:
    boolean isEqual(int mark1){
        return mark1==mark;
    }
    boolean equals(Integer mark1Integer){
        return mark1Integer == mark;
    }


}
