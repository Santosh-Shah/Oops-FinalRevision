package projects.banking_system;

import java.sql.Connection;
import java.util.Scanner;

public class AccountManager {
    private Connection connection;
    private Scanner scanner;
    public AccountManager(Connection conn, Scanner sc) {
        this.connection = conn;
        this.scanner = sc;
    }
}
