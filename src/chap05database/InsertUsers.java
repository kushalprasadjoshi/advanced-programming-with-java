package chap05database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUsers {
    public static void insertUser(String id, String name, String email, String password) {
        String sql = "INSERT INTO users (id, name, email, password) VALUES (?, ?, ?, ?)";
        try (Connection conn = InitialSetup.getConnection("db");
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, id);      // Set user ID
            preparedStatement.setString(2, name);    // Set user name
            preparedStatement.setString(3, email);   // Set user email
            preparedStatement.setString(4, password);// Set user password
            preparedStatement.execute();       // Execute insert statement
        } catch (SQLException e) {
            e.printStackTrace();         // Print stack trace if an error occurs
        }
    }

    public static void main(String[] args) {
        insertUser("102", "BCD", "bcd@gmail.com", "BCD");
        insertUser("103", "CDE", "cde@gmail.com", "CDE");
        insertUser("104", "DEF", "def@gmail.com", "DEF");
        insertUser("105", "EFG", "efg@gmail.com", "EFG");
        insertUser("106", "FGH", "fgh@gmail.com", "FGH");
        insertUser("107", "GHI", "ghi@gmail.com", "GHI");

        System.out.println("Data added successfully!");
    }
}
