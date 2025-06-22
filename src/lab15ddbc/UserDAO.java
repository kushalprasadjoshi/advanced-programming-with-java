package lab15ddbc;

import java.sql.*;

/**
 * Handles user-related database operations such as insert, check existence, and delete.
 */
public class UserDAO {
    /**
     * Inserts a new user into the 'users' table.
     * @param id User ID
     * @param name User name
     * @param email User email
     * @param password User password
     */
    public void insertUser(String id, String name, String email, String password) {
        String sql = "INSERT INTO users (id, name, email, password) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseHelper.getConnection("mydatabase");
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

    /**
     * Checks if a user exists in the 'users' table by ID.
     * @param id User ID to check
     * @return true if user exists, false otherwise
     */
    public boolean userExists(String id) {
        String sql = "SELECT id FROM users WHERE id = ?";
        try (Connection conn = DatabaseHelper.getConnection("mydatabase");
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, id);      // Set user ID to check
            ResultSet rs = preparedStatement.executeQuery(); // Execute query
            return rs.next();            // Return true if user exists
        } catch (SQLException e) {
            e.printStackTrace();         // Print stack trace if an error occurs
            return false;
        }
    }
}
