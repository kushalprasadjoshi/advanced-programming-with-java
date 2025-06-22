package chap05database;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public static void main(String[] args) throws Exception {
        // Load and register the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the database
        // Replace "Your Password" with the actual MySQL password
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/db", "root", "Your Password"
        );

        // SQL query to fetch all data from the 'user' table
        String sql = "SELECT * FROM users";

        // Prepare and execute the query
        PreparedStatement pre = con.prepareStatement(sql);
        ResultSet rs = pre.executeQuery();

        // Get metadata from the result set
        ResultSetMetaData rm = rs.getMetaData();
        int count = rm.getColumnCount();

        // Print table name (based on the first column)
        System.out.println("Table Name: " + rm.getTableName(1));
        System.out.println("--------------------------------------------------");

        // Print header
        System.out.printf("%-20s %-20s\n", "Column Name", "Column Type");
        System.out.println("--------------------------------------------------");

        // Print metadata for each column (1-based index)
        for (int i = 1; i <= count; i++) {
            String columnName = rm.getColumnName(i);
            String columnType = rm.getColumnTypeName(i);
            System.out.printf("%-20s %-20s\n", columnName, columnType);
        }

        // Close resources
        rs.close();
        pre.close();
        con.close();
    }
}
