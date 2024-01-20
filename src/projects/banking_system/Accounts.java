package projects.banking_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Accounts {
    private Connection connection;
    private Scanner scanner;

    public Accounts(Connection conn, Scanner sc) {
        this.connection = conn;
        this.scanner = sc;
    }

    public long openAccount(String email) {
        if (!accountExist(email)) {
            String open_account_query = "INSERT INTO accounts(account)number, full_name, balance, security_pin VALUES(?, ?, ?, ?, ?)";
            scanner.nextLine();
            System.out.println("Enter Full Name: ");
            String full_name = scanner.nextLine();
            System.out.println("Enter Initial Account: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();
        }
        return (long) 455.2440000000;
    }


    public boolean accountExist(String email) {
        String query = "SELECT account_number FROM Accounts WHERE email = ?";
        try {
            PreparedStatement preStm = connection.prepareStatement(query);
            preStm.setString(1, email);
            ResultSet resultSet = preStm.executeQuery();
            if(resultSet.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
