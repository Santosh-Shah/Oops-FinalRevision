package exception_handling;

public class MyException extends Exception {
    // store account information
    public static int[] accNo = {101, 102, 103, 104, 105};
    public static String accName[] = {"Ram", "Shyam", "Ravi", "Hariom", "Akash"};
    public static double balance[] = {1000, 200, 4000, 10000, 15000};

    // default constructor
    MyException() {

    }

    MyException(String str) {
        super(str);
    }
}
