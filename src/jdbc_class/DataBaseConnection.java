package jdbc_class;


import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    // Method to connect a database with mysql databasse
    public static void connectDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3036";
            String username = "root";
            String password = "4283";

            // now connect them with a database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

//    public static void main(String[] args) {
//        DatabaseConnection.databaseConnection();
//    }
}
