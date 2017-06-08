package edu.softwarica00163111.controller;

import edu.softwarica00163111.dbconnection.DBConnection;
import edu.softwarica00163111.model.Vendor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bikas
 */
public class VendorController {

    private Connection con = null;
    private PreparedStatement ps;
    private ResultSet rs;

    public VendorController() {
        if (con == null) {
            con = DBConnection.getConnection();
        }
    }

    public int addVendor(Vendor vr) {
        int added = 0;
        String query = "insert into vendor(ID,Name,Address,ContactNo,Email,BookPurchased,Author,PurchasedDate,Quantity,Rate,Discount,TotalAmount) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, null);
            ps.setString(2, vr.getName());
            ps.setString(3, vr.getAddress());
            ps.setString(4, vr.getContactNo());
            ps.setString(5, vr.getEmail());
            ps.setString(6, vr.getBookPurchased());
            ps.setString(7, vr.getAuthor());
            ps.setString(8, vr.getPurchasedDate());
            ps.setInt(9, vr.getQuantity());
            ps.setFloat(10, vr.getRate());
            ps.setFloat(11, vr.getDiscount());
            ps.setFloat(12, vr.getTotalAmount());
            added = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return added;
    }

    public ResultSet viewAllVendor() {
        ResultSet rs = null;
        String query = "select * from vendor";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
}
