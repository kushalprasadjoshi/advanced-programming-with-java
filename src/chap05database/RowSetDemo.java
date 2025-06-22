package chap05database;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
    public static void main(String[] args) throws Exception {
        // Create a CachedRowSet instance using the standard RowSetProvider
        CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();

        // Set database connection parameters
        rowSet.setUrl("jdbc:mysql://localhost/db");          // Replace 'db' with your database name
        rowSet.setUsername("root");                          // Replace with your username
        rowSet.setPassword("Your Password");                 // Replace with your actual password

        // Set the SQL command to execute
        rowSet.setCommand("SELECT * FROM users");

        // Execute the SQL command and cache the result
        rowSet.execute();

        // Display the result set
        System.out.printf("%-5s %-15s %-25s %-15s\n", "ID", "Name", "Email", "Password");
        System.out.println("---------------------------------------------------------------");

        while (rowSet.next()) {
            String id = rowSet.getString("id");
            String name = rowSet.getString("name");
            String email = rowSet.getString("email");
            String password = rowSet.getString("password");
            System.out.printf("%-5s %-15s %-25s %-15s\n", id, name, email, password);
        }

        // Close the CachedRowSet
        rowSet.close();
    }
}
