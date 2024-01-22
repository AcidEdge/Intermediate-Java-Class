/*
 * Mark Witt
 * CSD-405
 * Module 3
 * Assignment 1
 * 
 * main
 */
public class main{
    public static void main(String[] args) {

        MarkInteger[] tests;
        tests = new MarkInteger[3];
        tests[0] = new MarkInteger(12);
        tests[1] = new MarkInteger(12);
        tests[2] = new MarkInteger(13);
        String[] testLabels = {"test1", "test2", "test3"};

        System.out.println("Object methods test:");
        for (int i = 0; i < tests.length; i++){
            System.out.println(testLabels[i] + " test:");
            System.out.println(testLabels[i] + " value: " + tests[i].getMark());
            System.out.println(testLabels[i] + ".isEven: " + tests[i].isEven());
            System.out.println(testLabels[i] + ".isOdd: " + tests[i].isOdd());
            System.out.println(testLabels[i] + ".isPrime: " + tests[i].isPrime());
            System.out.println();
        }
        System.out.println("int(7) test:");
        System.out.println("MarkInteger.isEven(int 7): " + MarkInteger.isEven(7));
        System.out.println("MarkInteger.isOdd(int 7): " + MarkInteger.isOdd(7));
        System.out.println("MarkInteger.isPrime(int 7): " + MarkInteger.isPrime(7));
        System.out.println();
        Integer test4 = new Integer(12);
        System.out.println("Integer(12) test:");
        System.out.println("MarkInteger.isEven(Integer 7): " + MarkInteger.isEven(test4)); 
        System.out.println("MarkInteger.isOdd(Integer 7): " + MarkInteger.isOdd(test4)); 
        System.out.println("MarkInteger.isPrime(Integer 7): " + MarkInteger.isPrime(test4)); 
        System.out.println();
        
        System.out.println("MarkInteger.isEquals method test - compare each test case with the other 2:");
        System.out.println(testLabels[0] + ".isEqual(" + testLabels[1] + "): " + tests[0].isEqual(tests[1].getMark()));
        System.err.println(testLabels[0] + ".isEqual(" + testLabels[2] + "): " + tests[0].isEqual(tests[2].getMark()));
        System.err.println(testLabels[1] + ".isEqual(" + testLabels[2] + "): " + tests[1].isEqual(tests[2].getMark()));
        
        


        /*
         * need code for:
         * create 3 instances of MarkInteger
         *      2 with same values
         *      1 different value
         * for loop to return each method
         * 
         * check equals for each instance
         */
        
    }
 }