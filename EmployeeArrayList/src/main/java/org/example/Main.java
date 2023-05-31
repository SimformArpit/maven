package org.example;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Simform@123";
        Product product = new Product(105 , "Book" );
        int id = product.getId();
        String name = product.getName();

        try {
            // Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);
            // Connection successful
            System.out.println("Connected to the MySQL database!");
            // Perform database operations
            // SQL INSERT statement
            String sql = "INSERT INTO mytable (id, name ) VALUES (? , ?)";
            // Prepare the statement
            PreparedStatement statement = connection.prepareStatement(sql);
            // Set parameter values
            statement.setInt(1, id);
            statement.setString(2, name);

            // Execute the statement
            int rowsAffected = statement.executeUpdate();
            // Check if the insertion was successful
            if (rowsAffected > 0) {
                System.out.println("Inserting Product like => ");
                System.out.println("id : " + id);
                System.out.println("name : " + name );
                System.out.println("Product inserted successfully!");
            } else {
                System.out.println("Failed to insert product.");
            }
            // Close the resources
            statement.close();
            connection.close();
            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
