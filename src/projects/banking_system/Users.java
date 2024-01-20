package projects.banking_system;

import java.sql.Connection;
import java.util.Scanner;

public class Users {
    private Connection connection;
    private Scanner scanner;

    public Users(Connection conn, Scanner sc) {
        this.connection = conn;
        this.scanner = sc;
    }

}
