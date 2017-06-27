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
    private String vendorName;
    private String bookPurchased;

    public VendorController() {
        if (con == null) {
            con = DBConnection.getConnection();
        }
    }

    /*public VendorController(String vendor, String book) {
     this.vendorName = vendor;
     this.bookPurchased = book;
     }*/

    public boolean checkBook(Vendor vendor) {
        boolean bookExists = false;
        String query = "select * from vendor where BookPurchased=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, vendor.getBookPurchased());
            rs = ps.executeQuery();
            while (rs.next()) {
                bookExists = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return bookExists;
    }

    public int addVendor(Vendor vendor) {
        int vendorAdded = 0;
        String query = "insert into vendor(ID,Name,Address,ContactNo,Email,BookPurchased,PurchaseDate,Author,Genre,Quantity,Rate,Discount,TotalAmount) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, null);
            ps.setString(2, vendor.getName());
            ps.setString(3, vendor.getAddress());
            ps.setString(4, vendor.getContactNo());
            ps.setString(5, vendor.getEmail());
            ps.setString(6, vendor.getBookPurchased());
            ps.setString(7, vendor.getPurchaseDate());
            ps.setString(8, vendor.getAuthor());
            ps.setString(9, vendor.getGenre());
            ps.setInt(10, vendor.getQuantity());
            ps.setFloat(11, vendor.getRate());
            ps.setFloat(12, vendor.getDiscount());
            ps.setFloat(13, vendor.getTotalAmount());
            vendorAdded = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return vendorAdded;
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

    public ResultSet editVendor(String vendor, String book) {
        this.vendorName = vendor;
        this.bookPurchased = book;
        ResultSet rs = null;
        String query = "select * from vendor where Name=? and BookPurchased=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, vendorName);
            ps.setString(2, bookPurchased);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
}
