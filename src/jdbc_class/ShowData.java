package jdbc_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowData {
    // Method to create table
    public static void showData() {
        try {
            String url = "jdbc:mysql://localhost:3306/revision";
            String username = "root";
            String password = "4283";

            // make connection with a database
            Connection conn = DriverManager.getConnection(url, username, password);

            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM student";
            ResultSet resultSet = stmt.executeQuery(query);

            // printing data
            while (resultSet.next()) {
                System.out.println("Student Name: " + resultSet.getString(1));
                System.out.println("Student Gmail: " + resultSet.getString(2));
                System.out.println("Student College Name: " + resultSet.getString(3));
                System.out.println("---------------------------------------------------------------");
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ShowData.showData();
    }
}
