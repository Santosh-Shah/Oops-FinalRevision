package jdbc_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTable {
    // Method to create table
    public static void deleteTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/revision";
            String username = "root";
            String password = "4283";

            // make connection with database
            Connection conn = DriverManager.getConnection(url, username, password);

            Statement stmt = conn.createStatement();
            String query = "DROP TABLE student";
            stmt.execute(query);
            System.out.println("Table delete successfully");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DeleteTable.deleteTable();
    }
}
