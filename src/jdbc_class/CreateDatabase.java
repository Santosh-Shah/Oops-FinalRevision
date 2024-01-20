package jdbc_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    // methods to create a database
    public static void createDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "4283";

            // make connection with a database
            Connection conn = DriverManager.getConnection(url, username, password);

            // creating statement
            Statement stmt = conn.createStatement();

            // execute query
            String query = "CREATE DATABASE revision";
            stmt.execute(query);
            System.out.println("Database is created now");

            // now close the connection
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        CreateDatabase.createDatabase();
    }
}
