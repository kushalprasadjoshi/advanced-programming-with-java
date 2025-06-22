package chap05database;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        // Load and register the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the database
        // Replace "Your Password" with your actual MySQL root password
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/db", "root", "Your Password"
        );

        // SQL query with placeholders (?) for values to be inserted
        String query = "INSERT INTO users VALUES(?, ?, ?, ?)";

        // Create a PreparedStatement to safely inject parameters into the query
        PreparedStatement preparedStatement = con.prepareStatement(query);

        // Set the values for each placeholder
        // NOTE: The indices must be unique (1 through 4)
        preparedStatement.setString(1, "101");              // id
        preparedStatement.setString(2, "ABC");              // name
        preparedStatement.setString(3, "abc@gmail.com");    // email
        preparedStatement.setString(4, "ABC");              // password

        // Execute the query (i.e., insert the data)
        preparedStatement.execute();

        // Clean up: close the statement and connection
        preparedStatement.close();
        con.close();

        // Confirmation message
        System.out.println("Data added.");
    }
}
