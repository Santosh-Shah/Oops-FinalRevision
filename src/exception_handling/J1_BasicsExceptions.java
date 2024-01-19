package exception_handling;

public class J1_BasicsExceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
//            System.out.println(a/b);
            int i = computeDivision(a, b);
        } catch (ArithmeticException e) {
            // this will show ArithmeticException
//            e.printStackTrace();

            // this will show java.lang.ArithmeticException: / by zero
//            System.out.println(e.toString());

            // The getMessage() method prints only the description of the exception.
            System.out.println(e.getMessage());
        }


//        String name = "Santosh Shah";
//        String name = null;
//        System.out.println(name.length());

//        int[] arr = new int[5];
//        System.out.println(arr[10]);


    }

    public static int computeDivision(int a, int b) {
        int res = 0;

        try {
            res = divideByZero(a, b);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException is occurred");
        }
        return res;
    }

    public static int divideByZero(int a, int b) {
        int i = a/b;
        return i;
    }
}
