package jdbc_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    // Method to create table
    public static void insertData() {
        try {
            String url = "jdbc:mysql://localhost:3306/revision";
            String username = "root";
            String password = "4283";

            // make connection with database
            Connection conn = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO student(name, gmail, college) VALUES (?, ?, ?)";
            PreparedStatement prepStmt = conn.prepareStatement(query);

            // inserting single data a time
//            prepStmt.setString(1, "Santosh Shah");
//            prepStmt.setString(2, "shasantosh679@gmail.com");
//            prepStmt.setString(3, "Vedas College");

            // inserting multiple data a time
            Object[][] data = {
                    {"Ravi Shah", "ravi@gmail.com", "GHP college"},
                    {"Maneesh Shah", "maneesh@gmail.com", "KDC college"},
                    {"Rohit Shah", "rohit@gmail.com", "peac zone academy college"}
            };

            for (Object[] row : data) {
                prepStmt.setString(1, row[0].toString());
                prepStmt.setString(2, row[1].toString());
                prepStmt.setString(3, row[2].toString());
                prepStmt.addBatch();
            }
            prepStmt.execute();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        InsertData.insertData();
    }
}
