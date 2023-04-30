/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author NGUYEN PHUC NAM
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class InsertUpdateDeleyte {
    public static void setData(String Query, String msg){
        Connection con = null;
        Statement st = null;
        try{
            
        }catch(Exception e){
            
        }
        finally{
            try {
                con = (Connection) ConnectionProvider.getConnection();
                st = con.createStatement();
                st.executeUpdate(Query);
                if(!msg.equals(""))
                    JOptionPane.showMessageDialog(null, msg);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
}
