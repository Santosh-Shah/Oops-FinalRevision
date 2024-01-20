import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        processInput(sc);

//        switch (sc.nextInt()) {
//            case 1:
//                System.out.println("you this");
//                break;
//            case 2:
//                System.out.println("You that");
//                break;
//            default:
//                System.out.println("you idiot");
//                break;
//        }



        System.out.println("Choose a day (1-7):");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                // No break statement here!
//                break;
        }

        System.out.println("End of program.");
        sc.close();
    }

    public static void processInput(Scanner sc) {
        System.out.println("Enter a value: ");
        System.out.println("you value: " + sc.nextInt());
    }
}