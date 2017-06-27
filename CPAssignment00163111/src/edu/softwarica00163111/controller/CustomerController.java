/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softwarica00163111.controller;

import edu.softwarica00163111.dbconnection.DBConnection;
import edu.softwarica00163111.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bikas
 */
public class CustomerController {

    private Connection con = null;
    private PreparedStatement ps;
    private ResultSet rs;

    public CustomerController() {
        if (con == null) {
            con = DBConnection.getConnection();
        }
    }

    public int addCustomer(Customer customer) {
        int customerAdded = 0;
        String query = "insert into customer(ID,Name,Address,ContactNo,BookPurchased,PurchaseDate,Quantity,Rate,Discount,TotalAmount) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, null);
            ps.setString(2, customer.getName());
            ps.setString(3, customer.getAddress());
            ps.setString(4, customer.getContactNo());
            ps.setString(5, customer.getBookPurchased());
            ps.setString(6, customer.getPurchaseDate());
            ps.setInt(7, customer.getQuantity());
            ps.setFloat(8, customer.getRate());
            ps.setFloat(9, customer.getDiscount());
            ps.setFloat(10, customer.getTotalAmount());
            customerAdded = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return customerAdded;
    }

    public ResultSet viewAllCustomer() {
        ResultSet rs = null;
        String query = "select * from customer";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }
}
