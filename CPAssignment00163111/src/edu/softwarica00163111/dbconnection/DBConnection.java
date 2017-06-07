package edu.softwarica00163111.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bikas
 */
public class DBConnection {

    private static Connection con = null;

    public static Connection getConnection() {
        if (con == null) {
            connectToDB();
        }
        return con;
    }

    private static void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver could not be loaded!");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cpassignment00163111", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sorry, unable to connect to database!");
        }
    }
}
