package chap05database;

import java.sql.*;

public class ResultSetDemo {
    public static void main(String[] args) throws Exception {
        // Load and register the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection to the MySQL database
        // Make sure to replace "Your Password" with your actual MySQL password
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/db", "root", "Your Password"
        );

        // SQL query to fetch all rows from the users table
        String sql = "SELECT * FROM users";

        // Create a PreparedStatement to execute the query
        PreparedStatement pre = conn.prepareStatement(sql);

        // Execute the query and get the result set
        ResultSet rs = pre.executeQuery();

        // Print the table header with formatting
        System.out.printf("%-5s %-15s %-25s %-15s\n", "ID", "Name", "Email", "Password");
        System.out.println("---------------------------------------------------------------");

        // Iterate through the result set and print each record in a formatted way
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String password = rs.getString("password");

            System.out.printf("%-5s %-15s %-25s %-15s\n", id, name, email, password);
        }

        // Close the ResultSet, PreparedStatement, and Connection
        rs.close();
        pre.close();
        conn.close();
    }
}
