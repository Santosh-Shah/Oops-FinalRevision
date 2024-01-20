package projects.banking_system;

import java.sql.Connection;
import java.util.Scanner;

public class Accounts {
    private Connection connection;
    private Scanner scanner;

    public Accounts(Connection conn, Scanner sc) {
        this.connection = conn;
        this.scanner = sc;
    }
}
