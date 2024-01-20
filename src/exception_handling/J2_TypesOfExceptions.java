package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

import static exception_handling.MyException.*;

public class J2_TypesOfExceptions {
    public static void main(String[] args) {
        //TODO: Java program to demonstrate ArithmeticException
//        try {
//            int a = 30;
//            int b = 0;
//            System.out.println("Result: " + a / b);
//
//        } catch (ArithmeticException e) {
//            System.out.println("You can't divide a number by 0!");
//        }


//        //TODO: Java program to demonstrate NullPointerException
//        try {
//            String name = null;
//            System.out.println("Result: " + name.length());
//
//        } catch (NullPointerException e) {
//            System.out.println("You have NullPointerException!");
//        }


//        //TODO: Java program to demonstrate StringIndexOutOfBoundsException
//        try {
//            String name = "Hello everyone i need internship";
//            System.out.println("Result: " + name.charAt(15));
//            System.out.println("Result: " + name.charAt(150));
//
//
//        } catch (NullPointerException e) {
//            System.out.println("You have NullPointerException!");
//        }


//        //TODO: Java program to demonstrate FileNotFoundException
//        try {
//            File file = new File("C:\\Users\\shasa\\IdeaProjects\\FinalRevisions\\oopsrevision\\src\\file.txt");
//            FileReader fr = new FileReader(file);
//            System.out.println("File Found!");
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File not exist right now!");
//        }


//        //TODO: Java program to demonstrate NumberFormatException
//        try {
//           // "vedas" is not a number
//            int num = Integer.parseInt("vedas");
////            int num = Integer.parseInt("50");
//
//            System.out.println(num);
//
//        } catch (NumberFormatException e) {
//            System.out.println("Number format exception!");
//        }


//        //TODO: Java program to demonstrate ArrayIndexOutOfBoundException
//        try {
//            int[] arr = new int[10];
//            System.out.println(arr[10]);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index is out of Bounds!");
//        }


//        //TODO: Java program to demonstrate IOException
////        Scanner sc = new Scanner("Hello Developer!");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("" + sc.nextLine());
//        System.out.println("Exception Output: " + sc.ioException());
//        sc.close();

        // TODO: Java program to demonstrate NoSuchElementException
//        Set demoSet = new HashSet();
//
//        // if add value then exception will not occur
////        demoSet.add(45);
//        Hashtable demoTable = new Hashtable();
//
//        // put this value then exception will not occur
////        demoTable.put(5, 500);
//        demoSet.iterator().next();
//        // accessing set
//
//        demoTable.elements().nextElement();
        // accessing hashtable
        // This throws a NoSuchElementException as there are
        // no elements in Set and HashTable and we are
        // trying to access elements


        // TODO:  IllegalArgumentException / common exception
//        ageToVote(4);


        // TODO: IllegalStateException
//        int a = 45;
//        int b = -10;
//        if (a >= 0 && b >= 0) {
//            checkPositiveAndNegative(a, b);
//        } else {
//            throw new IllegalStateException("Either one or both are negative numbers!");
//        }


        MyException myException;
        try {
            System.out.println("AccountNo" + "\t" + "Customer" + "\t" + "Balance");

            // Displaying the actual account information
            for (int i = 0; i < 5; i++) {
                System.out.println(accNo[i] + " \t\t" + accName[i] + " \t\t" + balance[i]);

                // display own exception if balance < 1000
                if (balance[i] < 1000) {
                    myException = new MyException("Balance is less than 1000");
                    throw myException;
                }
            }
        } catch (MyException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }


        // This is ended of the main method
    }

    public static void ageToVote(int age) {
        if (age >= 18) {
            System.out.println("Your are eligible to vote!");
        } else {
            throw new IllegalArgumentException("Sorry! you are not eligible to Vote!");
        }
    }


    public static void checkPositiveAndNegative(int a, int b) {
        System.out.println("Addition of Positive numbers: " + (a+b));
    }
}
