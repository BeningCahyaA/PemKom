/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casier;

import java.sql.Connection;
import java.sql.SQLException;

public class testkoneksi {
    public static void main(String[] args) {
        Connection conn = null;
        
        try {
            // Call the connection method from the Koneksi class
            conn = connection.getConnection();
            
            // Check if connection was successful
            if (conn != null) {
                System.out.println("Connection successful!");
            } else {
                System.out.println("Failed to connect.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the connection if it was opened
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
