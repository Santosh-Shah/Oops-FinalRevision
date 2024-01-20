package projects.banking_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Users {
    private Connection connection;
    private Scanner scanner;

    public Users(Connection conn, Scanner sc) {
        this.connection = conn;
        this.scanner = sc;
    }

    public void register() {
        scanner.nextLine();
        System.out.println();
        System.out.println("Full Name: ");
        String full_name = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        // if a user exists no need to register, she/he can directly register
        if (userExist(email)) {
            System.out.println("This account is already registered!");
            return;
        }

        String register_query = "INSERT INTO users(full_name, email, password) VALUES(?, ?, ?)";
        try {
            PreparedStatement preStm = connection.prepareStatement(register_query);
            preStm.setString(1, full_name);
            preStm.setString(2, email);
            preStm.setString(3, password);
            int affectRows = preStm.executeUpdate();
            if (affectRows > 0) {
                System.out.println("You are register successfully!");
            } else {
                System.out.println("Registration Failed!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String login() {
        scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        String login_query = "SELECT * FROM WHERE email = ? AND password = ?";

        try {
            PreparedStatement preStm = connection.prepareStatement(login_query);
            preStm.setString(1, email);
            preStm.setString(2, password);
            ResultSet resultSet = preStm.executeQuery();
            if (resultSet.next()) {
                return email;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean userExist(String email) {
        String query = "SELECT * FROM user WHERE email = ?";
        try {
            PreparedStatement preStm = connection.prepareStatement(query);
            preStm.setString(1, email);
            ResultSet resultSet = preStm.executeQuery();
            return resultSet.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
