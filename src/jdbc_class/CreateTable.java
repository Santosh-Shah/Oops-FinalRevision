package jdbc_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    // Method to create table
    public static void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/revision";
            String username = "root";
            String password = "4283";

            // make connection with database
            Connection conn = DriverManager.getConnection(url, username, password);

            Statement stmt = conn.createStatement();
            String query = "CREATE TABLE student(name VARCHAR(255), gmail VARCHAR(255), college VARCHAR(255))";
            stmt.execute(query);
            System.out.println("Table created successfully");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CreateTable.createTable();
    }
}
