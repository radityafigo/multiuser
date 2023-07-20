/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginmultiuser;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MM-52
 */ 
public class KoneksiDb {
    Connection koneksi=null;
        public static Connection KoneksiDb(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
                    return koneksi;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
        }
}
