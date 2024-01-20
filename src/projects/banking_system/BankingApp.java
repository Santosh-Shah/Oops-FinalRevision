package projects.banking_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BankingApp {
    private static final String url = "jdbc:mysql://localhost:3306/ssbankltd";
    private static final String username = "root";
    private static final String password = "4283";


    // TODO: Main method starts form here!
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Scanner sc = new Scanner(System.in);
            Users users = new Users(conn, sc);
            Accounts accounts = new Accounts(conn, sc);
            AccountManager accManager = new AccountManager(conn, sc);

            String email;
            long accNo;

            while (true) {
                System.out.println("*** Welcome to SS Bank ltd ***");
                System.out.println();
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.println("Enter your choice: ");
                int choice1 = sc.nextInt();

                switch (choice1) {
                    case 1:
                        users.register();
                        break;
                    case 2:
//                        email = users.login();
                    case 3:
                        System.out.println("Thank you for using SS Bank ltd!");
                        System.out.println("Exiting System!");
                        return;
                    default:
                        System.out.println("Enter Valid Choice");
                        break;
                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
