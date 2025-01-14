/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casier;

import java.sql.Connection;
import java.sql.SQLException;

public class testkoneksi {
    public static void main(String[] args) {
  try {
            // Pastikan memanggil metode `konek()` dari kelas `connection`
            Connection conn = connection.konek(); 
            if (conn != null) {
                System.out.println("Koneksi berhasil!");
            } else {
                System.out.println("Koneksi gagal!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Koneksi gagal!");
        }
    }
}
