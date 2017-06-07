package edu.softwarica00163111.controller;

import edu.softwarica00163111.dbconnection.DBConnection;
import edu.softwarica00163111.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bikas
 */
public class UserController {

    private Connection con = null;
    private PreparedStatement ps;
    private ResultSet rs;

    public UserController() {
        if (con == null) {
            con = DBConnection.getConnection();
        }
    }

    public boolean authenticate(User um) {
        boolean isAuthenticate = false;
        String query = "select * from user where Username=? and Password=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, um.getUsername());
            ps.setString(2, um.getPassword());
            rs = ps.executeQuery();
            while (rs.next()) {
                isAuthenticate = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return isAuthenticate;
    }

    public int updateUser(User um) {
        int updated = 0;
        String query = "update user set Username=?, Password=? where ID=1";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, um.getUsername());
            ps.setString(2, um.getPassword());
            updated=ps.executeUpdate();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return updated;
    }
}
